package Analyzers;

import ErrorChecker.MultipleFuncDecChecker;
import Execution.ExecutionManager;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiFunction;
import Representations.FunctionType;
import Semantics.LocalScopeCreator;
import Semantics.MainScope;
import Utlities.IdentifiedTokenHolder;
import Utlities.KeywordRecognizer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class FunctionAnalyzer implements ParseTreeListener {

    private MainScope mainScope;
    private IdentifiedTokenHolder identifiedTokenHolder;
    private CorgiFunction declaredCorgiFunction;

    public FunctionAnalyzer(IdentifiedTokenHolder identifiedTokens, MainScope mainScope) {
        this.identifiedTokenHolder = identifiedTokens;
        this.mainScope = mainScope;
        this.declaredCorgiFunction = new CorgiFunction();
    }

    public void analyze(CorgiParser.MethodDeclarationContext ctx) {
        ExecutionManager.getInstance().openFunctionExecution(this.declaredCorgiFunction);

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
        if(ctx instanceof CorgiParser.MethodDeclarationContext) {
            CorgiParser.MethodDeclarationContext methodDecCtx = (CorgiParser.MethodDeclarationContext) ctx;
            MultipleFuncDecChecker funcDecChecker = new MultipleFuncDecChecker(methodDecCtx);
            funcDecChecker.verify();

            this.analyzeIdentifier(methodDecCtx.Identifier()); //get the function identifier
        }
        else {
            this.analyzeMethod(ctx);
        }

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        if(ctx instanceof CorgiParser.MethodDeclarationContext) {
            ExecutionManager.getInstance().closeFunctionExecution();
        }
    }

    private void analyzeMethod(ParserRuleContext ctx) {

        if(ctx instanceof CorgiParser.TypeTypeContext) {
            CorgiParser.TypeTypeContext typeCtx = (CorgiParser.TypeTypeContext) ctx;

            //return type is a primitive type
            if(typeCtx.primitiveType() != null) {
                CorgiParser.PrimitiveTypeContext primitiveTypeCtx = typeCtx.primitiveType();
                this.declaredCorgiFunction.setReturnType(CorgiFunction.identifyFunctionType(primitiveTypeCtx.getText()));
            }
            //return type is a string or a class type
            else {
                this.analyzeClassOrInterfaceType(typeCtx.classOrInterfaceType());
            }
        }

        else if(ctx instanceof CorgiParser.FormalParametersContext) {
            CorgiParser.FormalParametersContext formalParamsCtx = (CorgiParser.FormalParametersContext) ctx;
            this.analyzeParameters(formalParamsCtx);
            this.storeCorgiFunction();
        }

        else if(ctx instanceof CorgiParser.MethodBodyContext) {

            CorgiParser.BlockContext blockCtx = ((CorgiParser.MethodBodyContext) ctx).block();

            BlockAnalyzer blockAnalyzer = new BlockAnalyzer();
            this.declaredCorgiFunction.setParentLocalScope(LocalScopeCreator.getInstance().getActiveLocalScope());
            blockAnalyzer.analyze(blockCtx);

        }

    }

    private void analyzeClassOrInterfaceType(CorgiParser.ClassOrInterfaceTypeContext classOrInterfaceCtx) {
        //a string identified
        if(classOrInterfaceCtx.getText().contains(KeywordRecognizer.PRIMITIVE_TYPE_STRING)) {
            this.declaredCorgiFunction.setReturnType(FunctionType.STRING_TYPE);
        }
        //a class identified
        else {
            //Console.log(LogType.DEBUG, "Class identified: " + classOrInterfaceCtx.getText());
        }
    }

    private void analyzeIdentifier(TerminalNode identifier) {
        this.declaredCorgiFunction.setFunctionName(identifier.getText());
    }

    private void analyzeParameters(CorgiParser.FormalParametersContext formalParamsCtx) {
        if(formalParamsCtx.formalParameterList() != null) {
            ParameterAnalyzer parameterAnalyzer = new ParameterAnalyzer(this.declaredCorgiFunction);
            parameterAnalyzer.analyze(formalParamsCtx.formalParameterList());
        }
    }

    /*
     * Stores the created function in its corresponding class scope
     */
    private void storeCorgiFunction() {
        if(this.identifiedTokenHolder.containsTokens(ClassAnalyzer.ACCESS_CONTROL_KEY)) {
            String accessToken = this.identifiedTokenHolder.getToken(ClassAnalyzer.ACCESS_CONTROL_KEY);

            this.mainScope.addFunction(this.declaredCorgiFunction.getFunctionName(), this.declaredCorgiFunction);

            this.identifiedTokenHolder.clearTokens(); //clear tokens for reuse
        }
    }

}
