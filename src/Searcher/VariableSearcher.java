package Searcher;

import Builder.ParserHandler;
import Execution.FunctionTracker;
import Representations.CorgiFunction;
import Representations.CorgiValue;
import Semantics.LocalScopeCreator;
import Semantics.MainScope;
import Semantics.SymbolTableManager;

public class VariableSearcher {
    private final static String TAG = "VariableSearcher";

    public static CorgiValue searchVariable(String identifierString) {
        CorgiValue corgiValue = null;

        if(FunctionTracker.getInstance().isInsideFunction()) {
            corgiValue = searchVariableInFunction(FunctionTracker.getInstance().getLatestFunction(), identifierString);
        }

        if(corgiValue == null) {
            MainScope mainScope = SymbolTableManager.getInstance().getMainScope();
            corgiValue = searchVariableInClassIncludingLocal(mainScope, identifierString);
        }

        return corgiValue;
    }

    public static CorgiValue searchVariableInFunction(CorgiFunction mobiFunction, String identifierString) {
        CorgiValue mobiValue = null;

        if(mobiFunction.hasParameter(identifierString)) {
            mobiValue = mobiFunction.getParameter(identifierString);
        }
        else {
            mobiValue = LocalScopeCreator.searchVariableInLocalIterative(identifierString, mobiFunction.getParentLocalScope());
        }

        return mobiValue;
    }

    public static CorgiValue searchVariableInClassIncludingLocal(MainScope classScope, String identifierString) {
        return classScope.searchVariableIncludingLocal(identifierString);
    }

    public static CorgiValue searchVariableInClass(MainScope classScope, String identifierString) {
        return classScope.getVariable(identifierString);
    }

}