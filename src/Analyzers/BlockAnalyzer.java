package Analyzers;

import GeneratedAntlrClasses.CorgiParser;
import Semantics.LocalScopeCreator;

import java.util.List;

public class BlockAnalyzer {

    public BlockAnalyzer() {
        LocalScopeCreator.getInstance().openLocalScope();
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

        LocalScopeCreator.getInstance().closeLocalScope();
    }
}