package Commands;

import Builder.BuildChecker;
import Builder.SemanticErrorDictionary;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiArray;
import org.antlr.v4.runtime.Token;

public class ArrayInitializeCommand implements ICommand {

    private CorgiArray assignedCorgiArray;
    private CorgiParser.ArrayCreatorRestContext arrayCreatorCtx;

    public ArrayInitializeCommand(CorgiArray corgiArray, CorgiParser.ArrayCreatorRestContext arrayCreatorCtx) {
        this.assignedCorgiArray = corgiArray;
        this.arrayCreatorCtx = arrayCreatorCtx;
    }

    @Override
    public void execute() {
        CorgiParser.ExpressionContext exprCtx = this.arrayCreatorCtx.expression(0);

        if(exprCtx != null&&isInteger(exprCtx.getText())) {
            EvaluationCommand evaluationCommand = new EvaluationCommand(exprCtx);
            evaluationCommand.execute();

            this.assignedCorgiArray.initializeSize(evaluationCommand.getResult().intValue());
        }

    }

    public boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }

}