package Mapping;

import Execution.FunctionTracker;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiValue;

public class IdentifierMapper implements IValueMapper{

    private IValueMapper valueMapper;

    public IdentifierMapper(String originalExp) {
        if(FunctionTracker.getInstance().isInsideFunction()) {
            this.valueMapper = new FunctionIdentifierMapper(originalExp, FunctionTracker.getInstance().getLatestFunction());
        }
    }


    @Override
    public void analyze(CorgiParser.ExpressionContext exprCtx) {

    }

    public void analyze(CorgiParser.ParExpressionContext exprCtx) {

    }

    @Override
    public String getOriginalExp() {
        return null;
    }

    @Override
    public String getModifiedExp() {
        return null;
    }

    @Override
    public CorgiValue getCorgiValue() {
        return null;
    }
}
