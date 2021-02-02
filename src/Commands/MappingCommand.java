package Commands;

import Analyzers.FunctionCallVerifier;
import ErrorChecker.UndeclaredChecker;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiValue;
import Representations.PrimitiveType;
import Searcher.VariableSearcher;
import Utlities.AssignmentUtilities;
import Utlities.StringUtilities;
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
        System.out.println("Executing Mapping Command");
        String value = "";
        EvaluationCommand evaluationCommand;
        CorgiValue corgiValue = VariableSearcher.searchVariable(this.identifierString);
        if(this.modifiedExp.contains("\"")) {
            value = StringUtilities.removeQuotes(this.modifiedExp);
            corgiValue.setPrimitiveType(PrimitiveType.STRING);
            corgiValue.setValue(value);
        }else if(this.modifiedExp.contains("'")){
            value = StringUtilities.removeQuotes(this.modifiedExp);
            corgiValue.setPrimitiveType(PrimitiveType.CHAR);
            corgiValue.setValue(value);
        }
        else {
            evaluationCommand = new EvaluationCommand(this.parentExprCtx);
            evaluationCommand.execute();
            AssignmentUtilities.assignAppropriateValue(corgiValue, evaluationCommand.getResult());
        }

    }

    /*
     * Returns the modified exp, with mapped values.
     */
    public String getModifiedExp() {
        return this.modifiedExp;
    }
}