package Templates;

public class CorgiCodeTemplate {

    public static String createNewClassTemplate(String fileName) {
        String codeTemplate = "public class " +fileName+ " {"
                + "\n \n"
                + "}";

        return codeTemplate;
    }
}
