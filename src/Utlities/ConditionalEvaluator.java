package Utlities;

import Evaluation.EvaluationCommand;
import GeneratedAntlrClasses.CorgiParser;

public class ConditionalEvaluator {

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
}
