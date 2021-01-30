package Commands;

import ErrorChecker.UndeclaredChecker;
import GeneratedAntlrClasses.CorgiParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class PrintCommand implements ICommand, ParseTreeListener {

    private final static String TAG = "PrintCommand";

    private CorgiParser.ExpressionContext expressionCtx;

    private String statementToPrint = "";
//    private boolean isLN = false;

    private boolean evaluatedExp = false;

    public PrintCommand(CorgiParser.StatementContext sCtx) {

//        isLN = sCtx.PRINTLN() != null;

        this.expressionCtx = sCtx.expression();

        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(expressionCtx);
        undeclaredChecker.verify();

        statementToPrint = "";
    }

    @Override
    public void execute() {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.expressionCtx);

        statementToPrint += "\n";

        //TODO: Print statement on front-end

        statementToPrint = "";
        evaluatedExp = false;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode node) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

        if (ctx instanceof CorgiParser.ExpressionContext && !evaluatedExp) {

            CorgiParser.ExpressionContext expCtx = (CorgiParser.ExpressionContext) ctx;

            EvaluationCommand evComm = new EvaluationCommand(expCtx);
            evComm.execute();

            if (evComm.isNumericResult())
                statementToPrint += evComm.getResult().toEngineeringString();
            else
                statementToPrint += evComm.getStringResult();

            evaluatedExp = true;

        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    public String getStatementToPrint() {
        return this.statementToPrint;
    }

}