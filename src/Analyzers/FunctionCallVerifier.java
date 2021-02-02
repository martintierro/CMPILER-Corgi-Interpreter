package Analyzers;

import ErrorChecker.ParameterMismatchChecker;
import Commands.EvaluationCommand;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiFunction;
import Semantics.CorgiScope;
import Semantics.SymbolTableManager;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

public class FunctionCallVerifier implements ParseTreeListener {

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
            if (EvaluationCommand.isFunctionCall(exprCtx)) {
                if(exprCtx.expression(0) == null)
                    return;

                String functionName = exprCtx.expression(0).getText();

                CorgiScope corgiScope = SymbolTableManager.getInstance().getMainScope();
                CorgiFunction corgiFunction = corgiScope.getFunction(functionName);

                if (exprCtx.arguments() != null) {
                    ParameterMismatchChecker paramsMismatchChecker = new ParameterMismatchChecker(corgiFunction, exprCtx.arguments());
                    paramsMismatchChecker.verify();
                }
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

}