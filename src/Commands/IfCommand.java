package Commands;

import Execution.ExecutionManager;
import Execution.ExecutionMonitor;
import GeneratedAntlrClasses.CorgiParser;
import Mapping.IValueMapper;
import Mapping.IdentifierMapper;
import Utlities.ConditionalEvaluator;

import java.util.ArrayList;
import java.util.List;

public class IfCommand implements IConditionalCommand{

    private List<ICommand> positiveCommands;
    private List<ICommand> negativeCommands;

    private CorgiParser.ParExpressionContext ctx;
    private String conditionalExpr;

    public IfCommand(CorgiParser.ParExpressionContext ctx) {
        this.ctx = ctx;
        this.positiveCommands = new ArrayList<>();
        this.negativeCommands = new ArrayList<>();
    }

    private boolean evaluate(){
        return true;
    }

    @Override
    public void execute() {
        this.identifyVariables();

        ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();

        try{
            if(ConditionalEvaluator.evaluateCondition(this.ctx)){
                for(ICommand command : this.positiveCommands) {
                    executionMonitor.tryExecution();
                    command.execute();
                }
            }else{
                for(ICommand command : this.negativeCommands) {
                    executionMonitor.tryExecution();
                    command.execute();
                }
            }
        }catch(InterruptedException e) {
            System.err.println("Monitor block interrupted! " +e.getMessage());
        }
    }

    private void identifyVariables() {
        IValueMapper identifierMapper = new IdentifierMapper(this.ctx.getText());
        identifierMapper.analyze(this.ctx);

        this.conditionalExpr = identifierMapper.getModifiedExp();
    }

    @Override
    public ControlTypeEnum getControlType() {
        return ControlTypeEnum.CONDITIONAL_IF;
    }

    @Override
    public void addPositiveCommand(ICommand command) {
        this.positiveCommands.add(command);
    }

    @Override
    public void addNegativeCommand(ICommand command) {
        this.negativeCommands.add(command);
    }

    public void clearAllCommands() {
        this.positiveCommands.clear();
        this.negativeCommands.clear();
    }

    public int getPositiveCommandsCount() {
        return this.positiveCommands.size();
    }

    public int getNegativeCommandsCount() {
        return this.negativeCommands.size();
    }
}
