package Builder;

import ANTLR.CorgiError;
import GeneratedAntlrClasses.CorgiLexer;
import IDE.View;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public class BuildChecker extends BaseErrorListener {

    private final String[] keywords = new String[]{"const", "void", "public", "private", "static", "final", "int", "double", "short", "long", "char", "float", "woof"};

    private static BuildChecker sharedInstance = null;

    private boolean successful = true;

    public static BuildChecker getInstance() {
        return sharedInstance;
    }

    private BuildChecker() {

    }

    public static void initialize() {
        sharedInstance = new BuildChecker();
        SemanticErrorDictionary.initialize();
    }

    public static void reset() {
        sharedInstance.successful  = true;
        SemanticErrorDictionary.reset();
    }

    public boolean canExecute() {
        return this.successful;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol, int line, int charPositionInLine,
                            String msg, RecognitionException e) {
        System.err.println("Syntax error at line " +line+ ". " +msg); //TODO: change to IDE

        this.successful = false;
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex,
                                int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        // TODO Auto-generated method stub

    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa,
                                            int startIndex, int stopIndex, BitSet conflictingAlts,
                                            ATNConfigSet configs) {
        // TODO Auto-generated method stub

    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa,
                                         int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        // TODO Auto-generated method stub

    }

    public static void reportCustomError(int errorCode, String additionalMessage) {
        String errorMessage = SemanticErrorDictionary.getErrorMessage(errorCode) + " " + additionalMessage;
        System.err.println(errorMessage); //TODO Change to IDE

        sharedInstance.successful = false;
    }

    public static void reportCustomError(int errorCode, String additionalMessage, Object... parameters) {
        String errorMessage = String.format(SemanticErrorDictionary.getErrorMessage(errorCode) + " " + additionalMessage, parameters);
        System.out.println("ERROR: " + errorMessage);
        String[] s = errorMessage.split("line [0-9]+");
        String line = errorMessage.substring(errorMessage.indexOf("line"), errorMessage.indexOf("."));

        String number = errorMessage.substring(errorMessage.indexOf("line ") + 5, errorMessage.indexOf(s[1]));

        CorgiError corgiError = new CorgiError();

        corgiError.setLineNumber( Integer.parseInt(number) );
        corgiError.setErrorPrefix(s[0]);
        corgiError.setLineLayout(line);
        corgiError.setErrorSuffix(s[1]);

        View.appendErrorInConsole(corgiError);


        sharedInstance.successful = false;
    }
}