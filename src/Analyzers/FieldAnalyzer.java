package Analyzers;

import Commands.MappingCommand;
import ErrorChecker.MultipleVarDecChecker;
import ErrorChecker.TypeChecker;
import Execution.ExecutionManager;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiValue;
import Semantics.CorgiScope;
import Utlities.IdentifiedTokenHolder;
import Utlities.KeywordRecognizer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class FieldAnalyzer implements ParseTreeListener {

    private CorgiScope corgiScope;
    private IdentifiedTokenHolder identifiedTokenHolder;

    public FieldAnalyzer(IdentifiedTokenHolder identifiedTokenHolder, CorgiScope corgiScope) {
        this.identifiedTokenHolder = identifiedTokenHolder;
        this.corgiScope = corgiScope;
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

            this.identifiedTokenHolder.addToken(CorgiAnalyzer.IDENTIFIER_KEY, varCtx.variableDeclaratorId().getText());
            this.createCorgiValue();

            if(varCtx.variableInitializer() != null) {

                //we do not evaluate strings.
                if(this.identifiedTokenHolder.containsTokens(CorgiAnalyzer.PRIMITIVE_TYPE_KEY)) {
                    String primitiveTypeString = this.identifiedTokenHolder.getToken(CorgiAnalyzer.PRIMITIVE_TYPE_KEY);
                    if(primitiveTypeString.contains(KeywordRecognizer.PRIMITIVE_TYPE_STRING)) {
                        this.identifiedTokenHolder.addToken(CorgiAnalyzer.IDENTIFIER_VALUE_KEY, varCtx.variableInitializer().getText());
                        return;
                    }
                }

                MappingCommand mappingCommand = new MappingCommand(varCtx.variableDeclaratorId().getText(), varCtx.variableInitializer().expression());
                ExecutionManager.getInstance().addCommand(mappingCommand);

                CorgiValue declaredCorgiValue = this.corgiScope.searchVariableIncludingLocal(varCtx.variableDeclaratorId().getText());

                TypeChecker typeChecker = new TypeChecker(declaredCorgiValue, varCtx.variableInitializer().expression());
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
    private void createCorgiValue() {

        if(this.identifiedTokenHolder.containsTokens(CorgiAnalyzer.PRIMITIVE_TYPE_KEY, CorgiAnalyzer.IDENTIFIER_KEY)) {

            String primitiveTypeString = this.identifiedTokenHolder.getToken(CorgiAnalyzer.PRIMITIVE_TYPE_KEY);
            String identifierString = this.identifiedTokenHolder.getToken(CorgiAnalyzer.IDENTIFIER_KEY);
            String identifierValueString = null;

            //Console.log(LogType.DEBUG, "Class modifier: " +classModifierString);

            if(this.identifiedTokenHolder.containsTokens(CorgiAnalyzer.IDENTIFIER_VALUE_KEY)) {
                identifierValueString = this.identifiedTokenHolder.getToken(CorgiAnalyzer.IDENTIFIER_VALUE_KEY);
                this.corgiScope.addInitializedVariable(primitiveTypeString, identifierString, identifierValueString);
            }
            else {
                this.corgiScope.addEmptyVariable(primitiveTypeString, identifierString);
            }

            CorgiValue declaredValue = this.corgiScope.searchVariableIncludingLocal(identifierString);
            //verify if the declared variable is a constant
            if(this.identifiedTokenHolder.containsTokens(CorgiAnalyzer.CONST_CONTROL_KEY)) {
                declaredValue.makeFinal();
            }



            //remove the following tokens
            this.identifiedTokenHolder.removeToken(CorgiAnalyzer.IDENTIFIER_KEY);
            this.identifiedTokenHolder.removeToken(CorgiAnalyzer.IDENTIFIER_VALUE_KEY);
        }
    }
}