package Commands;

import Evaluation.EvaluationCommand;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiArray;

public class ArrayInitializeCommand implements ICommand {
    private final static String TAG = "ArrayInitializeCommand";

    private CorgiArray corgiArray;
    private CorgiParser.ArrayCreatorRestContext arrayCreatorCtx;

    public ArrayInitializeCommand(CorgiArray mobiArray, CorgiParser.ArrayCreatorRestContext arrayCreatorCtx) {
        this.corgiArray = mobiArray;
        this.arrayCreatorCtx = arrayCreatorCtx;
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.execution.commands.ICommand#execute()
     */
    @Override
    public void execute() {
        CorgiParser.ExpressionContext exprCtx = this.arrayCreatorCtx.expression(0);

        if(exprCtx != null) {
            EvaluationCommand evaluationCommand = new EvaluationCommand(exprCtx);
            evaluationCommand.execute();

            this.corgiArray.initializeSize(evaluationCommand.getResult().intValue());
        }

    }

}
