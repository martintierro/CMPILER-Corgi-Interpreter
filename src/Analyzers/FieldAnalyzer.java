package Analyzers;

import Commands.MappingCommand;
import ErrorChecker.MultipleVarDecChecker;
import ErrorChecker.TypeChecker;
import Execution.ExecutionManager;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiValue;
import Semantics.MainScope;
import Utlities.IdentifiedTokenHolder;
import Utlities.KeywordRecognizer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class FieldAnalyzer implements ParseTreeListener {

    private final static String TAG = "MobiProg_FieldAnalyzer";

    private MainScope mainScope;
    private IdentifiedTokenHolder identifiedTokens;

    public FieldAnalyzer(IdentifiedTokenHolder identifiedTokens, MainScope mainScope) {
        this.identifiedTokens = identifiedTokens;
        this.mainScope = mainScope;
    }

    public void analyze(CorgiParser.VariableDeclaratorsContext varDecCtxList) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, varDecCtxList);
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
        if(ctx instanceof CorgiParser.VariableDeclaratorContext) {
            CorgiParser.VariableDeclaratorContext varCtx = (CorgiParser.VariableDeclaratorContext) ctx;

            //check for duplicate declarations
            MultipleVarDecChecker multipleDeclaredChecker = new MultipleVarDecChecker(varCtx.variableDeclaratorId());
            multipleDeclaredChecker.verify();

            this.identifiedTokens.addToken(MainAnalyzer.IDENTIFIER_KEY, varCtx.variableDeclaratorId().getText());
            this.createMobiValue();

            if(varCtx.variableInitializer() != null) {

                //we do not evaluate strings.
                if(this.identifiedTokens.containsTokens(MainAnalyzer.PRIMITIVE_TYPE_KEY)) {
                    String primitiveTypeString = this.identifiedTokens.getToken(MainAnalyzer.PRIMITIVE_TYPE_KEY);
                    if(primitiveTypeString.contains(KeywordRecognizer.PRIMITIVE_TYPE_STRING)) {
                        this.identifiedTokens.addToken(MainAnalyzer.IDENTIFIER_VALUE_KEY, varCtx.variableInitializer().getText());
                        return;
                    }
                }

                MappingCommand mappingCommand = new MappingCommand(varCtx.variableDeclaratorId().getText(), varCtx.variableInitializer().expression());
                ExecutionManager.getInstance().addCommand(mappingCommand);

                CorgiValue declaredMobiValue = this.mainScope.searchVariableIncludingLocal(varCtx.variableDeclaratorId().getText());

                TypeChecker typeChecker = new TypeChecker(declaredMobiValue, varCtx.variableInitializer().expression());
                typeChecker.verify();
            }

        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    /*
     * Attempts to create an intermediate representation of the variable once a sufficient amount of info has been retrieved.
     */
    private void createMobiValue() {

        if(this.identifiedTokens.containsTokens(MainAnalyzer.ACCESS_CONTROL_KEY, MainAnalyzer.PRIMITIVE_TYPE_KEY, MainAnalyzer.IDENTIFIER_KEY)) {

            String classModifierString = this.identifiedTokens.getToken(MainAnalyzer.ACCESS_CONTROL_KEY);
            String primitiveTypeString = this.identifiedTokens.getToken(MainAnalyzer.PRIMITIVE_TYPE_KEY);
            String identifierString = this.identifiedTokens.getToken(MainAnalyzer.IDENTIFIER_KEY);
            String identifierValueString = null;

//            Console.log(LogType.DEBUG, "Class modifier: " +classModifierString);

            if(this.identifiedTokens.containsTokens(MainAnalyzer.IDENTIFIER_VALUE_KEY)) {
                identifierValueString = this.identifiedTokens.getToken(MainAnalyzer.IDENTIFIER_VALUE_KEY);
                this.mainScope.addInitializedVariable(primitiveTypeString, identifierString, identifierValueString);
            }
            else {
                this.mainScope.addEmptyVariable(primitiveTypeString, identifierString);
            }

            CorgiValue declaredValue = this.mainScope.searchVariableIncludingLocal(identifierString);
            //verify if the declared variable is a constant
            if(this.identifiedTokens.containsTokens(MainAnalyzer.CONST_CONTROL_KEY)) {
                declaredValue.makeFinal();
            }



            //remove the following tokens
            this.identifiedTokens.removeToken(MainAnalyzer.IDENTIFIER_KEY);
            this.identifiedTokens.removeToken(MainAnalyzer.IDENTIFIER_VALUE_KEY);
        }
    }
}