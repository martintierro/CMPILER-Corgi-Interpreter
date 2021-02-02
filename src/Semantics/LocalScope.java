package Semantics;

import Representations.CorgiValue;

import java.util.ArrayList;
import java.util.HashMap;

public class LocalScope implements IScope {

    private IScope parentScope;
    private ArrayList<LocalScope> childScopeList = null;

    private HashMap<String, CorgiValue> localVariables = new HashMap<String, CorgiValue>();

    public LocalScope() {
        this.parentScope = null;
    }

    public LocalScope(IScope parentScope) {
        this.parentScope = parentScope;
    }

    /*
     * Initialize the moment a variable is about to be placed.
     */
    public void initializeLocalVariableMap() {
        if(this.localVariables == null) {
            this.localVariables = new HashMap<String, CorgiValue>();
        }
    }

    /*
     * Initialize the child list the moment a child scope is about to be placed
     */
    public void initializeChildList() {
        if(this.childScopeList == null) {
            this.childScopeList = new ArrayList<LocalScope>();
        }
    }

    public void setParent(IScope parentScope) {
        this.parentScope = parentScope;
    }

    public void addChild(LocalScope localScope) {
        this.initializeChildList();

        this.childScopeList.add(localScope);
    }

    public boolean isParent() {
        return (this.parentScope == null);
    }

    public IScope getParent() {
        return this.parentScope;
    }

    public int getChildCount() {
        if(this.childScopeList != null)
            return this.childScopeList.size();
        else
            return 0;
    }

    public LocalScope getChildAt(int index) {
        if(this.childScopeList != null)
            return this.childScopeList.get(index);
        else
            return null;
    }

    @Override
    public CorgiValue searchVariableIncludingLocal(String identifier) {
        if(this.containsVariable(identifier)) {
            return this.localVariables.get(identifier);
        }
        else {
            System.err.println(identifier + " not found!");
            return null;
        }
    }

    public boolean containsVariable(String identifier) {
        if(this.localVariables!= null && this.localVariables.containsKey(identifier)) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
     * Adds an empty variable based from keywords
     */
    public void addEmptyVariable(String primitiveTypeString, String identifierString) {
        this.initializeLocalVariableMap();

        CorgiValue corgiValue = CorgiValue.createEmptyVariable(primitiveTypeString);
        this.localVariables.put(identifierString, corgiValue);
    }

    /*
     * Adds an initialized variable based from keywords
     */
    public void addInitializedVariable(String primitiveTypeString, String identifierString, String valueString) {
        this.initializeLocalVariableMap();

        this.addEmptyVariable(primitiveTypeString, identifierString);
        CorgiValue corgiValue = this.localVariables.get(identifierString);
        corgiValue.setValue(valueString);
    }

    public void addCorgiValue(String identifier, CorgiValue corgiValue) {
        this.initializeLocalVariableMap();
        this.localVariables.put(identifier, corgiValue);
    }

    /*
     * Returns the depth of this local scope.
     */
    public int getDepth() {
        int depthCount = -1;

        LocalScope scope =  this;

        while(scope != null) {
            depthCount++;

            IScope abstractScope = scope.getParent();

            if(abstractScope instanceof CorgiScope)
                break;

            scope = (LocalScope) abstractScope;
        }


        return depthCount;
    }

}
