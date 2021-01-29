package Analyzers;

import Commands.ArrayInitializeCommand;
import Execution.ExecutionManager;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiArray;
import Representations.CorgiValue;
import Representations.PrimitiveType;
import Semantics.LocalScope;
import Semantics.MainScope;
import Utlities.IdentifiedTokenHolder;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ArrayAnalyzer implements ParseTreeListener {
    private final static String TAG = "MobiProg_ArrayAnalyzer";

    private final static String ARRAY_PRIMITIVE_KEY = "ARRAY_PRIMITIVE_KEY";
    private final static String ARRAY_IDENTIFIER_KEY = "ARRAY_IDENTIFIER_KEY";

    private IdentifiedTokenHolder identifiedTokens;
    private MainScope declaredClassScope;
    private LocalScope localScope;
    private CorgiArray declaredArray;

    public ArrayAnalyzer( IdentifiedTokenHolder identifiedTokens, MainScope declaredClassScope) {
        this.identifiedTokens = identifiedTokens;
        this.declaredClassScope = declaredClassScope;
    }

    public ArrayAnalyzer( IdentifiedTokenHolder identifiedTokens, LocalScope localScope) {
        this.identifiedTokens = identifiedTokens;
        this.localScope = localScope;
    }

    public void analyze(ParserRuleContext ctx) {
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
        if(ctx instanceof CorgiParser.PrimitiveTypeContext) {
            CorgiParser.PrimitiveTypeContext primitiveCtx = (CorgiParser.PrimitiveTypeContext) ctx;
            this.identifiedTokens.addToken(ARRAY_PRIMITIVE_KEY, primitiveCtx.getText());
        }
        else if(ctx instanceof CorgiParser.VariableDeclaratorIdContext) {
            CorgiParser.VariableDeclaratorIdContext varDecIdCtx = (CorgiParser.VariableDeclaratorIdContext) ctx;
            this.identifiedTokens.addToken(ARRAY_IDENTIFIER_KEY, varDecIdCtx.getText());

            this.analyzeArray();
        }
        else if(ctx instanceof CorgiParser.CreatedNameContext) {
            CorgiParser.CreatedNameContext createdNameCtx = (CorgiParser.CreatedNameContext) ctx;
//            Console.log(LogType.DEBUG, "Array created name: " +createdNameCtx.getText());
        }

        else if(ctx instanceof CorgiParser.ArrayCreatorRestContext) {
            CorgiParser.ArrayCreatorRestContext arrayCreatorCtx = (CorgiParser.ArrayCreatorRestContext) ctx;
            this.createInitializeCommand(arrayCreatorCtx);
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    private void analyzeArray() {

        if(this.declaredClassScope != null) {
            if(this.identifiedTokens.containsTokens(ARRAY_PRIMITIVE_KEY, ARRAY_IDENTIFIER_KEY)) {
                String arrayTypeString = this.identifiedTokens.getToken(ARRAY_PRIMITIVE_KEY);
                String arrayIdentifierString = this.identifiedTokens.getToken(ARRAY_IDENTIFIER_KEY);

                //initialize an array corgiValue
                this.declaredArray = CorgiArray.createArray(arrayTypeString, arrayIdentifierString);
                CorgiValue corgiValue = new CorgiValue(this.declaredArray, PrimitiveType.ARRAY);

                this.declaredClassScope.addCorgiValue(arrayIdentifierString, corgiValue);
                //Console.log(LogType.DEBUG, "Creating array with type " +arrayTypeString+ " variable " +arrayIdentifierString);

                this.identifiedTokens.clearTokens();
            }
        }
        else if(this.localScope != null) {
            if(this.identifiedTokens.containsTokens(ARRAY_PRIMITIVE_KEY, ARRAY_IDENTIFIER_KEY)) {
                String arrayTypeString = this.identifiedTokens.getToken(ARRAY_PRIMITIVE_KEY);
                String arrayIdentifierString = this.identifiedTokens.getToken(ARRAY_IDENTIFIER_KEY);

                //initialize an array mobivalue
                this.declaredArray = CorgiArray.createArray(arrayTypeString, arrayIdentifierString);
                CorgiValue corgiValue = new CorgiValue(this.declaredArray, PrimitiveType.ARRAY);

                this.localScope.addCorgiValue(arrayIdentifierString, corgiValue);
//                Console.log(LogType.DEBUG, "Creating array with type " +arrayTypeString+ " variable " +arrayIdentifierString);

                this.identifiedTokens.clearTokens();
            }
        }

    }

    private void createInitializeCommand(CorgiParser.ArrayCreatorRestContext arrayCreatorCtx) {
        ArrayInitializeCommand arrayInitializeCommand = new ArrayInitializeCommand(this.declaredArray, arrayCreatorCtx);
        ExecutionManager.getInstance().addCommand(arrayInitializeCommand);
    }
}