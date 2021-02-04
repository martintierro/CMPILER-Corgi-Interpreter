package GeneratedAntlrClasses;

import Analyzers.CorgiAnalyzer;
import Analyzers.MainAnalyzer;

public class CorgiCustomListener extends  CorgiBaseListener{

    @Override public void enterMainDeclaration(CorgiParser.MainDeclarationContext ctx) {
        MainAnalyzer mainAnalyzer = new MainAnalyzer();
        mainAnalyzer.analyze(ctx);
    }

    @Override public void enterStart(CorgiParser.StartContext ctx) {
        CorgiAnalyzer corgiAnalyzer = new CorgiAnalyzer();
        corgiAnalyzer.analyze(ctx);
    }

}
