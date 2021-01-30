package Builder;

import GeneratedAntlrClasses.CorgiBaseListener;
import GeneratedAntlrClasses.CorgiLexer;
import GeneratedAntlrClasses.CorgiParser;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenSource;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ParserHandler {

    private final static String TAG = "MobiProg_ParserHandler";
    private static ParserHandler sharedInstance = null;

    public static ParserHandler getInstance() {
        if(sharedInstance == null) {
            sharedInstance = new ParserHandler();
        }

        return sharedInstance;
    }

    private CorgiLexer sharedLexer;
    private CorgiParser sharedParser;

    private String currentClassName; //the current class being parsed

    private ParserHandler() {

    }

    public void parseText(String textToParse) throws IOException {
        InputStream stream = new ByteArrayInputStream(textToParse.getBytes(StandardCharsets.UTF_8));
        this.sharedLexer = new CorgiLexer((CharStream) new ANTLRInputStream(stream));
        CommonTokenStream tokens = new CommonTokenStream((TokenSource) this.sharedLexer);
        this.sharedParser = new CorgiParser((TokenStream) tokens);
        this.sharedParser.removeErrorListeners();
        this.sharedParser.addErrorListener(BuildChecker.getInstance());

        ParserRuleContext parserRuleContext = this.sharedParser.compilationUnit();

        ParseTreeWalker treeWalker = new ParseTreeWalker();
      //  treeWalker.walk(new JavaBaseImplementor(), parserRuleContext);
        treeWalker.walk(new CorgiBaseListener(), parserRuleContext);

    }

}