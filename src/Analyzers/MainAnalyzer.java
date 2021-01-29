package Analyzers;

import GeneratedAntlrClasses.CorgiLexer;
import GeneratedAntlrClasses.CorgiParser;
import Semantics.MainScope;
import Semantics.SymbolTableManager;
import Utlities.IdentifiedTokenHolder;
import Utlities.KeywordRecognizer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class MainAnalyzer implements ParseTreeListener {
    private final static String TAG = "MobiProg_ClassAnalyzer";

    private MainScope mainScope;
    private IdentifiedTokenHolder identifiedTokenHolder;

    public final static String ACCESS_CONTROL_KEY = "ACCESS_CONTROL_KEY";
    public final static String CONST_CONTROL_KEY = "CONST_CONSTROL_KEY";
    public final static String STATIC_CONTROL_KEY = "STATIC_CONTROL_KEY";
    public final static String PRIMITIVE_TYPE_KEY = "PRIMITIVE_TYPE_KEY";
    public final static String IDENTIFIER_KEY = "IDENTIFIER_KEY";
    public final static String IDENTIFIER_VALUE_KEY = "IDENTIFIER_VALUE_KEY";

    public MainAnalyzer() {

    }

    public void analyze(CorgiParser.ClassDeclarationContext ctx) {
        this.mainScope = new MainScope();
        this.identifiedTokenHolder = new IdentifiedTokenHolder();

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if(ctx instanceof CorgiParser.ClassDeclarationContext) {
            SymbolTableManager.getInstance().getMainScope();
        }

        this.analyzeClassMembers(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    private void analyzeClassMembers(ParserRuleContext ctx) {
        if(ctx instanceof CorgiParser.ClassOrInterfaceModifierContext) {
            CorgiParser.ClassOrInterfaceModifierContext classModifierCtx = (CorgiParser.ClassOrInterfaceModifierContext) ctx;

            this.analyzeModifier(classModifierCtx);
        }

        else if(ctx instanceof CorgiParser.FieldDeclarationContext) {
            CorgiParser.FieldDeclarationContext fieldCtx = (CorgiParser.FieldDeclarationContext) ctx;

            if(fieldCtx.type() != null) {
                CorgiParser.TypeTypeContext typeCtx = fieldCtx.typeType();

                //check if its a primitive type
                if(ClassAnalyzer.isPrimitiveDeclaration(typeCtx)) {
                    CorgiParser.PrimitiveTypeContext primitiveTypeCtx = typeCtx.primitiveType();
                    this.identifiedTokenHolder.addToken(PRIMITIVE_TYPE_KEY, primitiveTypeCtx.getText());

                    //create a field analyzer to walk through declarations
                    FieldAnalyzer fieldAnalyzer = new FieldAnalyzer(this.identifiedTokenHolder, this.mainScope);
                    fieldAnalyzer.analyze(fieldCtx.variableDeclarators());

                    //clear tokens for reause
                    this.identifiedTokenHolder.clearTokens();
                }

                //check if its array declaration
                else if(ClassAnalyzer.isPrimitiveArrayDeclaration(typeCtx)) {
//                    Console.log(LogType.DEBUG, "Primitive array declaration: " +fieldCtx.getText());
                    ArrayAnalyzer arrayAnalyzer = new ArrayAnalyzer(this.identifiedTokenHolder, this.mainScope);
                    arrayAnalyzer.analyze(fieldCtx);
                }

                //this is for class type ctx
                else {

                    //a string identified
                    if(typeCtx.classOrInterfaceType().getText().contains(KeywordRecognizer.PRIMITIVE_TYPE_STRING)) {
                        CorgiParser.ClassOrInterfaceTypeContext classInterfaceCtx = typeCtx.classOrInterfaceType();
                        this.identifiedTokenHolder.addToken(PRIMITIVE_TYPE_KEY, classInterfaceCtx.getText());
                    }

                    //create a field analyzer to walk through declarations
                    FieldAnalyzer fieldAnalyzer = new FieldAnalyzer(this.identifiedTokenHolder, this.mainScope);
                    fieldAnalyzer.analyze(fieldCtx.variableDeclarators());

                    //clear tokens for reause
                    this.identifiedTokenHolder.clearTokens();
                }
            }
        }

        else if(ctx instanceof CorgiParser.MethodDeclarationContext) {
            CorgiParser.MethodDeclarationContext methodDecCtx = (CorgiParser.MethodDeclarationContext) ctx;
            MethodAnalyzer methodAnalyzer = new MethodAnalyzer(this.identifiedTokenHolder, this.mainScope);
            methodAnalyzer.analyze(methodDecCtx);

            //reuse tokens
            this.identifiedTokenHolder.clearTokens();
        }
    }

    public static boolean isPrimitiveDeclaration(CorgiParser.TypeTypeContext typeCtx) {
        if(typeCtx.primitiveType() != null) {
            List<TerminalNode> lBrackToken = typeCtx.getTokens(CorgiLexer.LBRACK);
            List<TerminalNode> rBrackToken = typeCtx.getTokens(CorgiLexer.RBRACK);

            return (lBrackToken.size() == 0 && rBrackToken.size() == 0);
        }

        return false;
    }

    public static boolean isPrimitiveArrayDeclaration(CorgiParser.TypeTypeContext typeCtx) {
        if(typeCtx.primitiveType() != null) {
            List<TerminalNode> lBrackToken = typeCtx.getTokens(CorgiLexer.LBRACK);
            List<TerminalNode> rBrackToken = typeCtx.getTokens(CorgiLexer.RBRACK);

            return (lBrackToken.size() > 0 && rBrackToken.size() > 0);
        }

        return false;
    }

    private void analyzeModifier(CorgiParser.ClassOrInterfaceModifierContext ctx) {
        if(ctx.getTokens(CorgiLexer.PUBLIC).size() > 0 || ctx.getTokens(CorgiLexer.PRIVATE).size() > 0
                || ctx.getTokens(CorgiLexer.PROTECTED).size() > 0) {
//            Console.log(LogType.DEBUG, "Detected accessor: " +ctx.getText());
            this.identifiedTokenHolder.addToken(ACCESS_CONTROL_KEY, ctx.getText());
        }
        else if(ctx.getTokens(CorgiLexer.FINAL).size() > 0) {
//            Console.log(LogType.DEBUG, "Detected const: " +ctx.getText());
            this.identifiedTokenHolder.addToken(CONST_CONTROL_KEY, ctx.getText());
        }
        else if(ctx.getTokens(CorgiLexer.STATIC).size() > 0) {
//            Console.log(LogType.DEBUG, "Detected static: " +ctx.getText());
            this.identifiedTokenHolder.addToken(STATIC_CONTROL_KEY, ctx.getText());
        }
    }

}
