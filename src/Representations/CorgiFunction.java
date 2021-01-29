package Representations;

import Commands.ControlTypeEnum;
import Commands.ICommand;
import Commands.IControlledCommand;
import ErrorChecker.TypeChecker;
import Execution.ExecutionManager;
import Execution.ExecutionMonitor;
import Execution.FunctionTracker;
import GeneratedAntlrClasses.CorgiLexer;
import GeneratedAntlrClasses.CorgiParser;
import Semantics.LocalScope;
import Utlities.KeywordRecognizer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;


public class CorgiFunction implements IControlledCommand {

    private String functionName;
    private List<ICommand> commandList;

    private LocalScope parentLocalScope;

    private LinkedHashMap<String, CorgiValue> parameterValues;	//the list of parameters accepted that follows the 'call-by-value' standard.
    private CorgiValue returnValue; //the return value of the function. null if it's a void type
    private FunctionType returnType = FunctionType.VOID_TYPE; //the return type of the function

    public CorgiFunction(){
        this.commandList = new ArrayList<>();
        this.parameterValues = new LinkedHashMap<>();
    }

    public void setParentLocalScope(LocalScope localScope) {
        this.parentLocalScope = localScope;
    }

    public LocalScope getParentLocalScope() {
        return this.parentLocalScope;
    }

    public void setReturnType(FunctionType functionType) {
        this.returnType = functionType;

        //create an empty mobi value as a return value
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

        CorgiArray corgiArray = (CorgiArray) corgiValue.getValue();

        CorgiArray newArray = new CorgiArray(corgiArray.getArrayType(), identifier);
        CorgiValue newValue = new CorgiValue(newArray, PrimitiveType.ARRAY);

        newArray.initializeSize(corgiArray.getSize());

        for(int i = 0; i < newArray.getSize(); i++) {
            newArray.updateValueAt(corgiArray.getValueAt(i), i);
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

        CorgiValue mobiValue = this.getParameterAt(index);
        TypeChecker typeChecker = new TypeChecker(mobiValue, exprCtx);
        typeChecker.verify();
    }

    public void addParameter(String identifierString, CorgiValue corgiValue) {
        this.parameterValues.put(identifierString, corgiValue);
        System.out.println(this.functionName + " added an empty parameter " +identifierString+ " type " +corgiValue.getPrimitiveType()); //TODO Make IDE
    }

    public boolean hasParameter(String identifierString) {
        return this.parameterValues.containsKey(identifierString);
    }

    public CorgiValue getParameter(String identifierString) {
        if(this.hasParameter(identifierString)) {
            return this.parameterValues.get(identifierString);
        }
        else {
            System.err.println(identifierString + " not found in parameter list");//TODO Change to IDE
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

        System.err.println(index + " has exceeded parameter list.");//TODO Change to IDE
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

        System.err.println(index + " has exceeded parameter list.");//TODO Change to IDE
        return null;
    }

    public CorgiValue getReturnValue() {
        if(this.returnType == FunctionType.VOID_TYPE) {
            System.out.println(this.functionName + " is a void function. Null mobi value is returned");//TODO Change to IDE
            return null;
        }
        else {
            return this.returnValue;
        }
    }

    @Override
    public void addCommand(ICommand command) {
        this.commandList.add(command);
        //Console.log("Command added to " +this.functionName);
    }

    @Override
    public void execute() {
        ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();
        FunctionTracker.getInstance().enterFunction(this);
        try {
            for(ICommand command : this.commandList) {
                executionMonitor.tryExecution();
                command.execute();
            }

        } catch(InterruptedException e) {
            //Log.e(TAG, "Monitor block interrupted! " +e.getMessage());
            System.err.println("Monitor block interrupted" + e.getMessage());
        }

        FunctionTracker.getInstance().exitFunction();
    }

    @Override
    public ControlTypeEnum getControlType() {
        return ControlTypeEnum.FUNCTION_TYPE;
    }

    public static FunctionType identifyFunctionType(String primitiveTypeString){
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
