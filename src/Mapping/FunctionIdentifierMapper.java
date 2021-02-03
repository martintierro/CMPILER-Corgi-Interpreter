package Mapping;

import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiFunction;
import Representations.CorgiValue;
import Semantics.LocalScope;
import Semantics.LocalScopeHandler;
import Semantics.CorgiScope;
import Semantics.SymbolTableManager;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class FunctionIdentifierMapper implements ParseTreeListener, IValueMapper {

    private String originalExp = null;
    private String modifiedExp = null;

    private CorgiFunction assignedFunction;
    private CorgiValue corgiValue;
    private LocalScope functionLocalScope;

    public FunctionIdentifierMapper(String originalExp, CorgiFunction assignedFunction) {
        this.originalExp = originalExp;
        this.modifiedExp = originalExp;
        this.assignedFunction = assignedFunction;
        this.functionLocalScope = assignedFunction.getParentLocalScope();
    }


    public void analyze(CorgiParser.ExpressionContext exprCtx) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, exprCtx);
    }

    public void analyze(CorgiParser.ParExpressionContext exprCtx) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, exprCtx);
    }




    @Override
    public void visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        if(ctx instanceof CorgiParser.PrimaryContext) {
            CorgiParser.PrimaryContext primaryCtx = (CorgiParser.PrimaryContext) ctx;

            if(primaryCtx.Identifier() != null) {
                String variableKey = primaryCtx.getText();
                this.searchVariable(variableKey);
            }
        }
    }

    private void searchVariable(String identifierString) {
        if(this.assignedFunction.hasParameter(identifierString)) {
            this.modifiedExp = this.modifiedExp.replace(identifierString, this.assignedFunction.getParameter(identifierString).getValue().toString());
        }
        else {
            this.corgiValue = LocalScopeHandler.searchVariableInLocalIterative(identifierString, this.functionLocalScope);

            if (this.corgiValue == null) {
                CorgiScope corgiScope = SymbolTableManager.getInstance().getCorgiScope();
                this.corgiValue = corgiScope.searchVariableIncludingLocal(identifierString);

                //Console.log("Variable in global scope: " +this.mobiValue.getValue());
            }
            this.modifiedExp = this.modifiedExp.replace(identifierString, this.corgiValue.getValue().toString());
        }
    }


    @Override
    public String getOriginalExp() {
        return this.originalExp;
    }

    @Override
    public String getModifiedExp() {
        return this.modifiedExp;
    }

    @Override
    public CorgiValue getCorgiValue() {
        return null;
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }
}