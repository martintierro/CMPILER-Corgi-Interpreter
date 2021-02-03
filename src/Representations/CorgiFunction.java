package Representations;

import Commands.ControlTypeEnum;
import Commands.ICommand;
import Commands.IControlledCommand;
import ErrorChecker.TypeChecker;
import Execution.ExecutionManager;
import Execution.ExecutionMonitor;
import Execution.FunctionTracker;
import GeneratedAntlrClasses.CorgiParser;
import Semantics.LocalScope;
import Semantics.CorgiScope;
import Utlities.KeywordRecognizer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;


public class CorgiFunction implements IControlledCommand{

    private String functionName;
    private List<ICommand> commandSequences; //the list of commands execution by the function

    private LocalScope parentLocalScope; //refers to the parent local scope of this function.

    private LinkedHashMap<String, CorgiScope> parameterReferences; //the list of parameters accepted that follows the 'call-by-reference' standard.
    private LinkedHashMap<String, CorgiValue> parameterValues;	//the list of parameters accepted that follows the 'call-by-value' standard.
    private CorgiValue returnValue; //the return value of the function. null if it's a void type
    private FunctionType returnType = FunctionType.VOID_TYPE; //the return type of the function

    public CorgiFunction() {
        this.commandSequences = new ArrayList<ICommand>();
        this.parameterValues = new LinkedHashMap<String,CorgiValue>();
        this.parameterReferences = new LinkedHashMap<String, CorgiScope>();
    }

    public void setParentLocalScope(LocalScope localScope) {
        this.parentLocalScope = localScope;
    }

    public LocalScope getParentLocalScope() {
        return this.parentLocalScope;
    }

    public void setReturnType(FunctionType functionType) {
        this.returnType = functionType;

        //create an empty corgi value as a return value
        switch(this.returnType) {
            case BOOLEAN_TYPE: this.returnValue = new CorgiValue(true, PrimitiveType.BOOLEAN); break;
            case CHAR_TYPE: this.returnValue = new CorgiValue(' ', PrimitiveType.CHAR); break;
            case INT_TYPE: this.returnValue = new CorgiValue(0, PrimitiveType.INT); break;
            case FLOAT_TYPE: this.returnValue = new CorgiValue(0, PrimitiveType.FLOAT); break;
            case STRING_TYPE: this.returnValue = new CorgiValue("", PrimitiveType.STRING); break;
            default:break;
        }
    }

