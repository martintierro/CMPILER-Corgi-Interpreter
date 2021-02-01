package Mapping;

import Execution.FunctionTracker;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiValue;

public class IdentifierMapper implements IValueMapper{
    private final static String TAG = "MobiProg_IdentifierMapper";

    private IValueMapper valueMapper;

    public IdentifierMapper(String originalExp) {
        if(FunctionTracker.getInstance().isInsideFunction()) {
            this.valueMapper = new FunctionIdentifierMapper(originalExp, FunctionTracker.getInstance().getLatestFunction());
        }
    }

    @Override
    public void analyze(CorgiParser.ExpressionContext exprCtx) {
        this.valueMapper.analyze(exprCtx);
    }

    @Override
    public void analyze(CorgiParser.ParExpressionContext exprCtx) {
        this.valueMapper.analyze(exprCtx);
    }

    @Override
    public String getOriginalExp() {
        return this.valueMapper.getOriginalExp();
    }

    @Override
    public String getModifiedExp() {
        return this.valueMapper.getModifiedExp();
    }

    @Override
    public CorgiValue getCorgiValue() {
        return this.valueMapper.getCorgiValue();
    }
}
