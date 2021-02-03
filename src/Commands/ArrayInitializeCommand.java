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

        if(exprCtx != null) {
            EvaluationCommand evaluationCommand = new EvaluationCommand(exprCtx);
            evaluationCommand.execute();

            if (isInteger(evaluationCommand.getResult().toString()))
                this.assignedCorgiArray.initializeSize(evaluationCommand.getResult().intValue());
            else{
                Token token = arrayCreatorCtx.expression(0).getStart();
              BuildChecker.reportCustomError(SemanticErrorDictionary.TYPE_MISMATCH,"Array Size should be integer." , token.getLine());
            }
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