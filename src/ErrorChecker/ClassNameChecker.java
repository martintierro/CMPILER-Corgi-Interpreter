package ErrorChecker;

import Builder.BuildChecker;
import Builder.ParserHandler;
import Builder.SemanticErrorDictionary;

public class ClassNameChecker implements IErrorChecker {
    private final static String TAG = "MobiProg_ClassNameChecker";

    private String className;
    private boolean successful = true;

    public ClassNameChecker(String readClassName) {
        this.className = readClassName;
    }

    @Override
    public void verify() {
        if(this.className.equals(ParserHandler.getInstance().getClass()) == false) {
            this.successful = false;
            String additionalMsg = "Class name is " +this.className+ " while file name is " +ParserHandler.getInstance().getClass();
            BuildChecker.reportCustomError(SemanticErrorDictionary.INCONSISTENT_CLASS_NAME, additionalMsg);
        }
    }

    /*
     * Corrects the class name so that the semantics analyzer can continue
     */
    public String correctClassName() {
        if(this.successful) {
            return this.className;
        }
        else {
            return ParserHandler.getInstance().getClass().toString();
        }
    }
}