package ErrorChecker;

import Builder.BuildChecker;
import Builder.SemanticErrorDictionary;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiFunction;
import Semantics.CorgiScope;
import Semantics.SymbolTableManager;
import org.antlr.v4.runtime.Token;

public class MultipleFuncDecChecker implements IErrorChecker {

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

        CorgiScope corgiScope = SymbolTableManager.getInstance().getMainScope();
        CorgiFunction corgiFunction = corgiScope.getFunction(identifierString);

        if(corgiFunction != null) {
            BuildChecker.reportCustomError(SemanticErrorDictionary.MULTIPLE_FUNCTION, "", identifierString, this.lineNumber);
        }
    }

}