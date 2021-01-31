package Commands;

import Analyzers.FunctionCallVerifier;
import ErrorChecker.ConstChecker;
import ErrorChecker.TypeChecker;
import ErrorChecker.UndeclaredChecker;
import Execution.ExecutionManager;
import GeneratedAntlrClasses.CorgiLexer;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiArray;
import Representations.CorgiValue;
import Searcher.VariableSearcher;
import Utlities.AssignmentUtilities;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class ShorthandCommand implements ICommand {

    private CorgiParser.ExpressionContext leftHandExprCtx;
    private CorgiParser.ExpressionContext rightHandExprCtx;
    int tokenSign;

    public ShorthandCommand(CorgiParser.ExpressionContext leftHandExprCtx,
                            CorgiParser.ExpressionContext rightHandExprCtx, int tokenSign) {
        this.leftHandExprCtx = leftHandExprCtx;
        this.rightHandExprCtx = rightHandExprCtx;
        this.tokenSign = tokenSign;

        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.leftHandExprCtx);
        undeclaredChecker.verify();

        ConstChecker constChecker = new ConstChecker(this.leftHandExprCtx);
        constChecker.verify();

        undeclaredChecker = new UndeclaredChecker(this.rightHandExprCtx);
        undeclaredChecker.verify();

        ParseTreeWalker functionWalker = new ParseTreeWalker();
        functionWalker.walk(new FunctionCallVerifier(), this.rightHandExprCtx);

        //type check the mobivalue
        CorgiValue corgiValue;
        if(ExecutionManager.getInstance().isInFunctionExecution()) {
            corgiValue = VariableSearcher.searchVariableInFunction(ExecutionManager.getInstance().getCurrentFunction(), this.leftHandExprCtx.getText());
        }
        else {
            corgiValue = VariableSearcher.searchVariable(this.leftHandExprCtx.getText());
        }

        TypeChecker typeChecker = new TypeChecker(corgiValue, this.rightHandExprCtx);
        typeChecker.verify();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.neildg.mobiprog.execution.commands.ICommand#execute()
     */
    @Override
    public void execute() {
        EvaluationCommand evaluationCommand = new EvaluationCommand(this.rightHandExprCtx);
        evaluationCommand.execute();

        if (evaluationCommand.hasException())
            return;

        if(this.isLeftHandArrayAccessor()) {
            this.handleArrayAssignment(evaluationCommand.getResult().toEngineeringString());
        }
        else {
            CorgiValue corgiValue = VariableSearcher.searchVariable(this.leftHandExprCtx.getText());

            if (evaluationCommand.isNumericResult()) {

                if (!corgiValue.isFinal()) {
                    // Add checking for shorthand expressions
                    AssignmentUtilities.assignAppropriateValue(corgiValue, evaluationCommand.getResult(), tokenSign);
                }

            } else {
                if (!corgiValue.isFinal()) {
                    if (this.tokenSign == CorgiLexer.ADD_ASSIGN) {
                        AssignmentUtilities.addAssignAppropriateValue(corgiValue, evaluationCommand.getStringResult());
                    }
                    else {
                        AssignmentUtilities.assignAppropriateValue(corgiValue, evaluationCommand.getStringResult());
                    }
                }
            }
        }
    }

    private boolean isLeftHandArrayAccessor() {
        List<TerminalNode> lBrackTokens = this.leftHandExprCtx.getTokens(CorgiLexer.LBRACK);
        List<TerminalNode> rBrackTokens = this.leftHandExprCtx.getTokens(CorgiLexer.RBRACK);

        return(lBrackTokens.size() > 0 && rBrackTokens.size() > 0);
    }

    private void handleArrayAssignment(String resultString) {
        TerminalNode identifierNode = this.leftHandExprCtx.expression(0).primary().Identifier();
        CorgiParser.ExpressionContext arrayIndexExprCtx = this.leftHandExprCtx.expression(1);

        CorgiValue corgiValue = VariableSearcher.searchVariable(identifierNode.getText());
        CorgiArray corgiArray = (CorgiArray) corgiValue.getValue();

        EvaluationCommand evaluationCommand = new EvaluationCommand(arrayIndexExprCtx);
        evaluationCommand.execute();

        ExecutionManager.getInstance().setCurrentCheckedLineNumber(identifierNode.getSymbol().getLine());

        //create a new array value to replace value at specified index
        CorgiValue newArrayValue = new CorgiValue(null, corgiArray.getArrayType());
        newArrayValue.setValue(resultString);
        corgiArray.updateValueAt(newArrayValue, evaluationCommand.getResult().intValue());

        //Console.log("Index to access: " +evaluationCommand.getResult().intValue()+ " Updated with: " +resultString);
    }
}
