package Adders;

import Commands.ICommand;
import Representations.CorgiFunction;

public class FunctionExecutionAdder implements IExecutionAdder {

    private CorgiFunction assignedCorgiFunction;

    public FunctionExecutionAdder(CorgiFunction corgiFunction) {
        this.assignedCorgiFunction = corgiFunction;
    }

    @Override
    public void addCommand(ICommand command) {
        this.assignedCorgiFunction.addCommand(command);
    }

    public CorgiFunction getAssignedFunction() {
        return this.assignedCorgiFunction;
    }

}