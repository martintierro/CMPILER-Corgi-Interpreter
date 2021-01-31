package Analyzers;

import Commands.ArrayInitializeCommand;
import Commands.IConditionalCommand;
import Commands.IControlledCommand;
import ErrorChecker.MultipleVarDecChecker;
import Execution.ExecutionManager;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiArray;
import Representations.CorgiValue;
import Representations.PrimitiveType;
import Semantics.LocalScope;
import Semantics.MainScope;
import Statements.StatementControlOverseer;
import Utlities.IdentifiedTokenHolder;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ArrayAnalyzer implements ParseTreeListener {

    private final static String ARRAY_PRIMITIVE_KEY = "ARRAY_PRIMITIVE_KEY";
    private final static String ARRAY_IDENTIFIER_KEY = "ARRAY_IDENTIFIER_KEY";

    private IdentifiedTokenHolder identifiedTokenHolder;
    private MainScope mainScope;
    private LocalScope localScope;
    private CorgiArray declaredArray;

    public ArrayAnalyzer(IdentifiedTokenHolder identifiedTokenHolder, MainScope mainScope) {
        this.identifiedTokenHolder = identifiedTokenHolder;
        this.mainScope = mainScope;
    }

    public ArrayAnalyzer(IdentifiedTokenHolder identifiedTokenHolder, LocalScope localScope) {
        this.identifiedTokenHolder = identifiedTokenHolder;
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
            this.identifiedTokenHolder.addToken(ARRAY_PRIMITIVE_KEY, primitiveCtx.getText());
        }
        else if(ctx instanceof CorgiParser.VariableDeclaratorIdContext) {
            CorgiParser.VariableDeclaratorIdContext varDecIdCtx = (CorgiParser.VariableDeclaratorIdContext) ctx;
            MultipleVarDecChecker multipleDeclaredChecker = new MultipleVarDecChecker(varDecIdCtx);
            multipleDeclaredChecker.verify();
            this.identifiedTokenHolder.addToken(ARRAY_IDENTIFIER_KEY, varDecIdCtx.getText());

            this.analyzeArray();
        }
        else if(ctx instanceof CorgiParser.CreatedNameContext) {
            CorgiParser.CreatedNameContext createdNameCtx = (CorgiParser.CreatedNameContext) ctx;
            //Console.log(LogType.DEBUG, "Array created name: " +createdNameCtx.getText());
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

        if(this.mainScope != null) {
            if(this.identifiedTokenHolder.containsTokens(ARRAY_PRIMITIVE_KEY, ARRAY_IDENTIFIER_KEY)) {
                String arrayTypeString = this.identifiedTokenHolder.getToken(ARRAY_PRIMITIVE_KEY);
                String arrayIdentifierString = this.identifiedTokenHolder.getToken(ARRAY_IDENTIFIER_KEY);

                this.declaredArray = CorgiArray.createArray(arrayTypeString, arrayIdentifierString);
                CorgiValue corgiValue = new CorgiValue(this.declaredArray, PrimitiveType.ARRAY);

                this.mainScope.addCorgiValue(arrayIdentifierString, corgiValue);
                //Console.log(LogType.DEBUG, "Creating array with type " +arrayTypeString+ " variable " +arrayIdentifierString);

                this.identifiedTokenHolder.clearTokens();
            }
        }
        else if(this.localScope != null) {
            if(this.identifiedTokenHolder.containsTokens(ARRAY_PRIMITIVE_KEY, ARRAY_IDENTIFIER_KEY)) {
                String arrayTypeString = this.identifiedTokenHolder.getToken(ARRAY_PRIMITIVE_KEY);
                String arrayIdentifierString = this.identifiedTokenHolder.getToken(ARRAY_IDENTIFIER_KEY);

                //initialize an array mobivalue
                this.declaredArray = CorgiArray.createArray(arrayTypeString, arrayIdentifierString);
                CorgiValue corgiValue = new CorgiValue(this.declaredArray, PrimitiveType.ARRAY);

                this.localScope.addCorgiValue(arrayIdentifierString, corgiValue);
                //Console.log(LogType.DEBUG, "Creating array with type " +arrayTypeString+ " variable " +arrayIdentifierString);

                this.identifiedTokenHolder.clearTokens();
            }
        }

    }

    private void createInitializeCommand(CorgiParser.ArrayCreatorRestContext arrayCreatorCtx) {
        ArrayInitializeCommand arrayInitializeCommand = new ArrayInitializeCommand(this.declaredArray, arrayCreatorCtx);

        //ExecutionManager.getInstance().addCommand(arrayInitializeCommand);

        StatementControlOverseer statementControl = StatementControlOverseer.getInstance();
        //add to conditional controlled command
        if(statementControl.isInConditionalCommand()) {
            IConditionalCommand conditionalCommand = (IConditionalCommand) statementControl.getActiveControlledCommand();

            if(statementControl.isInPositiveRule()) {
                conditionalCommand.addPositiveCommand(arrayInitializeCommand);
            }
            else {
                conditionalCommand.addNegativeCommand(arrayInitializeCommand);
            }
        }

        else if(statementControl.isInControlledCommand()) {
            IControlledCommand controlledCommand = (IControlledCommand) statementControl.getActiveControlledCommand();
            controlledCommand.addCommand(arrayInitializeCommand);
        }
//        else if (statementControl.isInAttemptCommand()) {
//            IAttemptCommand attemptCommand = (IAttemptCommand) statementControl.getActiveControlledCommand();
//
//            if(statementControl.isInTryBlock()) {
//                attemptCommand.addTryCommand(arrayInitializeCommand);
//            } else {
//                attemptCommand.addCatchCommand(statementControl.getCurrentCatchType(), arrayInitializeCommand);
//            }
//        }
        else {
            ExecutionManager.getInstance().addCommand(arrayInitializeCommand);
        }

    }
}