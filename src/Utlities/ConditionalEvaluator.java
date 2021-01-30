package Utlities;

import Commands.EvaluationCommand;
import GeneratedAntlrClasses.CorgiParser;
import com.udojava.evalex.Expression;

import java.math.BigDecimal;

public class ConditionalEvaluator {

    public static boolean evaluateCondition(CorgiParser.ParExpressionContext parExprCtx) {

        CorgiParser.ExpressionContext conditionExprCtx = parExprCtx.expression();

        //catch rules if the if value has direct boolean flags
        if(conditionExprCtx.getText().contains("(true)")) {
            return true;
        }
        else if(conditionExprCtx.getText().contains("(false)")) {
            return false;
        }

        EvaluationCommand evaluationCommand = new EvaluationCommand(conditionExprCtx);
        evaluationCommand.execute();

        int result = evaluationCommand.getResult().intValue();

        //Console.log("Evaluating: " +conditionExprCtx.getText() + " Result: " +result);

        return (result == 1);
    }

    public static boolean evaluateCondition(CorgiParser.ExpressionContext expressionContext) {


        //catch rules if the if value has direct boolean flags
        if(expressionContext.getText().contains("true")) {
            return true;
        }
        else if(expressionContext.getText().contains("false")) {
            return false;
        }

        EvaluationCommand evaluationCommand = new EvaluationCommand(expressionContext);
        evaluationCommand.execute();

        int result = evaluationCommand.getResult().intValue();

        //Console.log("Evaluating: " +conditionExprCtx.getText() + " Result: " +result);

        return (result == 1);
    }

    public static boolean evaluateCondition(String condition) {

        //catch rules if the if value has direct boolean flags
        if(condition.contains("(true)")) {
            return true;
        }
        else if(condition.contains("(false)")) {
            return false;
        }

        if (condition.contains("!")) {
            condition = condition.replaceAll("!", "not");
            condition = condition.replaceAll("not=", "!=");
        }

        if (condition.contains("and")) {
            condition = condition.replaceAll("and", "&&");
        }

        if (condition.contains("or")) {
            condition = condition.replaceAll("or", "||");
        }

        Expression expression = new Expression(condition);

        BigDecimal result = expression.eval();

        return (1 == Integer.parseInt(result.toEngineeringString()));
    }
}
