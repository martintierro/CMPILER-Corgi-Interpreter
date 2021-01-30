import GeneratedAntlrClasses.CorgiBaseVisitor;
import GeneratedAntlrClasses.CorgiLexer;
import GeneratedAntlrClasses.CorgiParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Driver {
    public static void main(String[] args) {

        CharStream cs = null;  //load the file
        try {
            cs = fromFileName("Parser/IO/program.txt");
            CorgiLexer lexer = new CorgiLexer(cs);  //instantiate a lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
            CorgiParser parser = new CorgiParser(tokens);  //parse the tokens

            parser.removeErrorListeners();
            parser.addErrorListener(CustomErrorListener.INSTANCE);

            ParseTree tree = parser.mainDeclaration(); // parse the content and get the tree

            CorgiBaseVisitor visitor = new CorgiBaseVisitor();
            visitor.visit(tree);
        } catch (IOException e) {
            System.out.println("File could not be opened");
        }
    }
}
