import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.Collections;
import java.util.List;

public class CustomErrorListener extends BaseErrorListener {

    public static final CustomErrorListener INSTANCE = new CustomErrorListener();

    private final String[] keywords = new String[]{"const", "void", "public", "private", "static", "final", "int", "double", "short", "long", "char", "float", "woof"};

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack(); Collections.reverse(stack);
        CommonToken token = (CommonToken) offendingSymbol;
        CorgiLexer lexer = new CorgiLexer(token.getInputStream());
        String type = lexer.getVocabulary().getSymbolicName(token.getType());
//        System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
        if(msg.contains("missing")){
            String[] temp = msg.split("missing");
            if(temp[1].contains("'}'")){
                System.err.println("Line " + line + ":" + charPositionInLine + " consider adding a '}'");
            }
//            else {
//                String[] tokens = temp[1].split("at");
//                System.err.println("Line " + line + ":" + charPositionInLine + " consider adding" + tokens[0] + "before" + tokens[1]);
//            }
        }
        else if (msg.contains("no viable alternative at input")){
            String[] tokens = msg.split("no viable alternative at input");

//            boolean flag = true;
            for(String keyword: keywords){
                if(tokens[1].contains(keyword)){
                    System.err.println("Line "+ line + ":" + charPositionInLine + " could not find a valid token for" + tokens[1] +". Did you mean '" + keyword + "'?" );
//                    flag = false;
                    break;
                }
            }
//            if(flag){
//                System.err.println("Line "+ line + ":" + charPositionInLine + " could not find a valid token for" + tokens[1] +". Consider changing or removing" + tokens[1] );
//            }


        }
        else if (msg.contains("mismatched input")){
            String[] temp = msg.split("mismatched input");
            String[] tokens = temp[1].split("expecting");
//            if(tokens[1].contains("Identifier")){
//                System.err.println("Line "+ line + ":" + charPositionInLine + tokens[0] + "did not match any token, try replacing with an identifier." );
//            }else
            if(tokens[1].contains("==")){
                System.err.println("Line "+ line + ":" + charPositionInLine + " may be lacking a comparison operator." );
            }
//            else {
//                System.err.println("Line " + line + ":" + charPositionInLine + tokens[0] + "did not match any token, try using" + tokens[1] + ".");
//            }

        } else if (msg.contains("token recognition error")){
            System.err.println("Line "+ line + ":" + charPositionInLine + "has a token recognition error");
        } else if(msg.contains("extraneous input")){
            String[] temp = msg.split("extraneous input");
            String[] tokens = temp[1].split("expecting");

            if(tokens[1].contains("Identifier")){
                System.err.println("Line "+ line + ":" + charPositionInLine + tokens[0] + "may be unnecessary, try adding an identifier." );
            } else {
                System.err.println("Line " + line + ":" + charPositionInLine + " may have extra" + tokens[0] + ". Consider replacing with" + tokens[1]);
            }

        }
        else{
            System.err.println("Line "+ line + ":" + charPositionInLine + " " + msg);
        }
//        System.err.println("line " + line + ":" + charPositionInLine + " " + type);
//        switch (type) {
//            case "RPAREN":
//                System.err.println("line " + line + ":" + charPositionInLine + " Invalid expression in parameters");
//                break;
//            case "ASSIGN":
//                System.err.println("line " + line + ":" + charPositionInLine + " Invalid relational operator");
//                break;
//        }

//        System.err.println("line " + line + ":" +  charPositionInLine + " " + offendingSymbol.getClass());
//        throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
    }
}