    public FunctionType getReturnType() {
        return this.returnType;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionName() {
        return this.functionName;
    }

    /*
     * Maps parameters by values, which means that the value is copied to its parameter listing
     */
    public void mapParameterByValue(String... values) {
        for(int i = 0; i < values.length; i++) {
            CorgiValue corgiValue = this.getParameterAt(i);
            corgiValue.setValue(values[i]);
        }
    }

    public void mapParameterByValueAt(String value, int index) {
        if(index >= this.parameterValues.size()) {
            return;
        }

        CorgiValue corgiValue = this.getParameterAt(index);
        corgiValue.setValue(value);
    }

    public void mapArrayAt(CorgiValue corgiValue, int index, String identifier) {
        if(index >= this.parameterValues.size()) {
            return;
        }

        CorgiArray mobiArray = (CorgiArray) corgiValue.getValue();

        CorgiArray newArray = new CorgiArray(mobiArray.getPrimitiveType(), identifier);
        CorgiValue newValue = new CorgiValue(newArray, PrimitiveType.ARRAY);

        newArray.initializeSize(mobiArray.getSize());

        for(int i = 0; i < newArray.getSize(); i++) {
            newArray.updateValueAt(mobiArray.getValueAt(i), i);
        }

        this.parameterValues.put(this.getParameterKeyAt(index), newValue);

    }

    public int getParameterValueSize() {
        return this.parameterValues.size();
    }

    public void verifyParameterByValueAt(CorgiParser.ExpressionContext exprCtx, int index) {
        if(index >= this.parameterValues.size()) {
            return;
        }

        CorgiValue corgiValue = this.getParameterAt(index);
        TypeChecker typeChecker = new TypeChecker(corgiValue, exprCtx);
        typeChecker.verify();
    }

    /*
     * Maps parameters by reference, in this case, accept a class scope.
     */
    public void mapParameterByReference(CorgiScope... classScopes) {
        System.err.println("Mapping of parameter by reference not yet supported.");
    }

    public void addParameter(String identifierString, CorgiValue corgiValue) {
        this.parameterValues.put(identifierString, corgiValue);
      //  Console.log(LogType.DEBUG, this.functionName + " added an empty parameter " +identifierString+ " type " +corgiValue.getPrimitiveType());
    }

    public boolean hasParameter(String identifierString) {
        return this.parameterValues.containsKey(identifierString);
    }
    public CorgiValue getParameter(String identifierString) {
        if(this.hasParameter(identifierString)) {
            return this.parameterValues.get(identifierString);
        }
        else {
            System.err.println(identifierString + " not found in parameter list");
            return null;
        }
    }

    public CorgiValue getParameterAt(int index) {
        int i = 0;

        for(CorgiValue corgiValue : this.parameterValues.values()) {
            if(i == index) {
                return corgiValue;
            }

            i++;
        }

        System.err.println(index + " has exceeded parameter list.");
        return null;
    }

    private String getParameterKeyAt(int index) {
        int i = 0;

        for(String key : this.parameterValues.keySet()) {
            if(i == index) {
                return key;
            }

            i++;
        }

        System.err.println(index + " has exceeded parameter list.");
        return null;
    }

    public CorgiValue getReturnValue() {
        if(this.returnType == FunctionType.VOID_TYPE) {
//            Console.log(LogType.DEBUG, this.functionName + " is a void function. Null mobi value is returned");
            return null;
        }
        else {
            return this.returnValue;
        }
    }

    @Override
    public void addCommand(ICommand command) {
        this.commandSequences.add(command);
        //Console.log("Command added to " +this.functionName);
    }

    @Override
    public void execute() {
        ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();
        FunctionTracker.getInstance().reportEnterFunction(this);
        try {
            for(ICommand command : this.commandSequences) {
                executionMonitor.tryExecution();
                command.execute();
            }

        } catch(InterruptedException e) {
            System.err.println("Monitor block interrupted! " +e.getMessage());
        }

        FunctionTracker.getInstance().reportExitFunction();
    }

    @Override
    public ControlTypeEnum getControlType() {
        return ControlTypeEnum.FUNCTION_TYPE;
    }

    public static FunctionType identifyFunctionType(String primitiveTypeString) {

        if(KeywordRecognizer.matchesKeyword(KeywordRecognizer.PRIMITIVE_TYPE_BOOLEAN, primitiveTypeString)) {
            return FunctionType.BOOLEAN_TYPE;
        }

        else if(KeywordRecognizer.matchesKeyword(KeywordRecognizer.PRIMITIVE_TYPE_CHAR, primitiveTypeString)) {
            return FunctionType.CHAR_TYPE;
        }
        else if(KeywordRecognizer.matchesKeyword(KeywordRecognizer.PRIMITIVE_TYPE_FLOAT, primitiveTypeString)) {
            return FunctionType.FLOAT_TYPE;
        }
        else if(KeywordRecognizer.matchesKeyword(KeywordRecognizer.PRIMITIVE_TYPE_INT, primitiveTypeString)) {
            return FunctionType.INT_TYPE;
        }

        else if(KeywordRecognizer.matchesKeyword(KeywordRecognizer.PRIMITIVE_TYPE_STRING, primitiveTypeString)) {
            return FunctionType.STRING_TYPE;
        }

        return FunctionType.VOID_TYPE;
    }
}
