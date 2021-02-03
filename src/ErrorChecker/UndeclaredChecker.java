package ErrorChecker;

import Builder.BuildChecker;
import Builder.SemanticErrorDictionary;
import Commands.EvaluationCommand;
import Execution.ExecutionManager;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiFunction;
import Representations.CorgiValue;
import Searcher.VariableSearcher;
import Semantics.CorgiScope;
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
            } else if(SymbolTableManager.getInstance().getCorgiScope().getFunction(exprCtx.getText()) != null){

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
        CorgiScope corgiScope = SymbolTableManager.getInstance().getCorgiScope();
        CorgiFunction corgiFunction = corgiScope.getFunction(functionName);

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

        //if after function finding, corgi value is still null, search class
        if(corgiValue == null) {
            CorgiScope corgiScope = SymbolTableManager.getInstance().getCorgiScope();
            corgiValue = VariableSearcher.searchVariableInClassIncludingLocal(corgiScope, varExprCtx.primary().Identifier().getText());
        }

        //after second pass, we conclude if it cannot be found already
        if(corgiValue == null) {
            BuildChecker.reportCustomError(SemanticErrorDictionary.UNDECLARED_VARIABLE, "", varExprCtx.getText(), this.lineNumber);
        }
    }

    /*
     * Verifies a var or const identifier from a scan statement since scan grammar is different.
     */
    public static void verifyVarOrConstForScan(String identifier, CorgiParser.ScanStatementContext statementCtx) {
        CorgiScope corgiScope = SymbolTableManager.getInstance().getCorgiScope();
        CorgiValue corgiValue = VariableSearcher.searchVariableInClassIncludingLocal(corgiScope, identifier);

        Token firstToken = statementCtx.getStart();

        if(corgiValue == null) {
            BuildChecker.reportCustomError(SemanticErrorDictionary.UNDECLARED_VARIABLE, "", identifier, firstToken.getLine());
        }
    }

}