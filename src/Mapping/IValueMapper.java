package Mapping;

import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiValue;

public interface IValueMapper {
    public abstract void analyze(CorgiParser.ExpressionContext exprCtx);
    public abstract String getOriginalExp();
    public abstract String getModifiedExp();
    public abstract CorgiValue getMobiValue();
}
