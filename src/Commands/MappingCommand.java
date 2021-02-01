package Commands;

import Analyzers.FunctionCallVerifier;
import ErrorChecker.UndeclaredChecker;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiValue;
import Searcher.VariableSearcher;
import Utlities.AssignmentUtilities;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MappingCommand implements ICommand{

    private String identifierString;
    private CorgiParser.ExpressionContext parentExprCtx;

    private String modifiedExp;

    public MappingCommand(String identifierString, CorgiParser.ExpressionContext exprCtx) {
        this.identifierString = identifierString;
        this.parentExprCtx = exprCtx;

        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.parentExprCtx);
        undeclaredChecker.verify();

        ParseTreeWalker functionWalker = new ParseTreeWalker();
        functionWalker.walk(new FunctionCallVerifier(), this.parentExprCtx);

    }


    @Override
    public void execute() {
        this.modifiedExp = this.parentExprCtx.getText();

        EvaluationCommand evaluationCommand = new EvaluationCommand(this.parentExprCtx);
        evaluationCommand.execute();
        System.out.println(this.identifierString);
        CorgiValue corgiValue = VariableSearcher.searchVariable(this.identifierString);
        System.out.println(corgiValue);
        AssignmentUtilities.assignAppropriateValue(corgiValue, evaluationCommand.getResult());
    }

    /*
     * Returns the modified exp, with mapped values.
     */
    public String getModifiedExp() {
        return this.modifiedExp;
    }
}