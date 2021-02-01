package ErrorChecker;

import Builder.BuildChecker;
import Builder.SemanticErrorDictionary;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiFunction;
import Semantics.MainScope;
import Semantics.SymbolTableManager;
import org.antlr.v4.runtime.Token;

public class MultipleFuncDecChecker implements IErrorChecker {
    private final static String TAG = "MobiProg_MultipleFuncDecChecker";

    private CorgiParser.MethodDeclarationContext methodDecCtx;
    private int lineNumber;

    public MultipleFuncDecChecker(CorgiParser.MethodDeclarationContext methodDecCtx) {
        this.methodDecCtx = methodDecCtx;

        Token firstToken = methodDecCtx.getStart();
        this.lineNumber = firstToken.getLine();
    }

    @Override
    public void verify() {
        this.verifyFunctionCall(this.methodDecCtx.Identifier().getText());
    }

    private void verifyFunctionCall(String identifierString) {

        MainScope mainScope = SymbolTableManager.getInstance().getMainScope();
        CorgiFunction corgiFunction = mainScope.getFunction(identifierString);

        if(corgiFunction != null) {
            BuildChecker.reportCustomError(SemanticErrorDictionary.MULTIPLE_FUNCTION, "", identifierString, this.lineNumber);
        }
    }

}