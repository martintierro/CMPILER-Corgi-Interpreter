package Analyzers;

import GeneratedAntlrClasses.CorgiParser;
import Semantics.LocalScopeHandler;

import java.util.List;

public class BlockAnalyzer {

    public BlockAnalyzer() {
        LocalScopeHandler.getInstance().openLocalScope();
    }

    public void analyze(CorgiParser.BlockContext ctx) {

        List<CorgiParser.BlockStatementContext> blockListCtx = ctx.blockStatement();

        for(CorgiParser.BlockStatementContext blockStatementCtx : blockListCtx) {
            if(blockStatementCtx.statement() != null) {
                CorgiParser.StatementContext statementCtx = blockStatementCtx.statement();
                StatementAnalyzer statementAnalyzer = new StatementAnalyzer();
                statementAnalyzer.analyze(statementCtx);
            }
            else if(blockStatementCtx.localVariableDeclarationStatement() != null) {
                CorgiParser.LocalVariableDeclarationStatementContext localVarDecStatementCtx = blockStatementCtx.localVariableDeclarationStatement();

                LocalVariableAnalyzer localVarAnalyzer = new LocalVariableAnalyzer();
                localVarAnalyzer.analyze(localVarDecStatementCtx.localVariableDeclaration());
            }
        }

        LocalScopeHandler.getInstance().closeLocalScope();
    }
}