package Builder;

import GeneratedAntlrClasses.CorgiBaseListener;
import GeneratedAntlrClasses.CorgiLexer;
import GeneratedAntlrClasses.CorgiParser;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ParserHandler {

    private static ParserHandler sharedInstance = null;

    public static ParserHandler getInstance() {
        if(sharedInstance == null) {
            sharedInstance = new ParserHandler();
        }

        return sharedInstance;
    }

    private CorgiLexer corgiLexer;
    private CorgiParser corgiParser;

    private String currentClassName; //the current class being parsed

    private ParserHandler() {

    }

    public void parseText(String textToParse) throws IOException {
        InputStream stream = new ByteArrayInputStream(textToParse.getBytes(StandardCharsets.UTF_8));
        CharStream charStream = CharStreams.fromStream(stream);
        this.corgiLexer = new CorgiLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(this.corgiLexer);
        this.corgiParser = new CorgiParser(tokens);
        this.corgiParser.removeErrorListeners();
        this.corgiParser.addErrorListener(BuildChecker.getInstance());

        ParserRuleContext parserRuleContext = this.corgiParser.start();

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(new CorgiBaseListener(), parserRuleContext);

    }

}