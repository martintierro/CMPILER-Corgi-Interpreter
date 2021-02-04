package Commands;

import Execution.ExecutionManager;
import GeneratedAntlrClasses.CorgiParser;
import Representations.*;
import Searcher.VariableSearcher;
import Semantics.CorgiScope;
import Semantics.SymbolTableManager;
import Utlities.KeywordRecognizer;
import Utlities.StringUtilities;
import com.udojava.evalex.Expression;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Pattern;

public class EvaluationCommand implements ICommand, ParseTreeListener {

    private CorgiParser.ExpressionContext parentExprCtx;
    private String modifiedExp;
    private BigDecimal resultValue;
    private boolean isNumeric;
    private boolean hasException = false;
    private String stringResult = "";


    public EvaluationCommand(CorgiParser.ExpressionContext exprCtx) {
        this.parentExprCtx = exprCtx;
    }

    @Override
    public void execute() {

        //System.out.println("EvaluationCommand: executing");
        this.modifiedExp = this.parentExprCtx.getText();

        for (CorgiParser.ExpressionContext eCtx : this.parentExprCtx.expression()) { // bias functions in evaluating
            if (isFunctionCall(eCtx)) {
                EvaluationCommand evaluationCommand = new EvaluationCommand(eCtx);
                evaluationCommand.execute();

                this.modifiedExp = this.modifiedExp.replace(eCtx.getText(), evaluationCommand.modifiedExp);
            }
        }

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.parentExprCtx);

        isNumeric = !this.modifiedExp.contains("\"") && !this.modifiedExp.contains("\'");

