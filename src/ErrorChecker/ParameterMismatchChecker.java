package ErrorChecker;

import Builder.BuildChecker;
import Builder.SemanticErrorDictionary;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiFunction;

import java.util.List;

public class ParameterMismatchChecker implements IErrorChecker {
    private final static String TAG = "MobiProg_ParameterMismatchChecker";

    private CorgiFunction corgiFunction;
    private List<CorgiParser.ExpressionContext> exprCtxList;
    private int lineNumber;

    public ParameterMismatchChecker(CorgiFunction corgiFunction, CorgiParser.ArgumentsContext argumentsCtx) {
        this.corgiFunction = corgiFunction;

        if(argumentsCtx.expressionList() != null) {
            this.exprCtxList = argumentsCtx.expressionList().expression();
        }

        this.lineNumber = argumentsCtx.getStart().getLine();
    }

    /* (non-Javadoc)
     * @see com.neildg.mobiprog.builder.errorcheckers.IErrorChecker#verify()
     */
    @Override
    public void verify() {
        if(this.corgiFunction == null) {
            return;
        }

        if(this.exprCtxList == null && this.corgiFunction.getParameterValueSize() != 0) {
            BuildChecker.reportCustomError(SemanticErrorDictionary.PARAMETER_COUNT_MISMATCH, "", this.corgiFunction.getFunctionName(), this.lineNumber);
        }
        else if(this.exprCtxList != null && this.exprCtxList.size() != this.corgiFunction.getParameterValueSize()) {
            BuildChecker.reportCustomError(SemanticErrorDictionary.PARAMETER_COUNT_MISMATCH, "", this.corgiFunction.getFunctionName(), this.lineNumber);
        }
    }

}