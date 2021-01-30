package Commands;

import Analyzers.LocalVariableAnalyzer;
import Execution.ExecutionManager;
import Execution.ExecutionMonitor;
import GeneratedAntlrClasses.CorgiParser;
import Mapping.IValueMapper;
import Mapping.IdentifierMapper;
import Utlities.ConditionalEvaluator;
import Utlities.LocalVariableTracker;

import java.util.ArrayList;
import java.util.List;

public class ForCommand implements IControlledCommand {

    private final static String TAG = "MobiProg_ForCommand";

    private List<ICommand> commandSequences;

    private CorgiParser.LocalVariableDeclarationContext localVarDecCtx; //a local variable ctx that is evaluated at the start of the for loop
    private CorgiParser.ExpressionContext conditionalExpr; //the condition to satisfy
    private ICommand updateCommand; //the update command aftery ever iteration

    private String modifiedConditionExpr;

    private ArrayList<String> localVars = new ArrayList<>();

    public ForCommand(CorgiParser.LocalVariableDeclarationContext localVarDecCtx, CorgiParser.ExpressionContext conditionalExpr, ICommand updateCommand) {
        this.localVarDecCtx = localVarDecCtx;
        this.conditionalExpr = conditionalExpr;
        this.updateCommand = updateCommand;

        this.commandSequences = new ArrayList<ICommand>();
    }

    @Override
    public void execute() {
        //this.evaluateLocalVariable();
        this.identifyVariables();

        ExecutionMonitor executionMonitor = ExecutionManager.getInstance().getExecutionMonitor();

        LocalVariableTracker.resetLocalVars(localVars);

        try {
            //evaluate the given condition
            while(ConditionalEvaluator.evaluateCondition(this.conditionalExpr)) {
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
                this.updateCommand.execute(); //execute the update command
                this.identifyVariables(); //identify variables again to detect changes to such variables used.
            }

        } catch(InterruptedException e) {
            System.out.println(TAG + ": " + "Monitor block interrupted! " +e.getMessage());
        }
    }

    private void evaluateLocalVariable() {
        if(this.localVarDecCtx != null) {
            LocalVariableAnalyzer localVarAnalyzer = new LocalVariableAnalyzer();
            localVarAnalyzer.markImmediateExecution();
            localVarAnalyzer.analyze(this.localVarDecCtx);
        }
    }

    private void identifyVariables() {
        IValueMapper identifierMapper = new IdentifierMapper(this.conditionalExpr.getText());
        identifierMapper.analyze(this.conditionalExpr);

        this.modifiedConditionExpr = identifierMapper.getModifiedExp();
    }

    @Override
    public ControlTypeEnum getControlType() {
        return ControlTypeEnum.FOR_CONTROL;
    }

    @Override
    public void addCommand(ICommand command) {

        System.out.println("		Added command to FOR");
        this.commandSequences.add(command);
    }

    public int getCommandCount() {
        return this.commandSequences.size();
    }

    public ArrayList<String> getLocalVars() {
        return localVars;
    }
}