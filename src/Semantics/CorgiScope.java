package Semantics;

import Representations.CorgiFunction;
import Representations.CorgiValue;

import java.util.HashMap;

public class CorgiScope implements IScope {

    private HashMap<String, CorgiValue> variables;

    private HashMap<String, CorgiFunction> functions;

    private LocalScope parentLocalScope; //represents the parent local scope which is the local scope covered by the main() function. Other classes may not contain this.

    public CorgiScope() {
        this.variables = new HashMap<>();
        this.functions = new HashMap<>();
    }

    /*
     * Sets the parent local scope which is instantiated if this class contains a main function.
     */
    public void setParentLocalScope(LocalScope localScope) {
        this.parentLocalScope = localScope;
    }

    @Override
    /*
     * A class scope is automatically the parent of local scopes.
     * (non-Javadoc)
     * @see com.neildg.mobiprog.semantics.symboltable.scopes.IScope#isParent()
     */
    public boolean isParent(){
        return true;
    }

    /*
     * Attempts to add an empty variable based from keywords
     */
    public void addEmptyVariable(String primitiveTypeString, String identifierString) {

        //create empty mobi value
        CorgiValue corgiValue = CorgiValue.createEmptyVariable(primitiveTypeString);

        this.variables.put(identifierString, corgiValue);
    }

    /*
     * Attempts to add an initialized variable mobi value
     */
    public void addInitializedVariable(String primitiveTypeString, String identifierString, String valueString) {
        this.addEmptyVariable( primitiveTypeString, identifierString);

        CorgiValue corgiValue = this.variables.get(identifierString);

        corgiValue.setValue(valueString);

    }

    public CorgiValue getVariable(String identifier){
        if(this.containsVariable(identifier)) {
            return this.variables.get(identifier);
        }
        else {
            System.err.println(identifier + " is not found"); //TODO Change to IDE
            return null;
        }
    }

    public void addFunction(String identifier, CorgiFunction corgiFunction){
        this.functions.put(identifier, corgiFunction);
        //Console.log(LogType.DEBUG, "Created private function " +identifier+ " with return type " +mobiFunction.getReturnType());
    }


    public void addCorgiValue(String identifier, CorgiValue corgiValue) {
        this.variables.put(identifier, corgiValue);
    }

    public CorgiFunction getFunction(String identifier) {
        if(this.containsFunction(identifier)) {
            return this.functions.get(identifier);
        }
        else {
            System.err.println(identifier + " is not found"); //TODO Change to IDE
            return null;
        }
    }


    public CorgiFunction searchFunction(String identifier) {
        if(this.containsFunction(identifier)) {
            return this.functions.get(identifier);
        }
        else {
            //Log.e(TAG, identifier + " is not found in " +this.className);
            System.err.println(identifier + " is not found"); //TODO Change to IDE
            return null;
        }
    }

    public boolean containsFunction(String identifier) {
        return this.functions.containsKey(identifier);
    }

    @Override
    public CorgiValue searchVariableIncludingLocal(String identifier) {
        CorgiValue value;
        if(this.containsVariable(identifier)) {
            value = this.getVariable(identifier);
        }
        else {
            value = LocalScopeHandler.searchVariableInLocalIterative(identifier, this.parentLocalScope);
        }

        return value;
    }

    public CorgiValue searchVariable(String identifier) {
        CorgiValue value = null;
        if(this.containsVariable(identifier)) {
            value = this.getVariable(identifier);
        }

        return value;
    }

    public boolean containsVariable(String identifier) {
        return this.variables.containsKey(identifier);
    }

    /*
     * Resets all stored variables. This is called after the execution manager finishes
     */
    public void reset() {
        this.variables = new HashMap<>();
        this.functions = new HashMap<>();
    }
}
