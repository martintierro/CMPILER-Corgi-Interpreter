package Builder;

import ANTLR.CorgiError;
import GeneratedAntlrClasses.CorgiLexer;
import IDE.View;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public class BuildChecker extends BaseErrorListener {

   // private final String[] keywords = new String[]{"const", "void", "public", "private", "static", "final", "int", "double", "short", "long", "char", "float", "woof"};

    private static BuildChecker sharedInstance = null;

    private boolean successful = true;

    private ArrayList<CorgiError> errors;

    public static BuildChecker getInstance() {
        return sharedInstance;
    }

    private BuildChecker() {
        errors = new ArrayList<>();
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
        CorgiError error = new CorgiError();
        error.setLineNumber(line);
        error.setCharNumber(charPositionInLine);

        if (msg.contains(CorgiError.MISSING_KEY)) {

            error.setType(CorgiError.ErrorType.MISSING);

            String split[] = msg.split(CorgiError.MISSING_KEY);

            String tokens[] = split[1].split("at");

            error.setErrorPrefix("Missing " + tokens[0] + " before " + tokens[1] + " at ");
            error.setLineLayout("line " + line + " at " + charPositionInLine);
            error.setErrorSuffix(". Try adding " + tokens[0] + " before " + tokens[1] + ".");

        } else if (msg.contains(CorgiError.NO_VIABLE_ALT_KEY)) {

            error.setType(CorgiError.ErrorType.NO_VIABLE_ALTERNATIVE);

            String split[] = msg.split(CorgiError.NO_VIABLE_ALT_KEY);

            error.setErrorPrefix("Could not resolve the token " + split[1] + " at ");
            error.setLineLayout("line " + line + " at " + charPositionInLine);
            error.setErrorSuffix(".");

        } else if (msg.contains(CorgiError.MISMATCHED_INPUT_KEY)) {

            error.setType(CorgiError.ErrorType.MISMATCHED_INPUT);

            String split[] = msg.split(CorgiError.MISMATCHED_INPUT_KEY);

            String str[] = new String[1];

            if (split[1].contains("expecting")) {
                str = split[1].split("expecting");
            }

            error.setLineLayout("line " + line + " at " + charPositionInLine);
            error.setErrorSuffix(".");

            if (str[1].contains("IntegerLiteral") && str[1].contains("FloatingPointLiteral") && str[1].contains("BooleanLiteral") && str[1].contains("CharacterLiteral")
                    && str[1].contains("StringLiteral") && str[1].contains("Identifier")) {

                error.setErrorPrefix("Mismatched input " + str[0] + " try replacing it with an expression at ");
            } else if (str[1].contains("Identifier")) {
                //resultedMessage = "Expected identifier at line " + i + " at " + i1;

                error.setErrorPrefix("Expected identifier at ");
            } else {

                error.setErrorPrefix("Mismatched input " + str[0] + " try replacing it with " + str[1] + " at ");
            }

        } else if (msg.contains(CorgiError.EXTRANEOUS_INPUT_KEY)) {

            error.setType(CorgiError.ErrorType.EXTRANEOUS_INPUT);

            String split[] = msg.split(CorgiError.EXTRANEOUS_INPUT_KEY);

            error.setLineLayout("line " + line + " at " + charPositionInLine);
            error.setErrorPrefix("Extraneous Input at ");

            String str[] = new String[1];
            for (int k = 0; k < split.length; k++) { // test
                //System.out.print("k: ");
                split[k] = split[k].trim();

                if (split[k].contains("expecting")) {
                    str = split[k].split("expecting");
                }
            }

            if (str[1].contains("'end'")) {

                error.setErrorPrefix("Missing 'end' statement at ");
                error.setErrorSuffix(".");

            } else if (str[1].contains("IntegerLiteral") && str[1].contains("FloatingPointLiteral") && str[1].contains("BooleanLiteral") && str[1].contains("CharacterLiteral")
                    && str[1].contains("StringLiteral") && str[1].contains("Identifier")) {

                System.out.println("--==-=-=-==" + line);

                error.setErrorSuffix(" : Consider removing " + str[0] + " and replacing it with an expression.");

            } else if (str[1].contains("Identifier"))  {

                error.setErrorSuffix(" : Consider removing " + str[0] + " and replacing it with an identifier.");

            } else {

                error.setErrorSuffix(" : Consider removing " + str[0] + " and replacing it with " + str[1] + ".");

            }

        } else if (msg.contains(CorgiError.TOKEN_RECOGNITION_KEY)) {
            error.setType(CorgiError.ErrorType.TOKEN_RECOGNITION);

            error.setErrorPrefix("Token recognition error at ");
            error.setLineLayout("line " + line + " @ " + charPositionInLine);
            error.setErrorSuffix(".");
        }

        View.appendErrorInConsole(error);
        errors.add(error);


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

    public void setSuccessful(boolean b) {
        successful = b;
    }


    private void sortErrors (){

        for (int i = 0; i<errors.size()-1; i++){
            for (int j = 0; j<errors.size()-i-1; j++){
                if (errors.get(j).getLineNumber()==errors.get(j).getLineNumber()){
                    if (errors.get(j).getCharNumber()>errors.get(j).getCharNumber()+1){
                        CorgiError temp = errors.get(j);
                        errors.set(j,  errors.get(j+1));
                        errors.set(j+1, temp);
                    }
                }

                else if (errors.get(j).getLineNumber()>errors.get(j).getLineNumber()){
                    CorgiError temp = errors.get(j);
                    errors.set(j,  errors.get(j+1));
                    errors.set(j+1, temp);
                }
            }
        }

    }




}