        if (!isNumeric) {

            if (this.modifiedExp.contains("==") || this.modifiedExp.contains("!=")) {


                String[] strings = {"", ""};

                if (this.modifiedExp.contains("=="))
                    strings = this.modifiedExp.split("==");

                if (this.modifiedExp.contains("!="))
                    strings = this.modifiedExp.split("!=");

                String equalityFunction = "STREQ("+strings[0]+", " + strings[1] + ")";

                if (this.modifiedExp.contains("!="))
                    equalityFunction = "not(" + equalityFunction + ")";

                Expression e = new Expression(equalityFunction);

                e.addLazyFunction(e.new LazyFunction("STREQ", 2) {

                    private Expression.LazyNumber ZERO = new Expression.LazyNumber() {
                        public BigDecimal eval() {
                            return BigDecimal.ZERO;
                        }
                        public String getString() {
                            return "0";
                        }
                    };

                    private Expression.LazyNumber ONE = new Expression.LazyNumber() {
                        public BigDecimal eval() {
                            return BigDecimal.ONE;
                        }
                        public String getString() {
                            return null;
                        }
                    };

                    public Expression.LazyNumber lazyEval(List<Expression.LazyNumber> lazyParams) {
                        if (lazyParams.get(0).getString().equals(lazyParams.get(1).getString())) {
                            return ONE;
                        }
                        return ZERO;
                    }
                });

                this.resultValue = e.eval();
                isNumeric = true;
            }else if (this.parentExprCtx.expression().size() != 0 &&
                    !isArrayElement(parentExprCtx) &&
                    !isFunctionCall(parentExprCtx)) {

                for (CorgiParser.ExpressionContext expCtx :
                        this.parentExprCtx.expression()) {

                    if (!isArray(expCtx)) {

                        EvaluationCommand innerEvCmd = new EvaluationCommand(expCtx);
                        innerEvCmd.execute();

                        if (innerEvCmd.isNumericResult())
                            this.stringResult += innerEvCmd.getResult().toEngineeringString();
                        else
                            this.stringResult += innerEvCmd.getStringResult();

                    }
                }

            } else {
                this.stringResult = StringUtilities.removeQuotes(modifiedExp);
            }

        } else {

            if (this.modifiedExp.contains("!")) {
                this.modifiedExp = this.modifiedExp.replaceAll("!", "not");
                this.modifiedExp = this.modifiedExp.replaceAll("not=", "!=");
            }

            if (this.modifiedExp.contains("and")) {
                this.modifiedExp = this.modifiedExp.replaceAll("and", "&&");
            }

            if (this.modifiedExp.contains("or")) {
                this.modifiedExp = this.modifiedExp.replaceAll("or", "||");
            }

            Expression evalEx = new Expression(this.modifiedExp);

            try {
                this.resultValue = evalEx.eval(false);
                this.stringResult = this.resultValue.toEngineeringString();
            } catch (Expression.ExpressionException ex) {
                this.resultValue = new BigDecimal(0);
                this.stringResult = "";
                this.hasException = true;
            } catch (ArithmeticException ex) {
                //StatementControlOverseer.getInstance().setCurrentCatchClause(IAttemptCommand.CatchTypeEnum.ARITHMETIC_EXCEPTION);

//                ExecutionManager.getInstance().setCurrentCheckedLineNumber(this.parentExprCtx.getStart().getLine());
//                ExecutionManager.getInstance().setCurrentCatchType(IAttemptCommand.CatchTypeEnum.ARITHMETIC_EXCEPTION);

                this.resultValue = new BigDecimal(0);
                this.stringResult = "";
                this.hasException = true;
            }

        }

    }

    public static boolean isArrayElement(CorgiParser.ExpressionContext exprCtx) {
        if (exprCtx.expression(0) != null && exprCtx.expression(1) != null) {
            CorgiValue value = CorgiValueSearcher.searchVariable(exprCtx.expression(0).getText());

            if (value != null)
                return value.getPrimitiveType() == PrimitiveType.ARRAY;
            else
                return false;
        } else {
            return false;
        }
    }

    public String getStringResult() {
        return stringResult;
    }

    public static boolean isArray(String s) {
        CorgiValue value = CorgiValueSearcher.searchVariable(s);

        if (value != null) {
            return value.getPrimitiveType() == PrimitiveType.ARRAY;
        }

        return false;
    }



    public static boolean isArray(CorgiParser.ExpressionContext exprCtx) {
        CorgiValue value = CorgiValueSearcher.searchVariable(exprCtx.getText());

        if (value != null) {
            return value.getPrimitiveType() == PrimitiveType.ARRAY && !isArrayElement(exprCtx);
        }

        return false;
    }

    @Override
    public void visitTerminal(TerminalNode node) {

    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if (ctx instanceof CorgiParser.ExpressionContext) {
            CorgiParser.ExpressionContext exprCtx = (CorgiParser.ExpressionContext) ctx;
            if (EvaluationCommand.isFunctionCall(exprCtx)) {
                this.evaluateFunctionCall(exprCtx);
            } else if(SymbolTableManager.getInstance().getCorgiScope().getFunction(exprCtx.getText()) != null){

            }
            else if (EvaluationCommand.isVariableOrConst(exprCtx)) {
                this.evaluateVariable(exprCtx);
            }
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    public static boolean isFunctionCall(CorgiParser.ExpressionContext exprCtx) {
        Pattern functionPattern = Pattern.compile("([a-zA-Z0-9]+)\\(([ ,.a-zA-Z0-9]*)\\)");

        if (exprCtx.expressionList() != null || functionPattern.matcher(exprCtx.getText()).matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isVariableOrConst(CorgiParser.ExpressionContext exprCtx) {
        if (exprCtx.primary() != null && exprCtx.primary().Identifier() != null) {
            return true;
        } else {
            return false;
        }
    }

    private void evaluateFunctionCall(CorgiParser.ExpressionContext exprCtx) {
        String functionName = exprCtx.expression(0).getText();

        CorgiScope corgiScope = SymbolTableManager.getInstance().getCorgiScope();
        CorgiFunction corgiFunction = corgiScope.getFunction(functionName);

        if (exprCtx.expressionList() != null) {
            List<CorgiParser.ExpressionContext> exprCtxList = exprCtx.expressionList().expression();

            for (int i = 0; i < exprCtxList.size(); i++) {
                CorgiParser.ExpressionContext parameterExprCtx = exprCtxList.get(i);

                EvaluationCommand evaluationCommand = new EvaluationCommand(parameterExprCtx);
                evaluationCommand.execute();

                corgiFunction.mapParameterByValueAt(evaluationCommand.getResult().toEngineeringString(), i);
            }
        }

        corgiFunction.execute();

//        Log.i(TAG, "Before modified EXP function call: " +this.modifiedExp);
        this.modifiedExp = this.modifiedExp.replace(exprCtx.getText(),
                corgiFunction.getReturnValue().getValue().toString());
//        Log.i(TAG, "After modified EXP function call: " +this.modifiedExp);

    }

    private void evaluateVariable(CorgiParser.ExpressionContext exprCtx) {
        CorgiValue corgiValue = VariableSearcher
                .searchVariable(exprCtx.getText());
        this.modifiedExp = this.modifiedExp.replaceFirst(exprCtx.getText(),
                corgiValue.getValue().toString());
    }

    /*
     * Returns the result
     */
    public BigDecimal getResult() {
        return this.resultValue;
    }

    private int evaluateBoolean (String exp) throws ScriptException {
        String temp = exp;
        exp.replace("&&", "*");
        exp.replace("||", "+");

        String stringTemp;

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        //System.out.println(engine.eval(exp).toString());
        stringTemp = engine.eval(exp).toString();
       // System.out.println(engine.eval(exp));

        if (stringTemp.equals("false"))
            return 0;
        else
            return 1;


    }

    public boolean isNumericResult() {
        return isNumeric;
    }

    public boolean hasException() {
        return hasException;
    }


}

