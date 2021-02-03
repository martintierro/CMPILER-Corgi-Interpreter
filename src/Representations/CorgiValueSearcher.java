package Representations;

import Execution.FunctionTracker;
import Semantics.LocalScopeHandler;
import Semantics.CorgiScope;
import Semantics.SymbolTableManager;

public class CorgiValueSearcher {

    public static CorgiValue searchVariable(String identifierString) {
        CorgiValue corgiValue = null;

        if(FunctionTracker.getInstance().isInsideFunction()) {
            corgiValue = searchVariableInFunction(FunctionTracker.getInstance().getLatestFunction(), identifierString);
        }

        if(corgiValue == null) {
            CorgiScope corgiScope = SymbolTableManager.getInstance().getCorgiScope();
            corgiValue = searchVariableInClassIncludingLocal(corgiScope, identifierString);
        }

        return corgiValue;
    }

    public static CorgiValue searchVariableInFunction(CorgiFunction mobiFunction, String identifierString) {
        CorgiValue corgiValue = null;

        if(mobiFunction.hasParameter(identifierString)) {
            corgiValue = mobiFunction.getParameter(identifierString);
        }
        else {
            corgiValue = LocalScopeHandler.searchVariableInLocalIterative(identifierString, mobiFunction.getParentLocalScope());
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
