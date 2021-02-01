package Execution;

import Representations.CorgiFunction;

import java.util.Stack;

public class FunctionTracker {
    private final static String TAG = "MobiProg_CallGraphManager";

    private static FunctionTracker sharedInstance = null;

    private Stack<CorgiFunction> callStack;

    public static FunctionTracker getInstance() {
        return sharedInstance;
    }

    private FunctionTracker() {
        this.callStack = new Stack<CorgiFunction>();
    }

    public static void initialize() {
        sharedInstance = new FunctionTracker();
    }

    public static void reset() {

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
