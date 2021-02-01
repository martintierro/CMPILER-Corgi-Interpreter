package Analyzers;

import Commands.AssignmentCommand;
import Commands.ICommand;
import Commands.IncDecCommand;
import GeneratedAntlrClasses.CorgiLexer;
import GeneratedAntlrClasses.CorgiParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ForControlAnalyzer implements ParseTreeListener{

    private CorgiParser.LocalVariableDeclarationContext localVarDecCtx;
    private CorgiParser.ExpressionContext exprCtx;
    private ICommand updateCommand;

    public ForControlAnalyzer() {

    }

    public void analyze(CorgiParser.ForControlContext forControlCtx) {

        //we don't need to walk the expression anymore, therefore, immediately assign it.
        if(forControlCtx.expression() != null) {
            this.exprCtx = forControlCtx.expression();
        }

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, forControlCtx);
    }

    public void analyzeForLoop(ParserRuleContext ctx) {

        if(ctx instanceof CorgiParser.ForInitContext) {
            CorgiParser.ForInitContext forInitCtx = (CorgiParser.ForInitContext) ctx;

            this.localVarDecCtx = forInitCtx.localVariableDeclaration();

            LocalVariableAnalyzer localVariableAnalyzer = new LocalVariableAnalyzer();
            localVariableAnalyzer.analyze(this.localVarDecCtx);
        }

        else if(ctx instanceof CorgiParser.ForUpdateContext) {
            CorgiParser.ForUpdateContext forUpdateCtx = (CorgiParser.ForUpdateContext) ctx;
            CorgiParser.ExpressionContext exprCtx = forUpdateCtx.expressionList().expression(0);

            if(StatementExpressionAnalyzer.isAssignmentExpression(exprCtx)) {
                //this.updateCommand = new AssignmentCommand(exprCtx.expression(0), exprCtx.expression(1));
                this.updateCommand = new AssignmentCommand(exprCtx.expression(0), exprCtx.expression(1));
            }
            else if(StatementExpressionAnalyzer.isIncrementExpression(exprCtx)) {
                this.updateCommand = new IncDecCommand(exprCtx.expression(0), CorgiLexer.INC);
            }
            else if(StatementExpressionAnalyzer.isDecrementExpression(exprCtx)) {
                this.updateCommand = new IncDecCommand(exprCtx.expression(0), CorgiLexer.DEC);
            }
        }
    }

    public CorgiParser.ExpressionContext getExprContext() {
        return this.exprCtx;
    }

    public CorgiParser.LocalVariableDeclarationContext getLocalVarDecContext() {
        return this.localVarDecCtx;
    }

    public ICommand getUpdateCommand() {
        return this.updateCommand;
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
        this.analyzeForLoop(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }
}