package ANTLR;

import Builder.BuildChecker;
import Controller.Controller;
import IDE.View;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CorgiErrorListener extends BaseErrorListener {

    private ArrayList<CorgiError> errors;
    private Controller controller;

    public CorgiErrorListener (Controller controller) {
        errors = new ArrayList<CorgiError>();

        this.controller = controller;
    }

    public CorgiErrorListener () {
        errors = new ArrayList<CorgiError>();

        //this.controller = controller;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
        //System.err.println("Syntax Error @ Line " + i + " : " + i1 + " " + s);

        // TODO :
        // IDENTIFY ERRORS FROM String s
        //  - Extraneous Input
        //  - Mismatched Input
        //  - No viable alternative
        //  - Missing
        //  - Token Recognition
        // CREATE OWN ERROR MESSAGES AND SUGGESTIONS
        // THEN ADD THEM TO ERRORS LIST
        // USE getErrors() IN PRINTING THE ERRORS IN CONSOLE

        List<String> stack = ((Parser)recognizer).getRuleInvocationStack(); Collections.reverse(stack);
        //System.err.println("rule stack: "+stack);
        System.err.println("line "+i+":"+i1+" at "+": "+s);

        CorgiError error = new CorgiError();

        error.setLineNumber(i);
        error.setCharNumber(i1);


        if (s.contains(CorgiError.MISSING_KEY)) {

            error.setType(CorgiError.ErrorType.MISSING);

            String split[] = s.split(CorgiError.MISSING_KEY);

            String tokens[] = split[1].split("at");

            error.setErrorPrefix("Missing " + tokens[0] + " before " + tokens[1] + " at ");
            error.setLineLayout("line " + i + " @ " + i1);
            error.setErrorSuffix(". Try adding " + tokens[0] + " before " + tokens[1] + ".");

        } else if (s.contains(CorgiError.NO_VIABLE_ALT_KEY)) {

            error.setType(CorgiError.ErrorType.NO_VIABLE_ALTERNATIVE);

            String split[] = s.split(CorgiError.NO_VIABLE_ALT_KEY);

            error.setErrorPrefix("Could not resolve the token " + split[1] + " at ");
            error.setLineLayout("line " + i + " @ " + i1);
            error.setErrorSuffix(".");

        } else if (s.contains(CorgiError.MISMATCHED_INPUT_KEY)) {

            error.setType(CorgiError.ErrorType.MISMATCHED_INPUT);

            String split[] = s.split(CorgiError.MISMATCHED_INPUT_KEY);

            String str[] = new String[1];

            if (split[1].contains("expecting")) {
                str = split[1].split("expecting");
            }

            error.setLineLayout("line " + i + " @ " + i1);
            error.setErrorSuffix(".");

            if (str[1].contains("IntegerLiteral") && str[1].contains("FloatingPointLiteral") && str[1].contains("BooleanLiteral") && str[1].contains("CharacterLiteral")
                    && str[1].contains("StringLiteral") && str[1].contains("Identifier")) {

                error.setErrorPrefix("Mismatched input " + str[0] + " try replacing it with an expression at ");
            } else if (str[1].contains("Identifier")) {
                //resultedMessage = "Expected identifier at line " + i + " @ " + i1;

                error.setErrorPrefix("Expected identifier at ");
            } else {

                error.setErrorPrefix("Mismatched input " + str[0] + " try replacing it with " + str[1] + " at ");
            }

        } else if (s.contains(CorgiError.EXTRANEOUS_INPUT_KEY)) {

            error.setType(CorgiError.ErrorType.EXTRANEOUS_INPUT);

            String split[] = s.split(CorgiError.EXTRANEOUS_INPUT_KEY);

            error.setLineLayout("line " + i + " @ " + i1);
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

                System.out.println("--==-=-=-==" + i);

                error.setErrorSuffix(" : Consider removing " + str[0] + " and replacing it with an expression.");

            } else if (str[1].contains("Identifier"))  {

                error.setErrorSuffix(" : Consider removing " + str[0] + " and replacing it with an identifier.");

            } else {

                error.setErrorSuffix(" : Consider removing " + str[0] + " and replacing it with " + str[1] + ".");

            }

        } else if (s.contains(CorgiError.TOKEN_RECOGNITION_KEY)) {
            error.setType(CorgiError.ErrorType.TOKEN_RECOGNITION);

            error.setErrorPrefix("Token recognition error at ");
            error.setLineLayout("line " + i + " @ " + i1);
            error.setErrorSuffix(".");
        }

        View.appendErrorInConsole(error);
        errors.add(error);

        BuildChecker.getInstance().setSuccessful(false);
    }

    public ArrayList<CorgiError> getErrors () {
        return this.errors;
    }

    /*@Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
        System.err.println("Ambiguity @ Line " + i + " : " + i1);
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {
        System.err.println("Attempting Full Context @ Line " + i + " : " + i1);
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
        System.err.println("Context Sensitivity @ Line " + i + " : " + i1);
    }*/



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
