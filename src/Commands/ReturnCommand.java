package Commands;

import ErrorChecker.TypeChecker;
import ErrorChecker.UndeclaredChecker;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiFunction;
import Representations.CorgiValue;
import Utlities.AssignmentUtilities;

public class ReturnCommand implements ICommand {

    private CorgiParser.ExpressionContext expressionCtx;
    private CorgiFunction assignedCorgiFunction;

    public ReturnCommand(CorgiParser.ExpressionContext expressionCtx, CorgiFunction corgiFunction) {
        this.expressionCtx = expressionCtx;
        this.assignedCorgiFunction = corgiFunction;

        UndeclaredChecker undeclaredChecker = new UndeclaredChecker(this.expressionCtx);
        undeclaredChecker.verify();

        CorgiValue corgiValue = this.assignedCorgiFunction.getReturnValue();
        TypeChecker typeChecker = new TypeChecker(corgiValue, this.expressionCtx);
        typeChecker.verify();
    }

    @Override
    public void execute() {
        EvaluationCommand evaluationCommand = new EvaluationCommand(this.expressionCtx);
        evaluationCommand.execute();

        CorgiValue corgiValue = this.assignedCorgiFunction.getReturnValue();

        AssignmentUtilities.assignAppropriateValue(corgiValue, evaluationCommand.getResult());
        //Console.log(LogType.DEBUG,"Return value is: " +evaluationCommand.getResult().toEngineeringString());
    }

}