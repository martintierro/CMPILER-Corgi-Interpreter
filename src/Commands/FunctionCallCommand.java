package Commands;

import Analyzers.FunctionCallVerifier;
import GeneratedAntlrClasses.CorgiParser;
import Representations.CorgiFunction;
import Representations.CorgiValue;
import Representations.PrimitiveType;
import Searcher.VariableSearcher;
import Semantics.CorgiScope;
import Semantics.SymbolTableManager;
import Utlities.StringUtilities;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;

public class FunctionCallCommand implements ICommand {

    private CorgiFunction corgiFunction;
    private CorgiParser.ExpressionContext exprCtx;
    private String functionName;

    public FunctionCallCommand(String functionName, CorgiParser.ExpressionContext exprCtx) {
        this.functionName = functionName;
        this.exprCtx = exprCtx;

        this.searchFunction();

        ParseTreeWalker functionWalker = new ParseTreeWalker();
        functionWalker.walk(new FunctionCallVerifier(), this.exprCtx);

        this.verifyParameters();
    }

    @Override
    public void execute() {
        this.mapParameters();
        this.corgiFunction.execute();
    }

    private void searchFunction() {
        CorgiScope corgiScope = SymbolTableManager.getInstance().getCorgiScope();
        this.corgiFunction = corgiScope.getFunction(this.functionName);
    }

    private void verifyParameters() {
        if(this.exprCtx.arguments() == null || this.exprCtx.arguments().expressionList() == null
                || this.exprCtx.arguments().expressionList().expression() == null) {
            return;
        }

        List<CorgiParser.ExpressionContext> exprCtxList = this.exprCtx.arguments().expressionList().expression();
        //map values in parameters
        for(int i = 0; i < exprCtxList.size(); i++) {
            CorgiParser.ExpressionContext parameterExprCtx = exprCtxList.get(i);
            this.corgiFunction.verifyParameterByValueAt(parameterExprCtx, i);
        }
    }

    /*
     * Maps parameters when needed
     */
    private void mapParameters() {
//        System.out.println("Function Call: " + this.exprCtx.getText());
//        System.out.println("Arguments: " + this.exprCtx.expressionList().getText());

        if (this.exprCtx.expressionList() == null) {
            return;
        }

        List<CorgiParser.ExpressionContext> exprCtxList = this.exprCtx.expressionList().expression();

        //map values in parameters
        for(int i = 0; i < exprCtxList.size(); i++) {
            CorgiParser.ExpressionContext parameterExprCtx = exprCtxList.get(i);

            if(this.corgiFunction.getParameterAt(i).getPrimitiveType() == PrimitiveType.ARRAY) {
                CorgiValue corgiValue = VariableSearcher.searchVariable(parameterExprCtx.getText());
                this.corgiFunction.mapArrayAt(corgiValue, i, parameterExprCtx.getText());
            }else if(this.corgiFunction.getParameterAt(i).getPrimitiveType() != null){
                CorgiValue corgiValue = VariableSearcher.searchVariable(parameterExprCtx.getText());
                this.corgiFunction.mapParameterByValue(corgiValue.getValue().toString());
            }
            else if(parameterExprCtx.getText().contains("\"")){
                String param = StringUtilities.removeQuotes(parameterExprCtx.getText());
                this.corgiFunction.mapParameterByValue(param);
            } else if(parameterExprCtx.getText().contains("'")){
                String param = StringUtilities.removeQuotes(parameterExprCtx.getText());
                this.corgiFunction.mapParameterByValue(param);
            }
            else {
                EvaluationCommand evaluationCommand = new EvaluationCommand(parameterExprCtx);
                evaluationCommand.execute();

                this.corgiFunction.mapParameterByValueAt(evaluationCommand.getResult().toEngineeringString(), i);
            }
        }
    }

    public CorgiValue getReturnValue() {
        return this.corgiFunction.getReturnValue();
    }
}
