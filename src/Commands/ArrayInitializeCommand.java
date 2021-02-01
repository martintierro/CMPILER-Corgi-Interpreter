package Commands;

import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiArray;

public class ArrayInitializeCommand implements ICommand {
    private final static String TAG = "ArrayInitializeCommand";

    private CorgiArray assignedCorgiArray;
    private CorgiParser.ArrayCreatorRestContext arrayCreatorCtx;

    public ArrayInitializeCommand(CorgiArray corgiArray, CorgiParser.ArrayCreatorRestContext arrayCreatorCtx) {
        this.assignedCorgiArray = corgiArray;
        this.arrayCreatorCtx = arrayCreatorCtx;
    }

    @Override
    public void execute() {
        CorgiParser.ExpressionContext exprCtx = this.arrayCreatorCtx.expression(0);

        if(exprCtx != null) {
            EvaluationCommand evaluationCommand = new EvaluationCommand(exprCtx);
            evaluationCommand.execute();

            this.assignedCorgiArray.initializeSize(evaluationCommand.getResult().intValue());
        }

    }

}