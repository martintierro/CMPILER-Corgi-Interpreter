package Adders;

import Commands.ICommand;
import Representations.CorgiFunction;

public class FunctionExecutionAdder implements IExecutionAdder {

    private CorgiFunction assignedFunction;

    public FunctionExecutionAdder(CorgiFunction corgiFunction) {
        this.assignedFunction = corgiFunction;
    }


    @Override
    public void addCommand(ICommand command) {
        this.assignedFunction.addCommand(command);
    }

    public CorgiFunction getAssignedFunction() {
        return this.assignedFunction;
    }

}