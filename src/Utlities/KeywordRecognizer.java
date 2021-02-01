package Utlities;

public class KeywordRecognizer {
    public static String PRIMITIVE_TYPE_BOOLEAN = "boolean";
    public static String PRIMITIVE_TYPE_CHAR = "char";
    public static String PRIMITIVE_TYPE_INT = "int";
    public static String PRIMITIVE_TYPE_FLOAT = "float";
    public static String PRIMITIVE_TYPE_STRING = "String";

    public static String BOOLEAN_TRUE = "true";
    public static String BOOLEAN_FALSE = "false";

    public static boolean matchesKeyword(String keyword, String textToMatch) {
        if(textToMatch.contains(keyword)) {
            return true;
        }
        else {
            return false;
        }
    }
}