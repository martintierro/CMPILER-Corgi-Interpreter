package Semantics;

import Representations.CorgiFunction;
import Representations.CorgiValue;

import java.util.HashMap;

public class MainScope implements IScope {



    private HashMap<String, CorgiValue> variables;

    private HashMap<String, CorgiFunction> functions;

    private LocalScope parentLocalScope; //represents the parent local scope which is the local scope covered by the main() function. Other classes may not contain this.

    public MainScope(){
        this.variables = new HashMap<>();
        this.functions = new HashMap<>();
    }


    /*
     * Attempts to add an empty variable based from keywords
     */
    public void addEmptyVariable(String primitiveTypeString, String identifierString) {
        //create empty corgi value
        CorgiValue corgiValue = CorgiValue.createEmptyVariable(primitiveTypeString);

        this.variables.put(identifierString, corgiValue);

    }

    /*
     * Attempts to add an initialized variable mobi value
     */
    public void addInitializedVariable(String primitiveTypeString, String identifierString, String valueString) {

        this.addEmptyVariable(primitiveTypeString, identifierString);
        CorgiValue value = this.variables.get(identifierString);
        value.setValue(valueString);

    }

    public CorgiValue getVariable(String identifier){
        if(this.containsVariable(identifier)){
            return this.variables.get(identifier);
        } else{
            System.err.println(identifier + " is not found."); //TODO: Change to IDE
            return null;
        }
    }

    public void addFunction(String identifier, CorgiFunction corgiFunction){
        this.functions.put(identifier, corgiFunction);
    }

    public void addCorgiValue(String identifier, CorgiValue corgiValue){
        this.variables.put(identifier, corgiValue);
    }

    public CorgiFunction getFunction(String identifier){
        if(this.containsFunction(identifier)){
            return this.functions.get(identifier);
        } else{
            System.err.println(identifier + " is not found."); //TODO: Change to IDE
            return null;
        }
    }

    public boolean containsFunction(String identifier){
        return this.functions.containsKey(identifier);
    }


    @Override
    public CorgiValue searchVariableIncludingLocal(String identifier) {
        if(this.containsVariable(identifier)){
            return this.getVariable(identifier);
        } else{
            return null;
        }
    }


    public boolean containsVariable(String identifier) {
        return this.variables.containsKey(identifier);
    }
    /*
     * Resets all stored variables. This is called after the execution manager finishes
     */
    public void resetValues(){
        CorgiValue[] corgiValues = this.variables.values().toArray(new CorgiValue[this.variables.size()]);

        for (CorgiValue value: corgiValues) {
            value.reset();
        }

    }

    @Override
    public boolean isParent(){
        return true;
    }
}
