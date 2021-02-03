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

public class ConstChecker implements IErrorChecker, ParseTreeListener {

    private CorgiParser.ExpressionContext exprCtx;
    private int lineNumber;

    public ConstChecker(CorgiParser.ExpressionContext exprCtx) {
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
            if(EvaluationCommand.isVariableOrConst(exprCtx)) {
                this.verifyVariableOrConst(exprCtx);
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

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

        if(corgiValue != null && corgiValue.isFinal()) {
            BuildChecker.reportCustomError(SemanticErrorDictionary.CONST_REASSIGNMENT, "", varExprCtx.getText(), this.lineNumber);
        }
    }

}