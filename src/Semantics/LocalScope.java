package Semantics;

import Representations.CorgiValue;

import java.util.ArrayList;
import java.util.HashMap;

public class LocalScope implements IScope{

    private IScope parentScope;
    private ArrayList<LocalScope> childScopeList = null;

    private HashMap<String, CorgiValue> localVariables = null;

    public LocalScope(){
        this.parentScope = null;
        localVariables = new HashMap<>();
        childScopeList = new ArrayList<>();
    }

    public LocalScope(IScope parentScope){
        this.parentScope = parentScope;
        localVariables = new HashMap<>();
        childScopeList = new ArrayList<>();
    }

    public void setParent(IScope parentScope){
        this.parentScope = parentScope;
    }

    public void addChild(LocalScope localScope){
        this.childScopeList.add(localScope);
    }

    @Override
    public boolean isParent(){
        return (this.parentScope == null);
    }

    public IScope getParent(){
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
        if(this.containsVariable(identifier)){
            return this.localVariables.get(identifier);
        }else{
            System.err.println(identifier + " not found!");
            return null;
        }
    }

    public boolean containsVariable(String identifier) {
        return this.localVariables != null && this.localVariables.containsKey(identifier);
    }

    public void addEmptyVariable(String primitiveTypeString, String identifierString){
        CorgiValue value = CorgiValue.createEmptyVariable(primitiveTypeString);
        this.localVariables.put(identifierString, value);
    }

    public void addInitializedVariable(String primitiveTypeString, String identifierString, String valueString){
        this.addEmptyVariable(primitiveTypeString, identifierString);
        CorgiValue corgiValue = this.localVariables.get(identifierString);
        corgiValue.setValue(valueString);
    }

    public void addCorgiValue(String identifier, CorgiValue corgiValue) {
        this.localVariables.put(identifier, corgiValue);
    }

    public int getDepth(){
        int depthCount = -1;
        LocalScope scope = (LocalScope) this;
        while(scope != null){
            depthCount++;
            IScope abstractScope = scope.getParent();
            scope = (LocalScope) abstractScope;
        }
        return depthCount;
    }

}
