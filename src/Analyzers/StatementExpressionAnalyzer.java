package Analyzers;

import Builder.BuildChecker;
import Builder.SemanticErrorDictionary;
import Commands.*;
import Execution.ExecutionManager;
import GeneratedAntlrClasses.CorgiLexer;
import GeneratedAntlrClasses.CorgiParser;
import Statements.StatementControlOverseer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class StatementExpressionAnalyzer implements ParseTreeListener {

    private CorgiParser.ExpressionContext readRightHandExprCtx; //used to avoid mistakenly reading right hand expressions as direct function calls as well.

    //TODO: find a way to not rely on tree depth for function calls.
    public final static int FUNCTION_CALL_NO_PARAMS_DEPTH = 13;
    public final static int FUNCTION_CALL_WITH_PARAMS_DEPTH = 14;

    public StatementExpressionAnalyzer() {

    }

    public void analyze(CorgiParser.StatementExpressionContext statementExprCtx) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, statementExprCtx);
    }

    public void analyze(CorgiParser.ExpressionContext exprCtx) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, exprCtx);
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

            if(isAssignmentExpression(exprCtx)) {
                System.out.println("Assignment expr detected: " +exprCtx.getText());

                List<CorgiParser.ExpressionContext> exprListCtx = exprCtx.expression();
                AssignmentCommand assignmentCommand = new AssignmentCommand(exprListCtx.get(0), exprListCtx.get(1));

                this.readRightHandExprCtx = exprListCtx.get(1);
                this.handleStatementExecution(assignmentCommand);

            }
            else if(isIncrementExpression(exprCtx)) {
                System.out.println("Increment expr detected: " +exprCtx.getText());

                List<CorgiParser.ExpressionContext> exprListCtx = exprCtx.expression();

                IncDecCommand incDecCommand = new IncDecCommand(exprListCtx.get(0) ,CorgiLexer.INC);
                this.handleStatementExecution(incDecCommand);
            }

            else if(isDecrementExpression(exprCtx)) {
                System.out.println("Decrement expr detected: " +exprCtx.getText());

                List<CorgiParser.ExpressionContext> exprListCtx = exprCtx.expression();

                IncDecCommand incDecCommand = new IncDecCommand(exprListCtx.get(0) ,CorgiLexer.DEC);
                this.handleStatementExecution(incDecCommand);

            }

            else if(this.isFunctionCallWithParams(exprCtx)) {
                this.handleFunctionCallWithParams(exprCtx);
            }

            else if(this.isFunctionCallWithNoParams(exprCtx)) {
                this.handleFunctionCallWithNoParams(exprCtx);
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    private void handleStatementExecution(ICommand command) {

        StatementControlOverseer statementControl = StatementControlOverseer.getInstance();

        //add to conditional controlled command
        if(statementControl.isInConditionalCommand()) {
            IConditionalCommand conditionalCommand = (IConditionalCommand) statementControl.getActiveControlledCommand();

            if(statementControl.isInPositiveRule()) {
                conditionalCommand.addPositiveCommand(command);
            }
            else {
                conditionalCommand.addNegativeCommand(command);
            }
        }

        else if(statementControl.isInControlledCommand()) {
            IControlledCommand controlledCommand = (IControlledCommand) statementControl.getActiveControlledCommand();
            controlledCommand.addCommand(command);
        }
        else {
            ExecutionManager.getInstance().addCommand(command);
        }

    }

    private void handleFunctionCallWithParams(CorgiParser.ExpressionContext funcExprCtx) {
        CorgiParser.ExpressionContext functionExprCtx = funcExprCtx.expression(0);
        String functionName = functionExprCtx.getText();

        FunctionCallCommand functionCallCommand = new FunctionCallCommand(functionName, funcExprCtx);
        this.handleStatementExecution(functionCallCommand);

        System.out.println("Function call with no params detected: " +functionName);
    }

    private void handleFunctionCallWithNoParams(CorgiParser.ExpressionContext funcExprCtx) {
        String functionName = funcExprCtx.expression(0).getText();

        FunctionCallCommand functionCallCommand = new FunctionCallCommand(functionName, funcExprCtx);
        this.handleStatementExecution(functionCallCommand);

    }
    public static boolean isAssignmentExpression(CorgiParser.ExpressionContext exprCtx) {
        List<TerminalNode> tokenList = exprCtx.getTokens(CorgiLexer.ASSIGN);
        return (tokenList.size() > 0);
    }

    public static boolean isIncrementExpression(CorgiParser.ExpressionContext exprCtx) {
        List<TerminalNode> incrementList = exprCtx.getTokens(CorgiLexer.INC);

        return (incrementList.size() > 0);
    }

    public static boolean isDecrementExpression(CorgiParser.ExpressionContext exprCtx) {
        List<TerminalNode> decrementList = exprCtx.getTokens(CorgiLexer.DEC);

        return (decrementList.size() > 0);
    }

    private boolean isFunctionCallWithParams(CorgiParser.ExpressionContext exprCtx) {
        CorgiParser.ExpressionContext firstExprCtx = exprCtx.expression(0);

        if(firstExprCtx != null) {
            if(exprCtx != this.readRightHandExprCtx) {
                //ThisKeywordChecker thisChecker = new ThisKeywordChecker(firstExprCtx);
                //thisChecker.verify();

                return (exprCtx.expressionList() != null);
            }
        }

        return false;

    }

    private boolean isFunctionCallWithNoParams(CorgiParser.ExpressionContext exprCtx) {
        //ThisKeywordChecker thisChecker = new ThisKeywordChecker(exprCtx);
        //thisChecker.verify();
        //if(exprCtx.Identifier() != null)
        return exprCtx.depth() == FUNCTION_CALL_NO_PARAMS_DEPTH || exprCtx.depth() == 17;
    }
}