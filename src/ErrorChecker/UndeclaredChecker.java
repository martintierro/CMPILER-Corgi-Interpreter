package ErrorChecker;

import Builder.BuildChecker;
import Builder.ParserHandler;
import Builder.SemanticErrorDictionary;
import Commands.EvaluationCommand;
import Execution.ExecutionManager;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiFunction;
import Representations.CorgiValue;
import Searcher.VariableSearcher;
import Semantics.MainScope;
import Semantics.SymbolTableManager;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class UndeclaredChecker implements IErrorChecker, ParseTreeListener {

    private CorgiParser.ExpressionContext exprCtx;
    private int lineNumber;

    public UndeclaredChecker(CorgiParser.ExpressionContext exprCtx) {
        this.exprCtx = exprCtx;

        Token firstToken = this.exprCtx.getStart();
        this.lineNumber = firstToken.getLine();
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.builder.errorcheckers.IErrorChecker#verify()
     */
    @Override
    public void verify() {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.exprCtx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if(ctx instanceof CorgiParser.ExpressionContext) {
            CorgiParser.ExpressionContext exprCtx = (CorgiParser.ExpressionContext) ctx;
            if(EvaluationCommand.isFunctionCall(exprCtx)) {
                this.verifyFunctionCall(exprCtx);
            }
            else if(EvaluationCommand.isVariableOrConst(exprCtx)) {
                this.verifyVariableOrConst(exprCtx);
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    private void verifyFunctionCall(CorgiParser.ExpressionContext funcExprCtx) {

        if(funcExprCtx.expression() == null)
            return;

        String functionName = funcExprCtx.expression(0).getText();

        MainScope classScope = SymbolTableManager.getInstance().getMainScope();
        CorgiFunction corgiFunction = classScope.getFunction(functionName);

        if(corgiFunction == null) {
            BuildChecker.reportCustomError(SemanticErrorDictionary.UNDECLARED_FUNCTION, "", functionName, this.lineNumber);
        }
        else {
//            Console.log(LogType.DEBUG, "Function found: " +functionName);
        }
    }

    private void verifyVariableOrConst(CorgiParser.ExpressionContext varExprCtx) {
        CorgiValue corgiValue = null;

        if(ExecutionManager.getInstance().isInFunctionExecution()) {
            CorgiFunction corgiFunction = ExecutionManager.getInstance().getCurrentFunction();
            corgiValue = VariableSearcher.searchVariableInFunction(corgiFunction, varExprCtx.primary().Identifier().getText());
        }

        //if after function finding, mobi value is still null, search class
        if(corgiValue == null) {
            MainScope mainScope = SymbolTableManager.getInstance().getMainScope();
            corgiValue = VariableSearcher.searchVariableInClassIncludingLocal(mainScope, varExprCtx.primary().Identifier().getText());
        }

        //after second pass, we conclude if it cannot be found already
        if(corgiValue == null) {
            BuildChecker.reportCustomError(SemanticErrorDictionary.UNDECLARED_VARIABLE, "", varExprCtx.getText(), this.lineNumber);
        }
    }

    /*
     * Verifies a var or const identifier from a scan statement since scan grammar is different.
     */
    public static void verifyVarOrConstForScan(String identifier, CorgiParser.StatementContext statementCtx) {
        MainScope mainScope = SymbolTableManager.getInstance().getMainScope();
        CorgiValue corgiValue = VariableSearcher.searchVariableInClassIncludingLocal(mainScope, identifier);

        Token firstToken = statementCtx.getStart();

        if(corgiValue == null) {
            BuildChecker.reportCustomError(SemanticErrorDictionary.UNDECLARED_VARIABLE, "", identifier, firstToken.getLine());
        }
    }

}