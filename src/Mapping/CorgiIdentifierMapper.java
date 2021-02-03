package Mapping;

import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiValue;
import Semantics.CorgiScope;
import Semantics.SymbolTableManager;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class CorgiIdentifierMapper implements ParseTreeListener, IValueMapper {

    private CorgiValue corgiValue;
    private String originalExp = null;
    private String modifiedExp = null;

    public CorgiIdentifierMapper(String originalExp) {
        this.originalExp = originalExp;
        this.modifiedExp = originalExp;
    }

    @Override
    public void analyze(CorgiParser.ExpressionContext exprCtx) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, exprCtx);
    }

    @Override
    public void analyze(CorgiParser.ParExpressionContext exprCtx) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, exprCtx);
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
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        if(ctx instanceof CorgiParser.PrimaryContext) {
            CorgiParser.PrimaryContext primaryCtx = (CorgiParser.PrimaryContext) ctx;

            if(primaryCtx.Identifier() != null) {
                String variableKey = primaryCtx.getText();
                CorgiScope corgiScope = SymbolTableManager.getInstance().getCorgiScope();

                this.corgiValue = corgiScope.searchVariableIncludingLocal(variableKey);
                this.modifiedExp = this.modifiedExp.replace(variableKey, this.corgiValue.getValue().toString());
            }
        }
    }

    @Override
    public CorgiValue getCorgiValue() {
        return this.corgiValue;
    }

    @Override
    public String getOriginalExp() {
        return this.originalExp;
    }

    @Override
    public String getModifiedExp() {
        return this.modifiedExp;
    }

}