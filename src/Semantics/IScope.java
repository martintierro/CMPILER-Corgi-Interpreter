package Semantics;

import Representations.CorgiValue;

public interface IScope {
    public abstract CorgiValue searchVariableIncludingLocal(String identifier);
    public abstract boolean isParent();
}
