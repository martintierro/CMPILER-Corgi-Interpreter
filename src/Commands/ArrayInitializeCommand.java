package Commands;

import Execution.ExecutionManager;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiArray;

public class ArrayInitializeCommand implements ICommand {
    private final static String TAG = "ArrayInitializeCommand";

    private CorgiArray corgiArray;
    private CorgiParser.ArrayCreatorRestContext arrayCreatorCtx;

    public ArrayInitializeCommand(CorgiArray corgiArray, CorgiParser.ArrayCreatorRestContext arrayCreatorCtx) {
        this.corgiArray = corgiArray;
        this.arrayCreatorCtx = arrayCreatorCtx;
    }

    @Override
    public void execute() {
        CorgiParser.ExpressionContext exprCtx = this.arrayCreatorCtx.expression(0);

        if(exprCtx != null) {
            EvaluationCommand evaluationCommand = new EvaluationCommand(exprCtx);
            evaluationCommand.execute();

            ExecutionManager.getInstance().setCurrentCheckedLineNumber(exprCtx.getStart().getLine());
            this.corgiArray.initializeSize(evaluationCommand.getResult().intValue());
        }

    }

}
