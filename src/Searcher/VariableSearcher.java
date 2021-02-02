package Searcher;

import Execution.FunctionTracker;
import Representations.CorgiFunction;
import Representations.CorgiValue;
import Semantics.LocalScopeHandler;
import Semantics.CorgiScope;
import Semantics.SymbolTableManager;

public class VariableSearcher {

    public static CorgiValue searchVariable(String identifierString) {
        CorgiValue corgiValue = null;

        if(FunctionTracker.getInstance().isInsideFunction()) {
            corgiValue = searchVariableInFunction(FunctionTracker.getInstance().getLatestFunction(), identifierString);
        }

        if(corgiValue == null) {
            CorgiScope corgiScope = SymbolTableManager.getInstance().getMainScope();
            corgiValue = searchVariableInClassIncludingLocal(corgiScope, identifierString);
        }

        return corgiValue;
    }

    public static CorgiValue searchVariableInFunction(CorgiFunction corgiFunction, String identifierString) {
        CorgiValue corgiValue = null;

        if(corgiFunction.hasParameter(identifierString)) {
            corgiValue = corgiFunction.getParameter(identifierString);
        }
        else {
            corgiValue = LocalScopeHandler.searchVariableInLocalIterative(identifierString, corgiFunction.getParentLocalScope());
        }

        return corgiValue;
    }

    public static CorgiValue searchVariableInClassIncludingLocal(CorgiScope corgiScope, String identifierString) {
        return corgiScope.searchVariableIncludingLocal(identifierString);
    }

    public static CorgiValue searchVariableInClass(CorgiScope corgiScope, String identifierString) {
        return corgiScope.getVariable(identifierString);
    }

}