package Searcher;

import Builder.ParserHandler;
import Execution.FunctionTracker;
import Representations.CorgiFunction;
import Representations.CorgiValue;
import Semantics.LocalScope;
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

    public static CorgiValue searchVariableInFunction(CorgiFunction corgiFunction, String identifierString) {
        CorgiValue corgiValue = null;

        if(corgiFunction.hasParameter(identifierString)) {
            corgiValue = corgiFunction.getParameter(identifierString);
        }
        else {
            corgiValue = LocalScopeCreator.searchVariableInLocalIterative(identifierString, corgiFunction.getParentLocalScope());
        }

        return corgiValue;
    }

    public static CorgiValue searchVariableInClassIncludingLocal(MainScope mainScope, String identifierString) {
        return mainScope.searchVariableIncludingLocal(identifierString);
    }

    public static CorgiValue searchVariableInClass(MainScope mainScope, String identifierString) {
        return mainScope.getVariable(identifierString);
    }

}