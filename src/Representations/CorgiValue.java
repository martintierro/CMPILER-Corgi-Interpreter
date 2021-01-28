package Representations;

import Utlities.KeywordRecognizer;

import java.util.Stack;

public class CorgiValue {

    private Object defaultValue;
    private Object value;
    private PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;
    private boolean finalFlag = false;

    public CorgiValue(Object value, PrimitiveType primitiveType){
        if(value == null || checkValueType(value, primitiveType)) {
            this.value = value;
            this.primitiveType = primitiveType;
        }else{
            System.err.println("Value is not appropriate for" + primitiveType + "!"); //TODO: Call IDE
        }
    }

    public Object getValue() {
        return this.value;
    }

    public PrimitiveType getPrimitiveType() {
        return this.primitiveType;
    }

    public void setPrimitiveType(PrimitiveType primitiveType) {
        this.primitiveType = primitiveType;
    }

    public void makeFinal() {
        this.finalFlag = true;
    }

    public boolean isFinal() {
        return this.finalFlag;
    }

    public void setValue(String value) {

        if(this.primitiveType == PrimitiveType.NOT_YET_IDENTIFIED) {
            System.err.println("Primitive type not yet identified!"); //TODO: Call IDE
        }

        else if(this.primitiveType == PrimitiveType.STRING) {
            this.value = value.replace("\"", "");
        }
        else if(this.primitiveType == PrimitiveType.ARRAY) {
            System.err.println(this.primitiveType + " is an array. Cannot directly change value.");//TODO: Call IDE
        }
        else {
            //attempts to type cast the value
            this.value = this.attemptTypeCast(value);
        }
    }

    private Object attemptTypeCast(String value) {
        switch(this.primitiveType) {
            case BOOLEAN: return Boolean.valueOf(value);
            case CHAR: return value.charAt(0); //only get first char at value
            case INT: return Integer.valueOf(value);
            case FLOAT: return Float.valueOf(value);
            case STRING: return value;
            default: return null;
        }
    }

    public static boolean checkValueType(Object value, PrimitiveType primitiveType) {
        switch(primitiveType) {
            case CHAR:
                return value instanceof Character;
            case BOOLEAN:
                return value instanceof Boolean;
            case INT:
                return value instanceof Integer;
            case FLOAT:
                return value instanceof Float;
            case STRING:
                return value instanceof String;
            case ARRAY:
                return value instanceof Object;
            default:
                return false;
        }
    }

    public static CorgiValue createEmptyVariable(String primitiveTypeStr){
        PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;

        if(KeywordRecognizer.matchesKeyword(KeywordRecognizer.PRIMITIVE_TYPE_BOOLEAN, primitiveTypeStr)){
            primitiveType = PrimitiveType.BOOLEAN;
        }else if(KeywordRecognizer.matchesKeyword(KeywordRecognizer.PRIMITIVE_TYPE_CHAR, primitiveTypeStr)) {
            primitiveType = PrimitiveType.CHAR;
        }else if(KeywordRecognizer.matchesKeyword(KeywordRecognizer.PRIMITIVE_TYPE_FLOAT, primitiveTypeStr)) {
            primitiveType = PrimitiveType.FLOAT;
        } else if(KeywordRecognizer.matchesKeyword(KeywordRecognizer.PRIMITIVE_TYPE_INT, primitiveTypeStr)) {
            primitiveType = PrimitiveType.INT;
        } else if(KeywordRecognizer.matchesKeyword(KeywordRecognizer.PRIMITIVE_TYPE_STRING, primitiveTypeStr)) {
            primitiveType = PrimitiveType.STRING;
        }

        return new CorgiValue(null, primitiveType);
    }

    public void reset(){
        this.value = defaultValue;
    }
}
