package Commands;

import java.util.ArrayList;
import java.util.List;

public class IfCommand implements IConditionalCommand{

    private List<ICommand> positiveCommands;
    private List<ICommand> negativeCommands;

    private String conditionalExpr;

    public IfCommand(String conditionalExpr) {
        this.conditionalExpr = conditionalExpr;
        this.positiveCommands = new ArrayList<>();
        this.negativeCommands = new ArrayList<>();
    }

    private boolean evaluate(){
        return true;
    }

    @Override
    public void execute() {

    }

    @Override
    public ControlTypeEnum getControlType() {
        return null;
    }

    @Override
    public void addPositiveCommand(ICommand command) {

    }

    @Override
    public void addNegativeCommand(ICommand command) {

    }
}
