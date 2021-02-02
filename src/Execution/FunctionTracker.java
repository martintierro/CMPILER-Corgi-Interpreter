package Execution;

import Representations.CorgiFunction;

import java.util.Stack;

public class FunctionTracker {

    private static FunctionTracker instance = null;

    private Stack<CorgiFunction> callStack;

    public static FunctionTracker getInstance() {
        if(instance == null)
            instance = new FunctionTracker();
        return instance;
    }

    private FunctionTracker() {
        this.callStack = new Stack<>();
    }

    public void reportEnterFunction(CorgiFunction corgiFunction) {
        this.callStack.push(corgiFunction);
    }

    public void reportExitFunction() {
        this.callStack.pop();
    }

    public CorgiFunction getLatestFunction() {
        return this.callStack.peek();
    }

    /*
     * Returns true if the control flow is currently inside a function
     */
    public boolean isInsideFunction() {
        return (this.callStack.size() != 0);
    }

}
