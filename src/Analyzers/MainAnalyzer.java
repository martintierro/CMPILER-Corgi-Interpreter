package Analyzers;

import Execution.ExecutionManager;
import GeneratedAntlrClasses.CorgiParser;
import Semantics.LocalScope;
import Semantics.LocalScopeHandler;
import Semantics.CorgiScope;
import Semantics.SymbolTableManager;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MainAnalyzer implements ParseTreeListener {

    public MainAnalyzer() {

    }

    public void analyze(CorgiParser.MainDeclarationContext ctx) {
        if(!ExecutionManager.getInstance().hasFoundEntryPoint()) {
//            ExecutionManager.getInstance().reportFoundEntryPoint(ParserHandler.getInstance().getCurrentClassName());

            //automatically create a local scope for main() whose parent is the class scope
            CorgiScope corgiScope = SymbolTableManager.getInstance().getMainScope();
            LocalScope localScope = LocalScopeHandler.getInstance().openLocalScope();
            localScope.setParent(corgiScope);

            ParseTreeWalker treeWalker = new ParseTreeWalker();
            treeWalker.walk(this, ctx);


        }
        else {
            System.out.println("Already found main in " + ExecutionManager.getInstance().getEntryClassName());
        }
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        if(parserRuleContext instanceof CorgiParser.MethodBodyContext) {
            CorgiParser.BlockContext blockCtx = ((CorgiParser.MethodBodyContext) parserRuleContext).block();

            BlockAnalyzer blockAnalyzer = new BlockAnalyzer();
            blockAnalyzer.analyze(blockCtx);
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
