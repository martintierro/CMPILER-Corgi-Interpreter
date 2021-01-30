package Commands;

import Execution.ExecutionManager;
import Execution.ExecutionMonitor;
import GeneratedAntlrClasses.CorgiParser;
import Utlities.LocalVariableTracker;

public class DoWhileCommand extends WhileCommand {

    public DoWhileCommand(CorgiParser.ParExpressionContext parExprCtr) {
        super(parExprCtr);
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.execution.commands.ICommand#execute()
     */
    @Override
    public void execute() {
        this.executeFirstCommandSequence();
        super.execute();
    }

    /*
     * Executes the first command sequence before actually executing the behavior for the while command
     */
    private void executeFirstCommandSequence() {
        this.identifyVariables();

        ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();

        LocalVariableTracker.resetLocalVars(super.getLocalVars());

        try {
            for(ICommand command : this.commandSequences) {
                executionMonitor.tryExecution();
                command.execute();

                LocalVariableTracker.getInstance().populateLocalVars(command);

                if (ExecutionManager.getInstance().isAborted())
                    break;
            }

        } catch(InterruptedException e) {
            //Log.e(TAG, "Monitor block interrupted! " +e.getMessage());
            System.out.println("DoWhileCommand: Monitor block interrupted! " + e.getMessage());
        }
    }

    @Override
    public ControlTypeEnum getControlType() {
        return ControlTypeEnum.DO_WHILE_CONTROL;
    }
}