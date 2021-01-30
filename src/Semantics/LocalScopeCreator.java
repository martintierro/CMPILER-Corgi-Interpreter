package Semantics;

import Representations.CorgiValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LocalScopeCreator {
    private static LocalScopeCreator instance = null;

    public static LocalScopeCreator getInstance(){
        if(instance==null){
            instance = new LocalScopeCreator();
        }
        return instance;
    }

    private LocalScope activeLocalScope = null;

    private LocalScopeCreator(){

    }

    public LocalScope openLocalScope() {
        if(this.activeLocalScope == null) {
            this.activeLocalScope = new LocalScope();
        }
        else {
            LocalScope childLocalScope = new LocalScope();
            childLocalScope.setParent(this.activeLocalScope);//point this current local scope as parent
            this.activeLocalScope.addChild(childLocalScope); //add the new scope as child for this current local scope
            this.activeLocalScope = childLocalScope; //change pointer to the child scope
        }

        return this.activeLocalScope;
    }

    public LocalScope getActiveLocalScope() {
        return this.activeLocalScope;
    }

    public void closeLocalScope() {
        if(this.activeLocalScope.getParent() != null && this.activeLocalScope.getParent() instanceof LocalScope) {
            this.activeLocalScope = (LocalScope) this.activeLocalScope.getParent();
        }
        else if(this.activeLocalScope.getParent() == null) {
            System.err.println("Cannot change parent. Current active local scope no longer has a parent."); //TODO: Change to IDE
        }
        else {
            System.err.println("Cannot change parent. Current active local's parent is now a class scope."); //TODO: Change to IDE
        }
    }

    public static CorgiValue searchVariableInLocalIterative(String identifier, LocalScope localScope) {

        if(localScope == null) {
            System.err.println(identifier + " not found in any local scope!"); //TODO: Change to IDE
            return null;
        }

        Stack<LocalScope> stack = new Stack<>();

        stack.push(localScope);

        List<LocalScope> discoveredScopes = new ArrayList<>();
        LocalScope scope;

        while(!stack.isEmpty()) {
            scope = stack.pop();

            if(scope.containsVariable(identifier)) {
                return scope.searchVariableIncludingLocal(identifier);
            }

            if(!discoveredScopes.contains(scope)) {
                discoveredScopes.add(scope);

                for(int i = 0; i < scope.getChildCount(); i++) {
                    LocalScope childScope = scope.getChildAt(i);
                    stack.push(childScope);
                }
            }
        }


        System.err.println(identifier + " not found in any local scope!"); //TODO: Change to IDE
        return null;
    }

    public static void reset() {
        if(instance==null){
            getInstance();
        }
        instance.activeLocalScope = null;
    }


}
