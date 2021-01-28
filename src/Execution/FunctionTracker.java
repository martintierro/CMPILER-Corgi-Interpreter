package Execution;

import Representations.CorgiFunction;

import java.util.Stack;

public class FunctionTracker {

    private static FunctionTracker instance = null;

    public Stack<CorgiFunction> functionCallStack;

    public static FunctionTracker getInstance(){
        if(instance == null){
            instance = new FunctionTracker();
        }
        return instance;
    }

    private FunctionTracker(){
        this.functionCallStack = new Stack<>();
    }

    public void enterFunction(CorgiFunction function){
        this.functionCallStack.push(function);
    }

    public void exitFunction(){
        this.functionCallStack.pop();
    }

    public CorgiFunction getLatestFunction(){
        return this.functionCallStack.peek();
    }

    public boolean isInsideFunction() {
        return (this.functionCallStack.size() != 0);
    }


}
