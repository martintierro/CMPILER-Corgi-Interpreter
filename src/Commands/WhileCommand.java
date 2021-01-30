package Commands;

import Execution.ExecutionManager;
import Execution.ExecutionMonitor;
import GeneratedAntlrClasses.CorgiParser;
import Mapping.IValueMapper;
import Mapping.IdentifierMapper;
import Utlities.ConditionalEvaluator;
import Utlities.LocalVariableTracker;

import java.util.ArrayList;
import java.util.List;

public class WhileCommand implements IControlledCommand {

    protected List<ICommand> commandSequences; //the list of commands inside the WHILE statement

    protected CorgiParser.ParExpressionContext conditionalExpr;
    protected String modifiedConditionExpr;

    private boolean lastLineFlag = false;

    private ArrayList<String> localVars = new ArrayList<>();

    public WhileCommand(CorgiParser.ParExpressionContext conditionalExpr) {
        this.commandSequences = new ArrayList<ICommand>();
        this.conditionalExpr = conditionalExpr;
    }

    /*
     * Executes the command
     * (non-Javadoc)
     * @see com.neildg.mobiprog.execution.commands.ICommand#execute()
     */
    @Override
    public void execute() {
        this.identifyVariables();

        ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();

        LocalVariableTracker.resetLocalVars(localVars);

        try {
            //evaluate the given condition
            while(ConditionalEvaluator.evaluateCondition(this.modifiedConditionExpr)) {
                for(ICommand command : this.commandSequences) {
                    executionMonitor.tryExecution();
                    command.execute();

                    LocalVariableTracker.getInstance().populateLocalVars(command);

                    if (ExecutionManager.getInstance().isAborted())
                        break;
                }

                if (ExecutionManager.getInstance().isAborted())
                    break;

                executionMonitor.tryExecution();
                this.identifyVariables(); //identify variables again to detect changes to such variables used.
            }

        } catch(InterruptedException e) {
            //Log.e(TAG, "Monitor block interrupted! " +e.getMessage());
            System.out.println("WhileCommand: Monitor block interrupted " + e.getMessage());
        }
    }

    protected void identifyVariables() {
        IValueMapper identifierMapper = new IdentifierMapper(this.conditionalExpr.getText());
        identifierMapper.analyze(this.conditionalExpr);

        this.modifiedConditionExpr = identifierMapper.getModifiedExp();
    }

    @Override
    public ControlTypeEnum getControlType() {
        return ControlTypeEnum.WHILE_CONTROL;
    }

    @Override
    public void addCommand(ICommand command) {

        //Console.log(LogType.DEBUG, "		Added command to WHILE");
        this.commandSequences.add(command);
    }

    public int getCommandCount() {
        return this.commandSequences.size();
    }

    public ArrayList<String> getLocalVars() {
        return localVars;
    }
}