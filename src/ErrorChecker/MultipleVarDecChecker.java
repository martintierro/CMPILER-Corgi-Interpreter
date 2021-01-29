package ErrorChecker;

import Builder.BuildChecker;
import Builder.SemanticErrorDictionary;
import Execution.ExecutionManager;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiFunction;
import Representations.CorgiValue;
import Searcher.VariableSearcher;
import Semantics.LocalScopeCreator;
import Semantics.MainScope;
import Semantics.SymbolTableManager;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MultipleVarDecChecker implements IErrorChecker, ParseTreeListener {
    private final static String TAG = "MobiProg_MultipleVarDecChecker";

    private CorgiParser.VariableDeclaratorIdContext varDecIdCtx;
    private int lineNumber;

    public MultipleVarDecChecker(CorgiParser.VariableDeclaratorIdContext varDecIdCtx) {
        this.varDecIdCtx = varDecIdCtx;

        Token firstToken = this.varDecIdCtx.getStart();
        this.lineNumber = firstToken.getLine();
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.builder.errorcheckers.IErrorChecker#verify()
     */
    @Override
    public void verify() {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.varDecIdCtx);
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
        if(ctx instanceof CorgiParser.VariableDeclaratorIdContext) {
            CorgiParser.VariableDeclaratorIdContext varDecCtx = (CorgiParser.VariableDeclaratorIdContext) ctx;
            this.verifyVariableOrConst(varDecCtx.getText());
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    private void verifyVariableOrConst(String identifierString) {
        CorgiValue corgiValue = null;

        if(ExecutionManager.getInstance().isInFunctionExecution()) {
            CorgiFunction mobiFunction = ExecutionManager.getInstance().getCurrentFunction();
            corgiValue = VariableSearcher.searchVariableInFunction(mobiFunction, identifierString);
        }

        //if after function finding, mobi value is still null, search local scope
        if(corgiValue == null) {
            corgiValue = LocalScopeCreator.searchVariableInLocalIterative(identifierString, LocalScopeCreator.getInstance().getActiveLocalScope());
        }

        //if mobi value is still null, search class
        if(corgiValue == null) {
            MainScope mainScope = SymbolTableManager.getInstance().getMainScope();
            corgiValue = VariableSearcher.searchVariableInClass(mainScope, identifierString);
        }


        if(corgiValue != null) {
            BuildChecker.reportCustomError(SemanticErrorDictionary.MULTIPLE_VARIABLE, "", identifierString, this.lineNumber);
        }
    }


}