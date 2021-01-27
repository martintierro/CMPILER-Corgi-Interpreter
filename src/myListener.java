import org.antlr.v4.runtime.ParserRuleContext;

public class myListener extends CorgiBaseListener {
//public class myListener extends Java8BaseListener {
    @Override public void enterEveryRule(ParserRuleContext ctx) {  //see gramBaseListener for allowed functions
        System.out.println("rule entered: " + ctx.getText());      //code that executes per rule
    }
}