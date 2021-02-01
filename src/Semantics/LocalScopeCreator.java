package Semantics;

import Representations.CorgiValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LocalScopeCreator {
    private final static String TAG = "MobiProg_ScopeCreator";

    private static LocalScopeCreator instance = null;

    public static LocalScopeCreator getInstance() {
        if(instance == null) {
            instance = new LocalScopeCreator();
        }
        return instance;
    }

    private LocalScope activeLocalScope = null;

    private LocalScopeCreator() {

    }

    public static void initialize() {
        instance = new LocalScopeCreator();
    }

    public static void reset() {
        if(instance != null && instance.activeLocalScope != null)
            instance.activeLocalScope = null;
    }

    /*
     * Opens a new local scope instance. If the active local scope instance is null,
     * it creates a new one and sets it as a parent. Otherwise, the active local scope is set as
     * a parent of the new instance, then the new instance becomes the active local scope.
     */
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

    /*
     * Closes the active local scope which changes the pointer to the parent of the active local scope.
     */
    public void closeLocalScope() {
        if(this.activeLocalScope.getParent() != null && this.activeLocalScope.getParent() instanceof LocalScope) {
            this.activeLocalScope = (LocalScope) this.activeLocalScope.getParent();
        }
        else if(this.activeLocalScope.getParent() == null) {
            System.err.println("Cannot change parent. Current active local scope no longer has a parent.");
        }
        else {
            System.err.println("Cannot change parent. Current active local scope's parent is now a class scope.");
        }
    }

    /*
     * Searches for a local variable using an iterative depth-first search.
     */
    public static CorgiValue searchVariableInLocalIterative(String identifier, LocalScope localScope) {

        if(localScope == null) {
            System.err.println(identifier + " not found in any local scope!");
            return null;
        }

        Stack<LocalScope> stack = new Stack<LocalScope>();

        stack.push(localScope);

        List<LocalScope> discoveredScopes = new ArrayList<LocalScope>();
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

        System.err.println(identifier + " not found in any local scope!");
        return null;
    }
}
