package Commands;

import Builder.BuildChecker;
import Builder.SemanticErrorDictionary;
import ErrorChecker.TypeChecker;
import ErrorChecker.UndeclaredChecker;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiFunction;
import Representations.CorgiValue;
import Utlities.AssignmentUtilities;
import org.antlr.v4.runtime.Token;

public class ReturnCommand implements ICommand {

    private CorgiParser.ExpressionContext expressionCtx;
    private CorgiFunction corgiFunction;

    public ReturnCommand(CorgiParser.ExpressionContext expressionCtx, CorgiFunction corgiFunction) {
        this.expressionCtx = expressionCtx;
        this.corgiFunction = corgiFunction;

        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.expressionCtx);
        undeclaredChecker.verify();

        CorgiValue corgiValue = this.corgiFunction.getReturnValue();

        if (corgiValue == null) {
            Token firstToken = this.expressionCtx.getStart();
            int lineNumber = firstToken.getLine();

            BuildChecker.reportCustomError(SemanticErrorDictionary.RETURN_IN_VOID, "", lineNumber);
        }

        TypeChecker typeChecker = new TypeChecker(corgiValue, this.expressionCtx);
        typeChecker.verify();
    }
    
    @Override
    public void execute() {
        EvaluationCommand evaluationCommand = new EvaluationCommand(this.expressionCtx);
        evaluationCommand.execute();

        CorgiValue corgiValue = this.corgiFunction.getReturnValue();

        if (evaluationCommand.isNumericResult())
            AssignmentUtilities.assignAppropriateValue(corgiValue, evaluationCommand.getResult());
        else
            AssignmentUtilities.assignAppropriateValue(corgiValue, evaluationCommand.getStringResult());
        //Console.log(LogType.DEBUG,"Return value is: " +evaluationCommand.getResult().toEngineeringString());
    }

}