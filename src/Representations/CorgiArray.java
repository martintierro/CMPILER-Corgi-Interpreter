package Representations;

import Utlities.KeywordRecognizer;

public class CorgiArray {

    private CorgiValue[] corgiValueArray;
    private PrimitiveType arrayType;
    private String arrayName;
    private boolean finalFlag = false;

    public CorgiArray(PrimitiveType primitiveType, String identifier) {
        this.arrayType = primitiveType;
        this.arrayName = identifier;
    }

    public void setArrayType(PrimitiveType arrayType) {
        this.arrayType = arrayType;
    }

    public int getSize() {
        return this.corgiValueArray.length;
    }

    public PrimitiveType getArrayType() {
        return arrayType;
    }

    public void makeFinal() {
        this.finalFlag = true;
    }

    public boolean isFinal() {
        return this.finalFlag;
    }

    public void initializeSize(int size) {
        try{
            this.corgiValueArray = new CorgiValue[size];
        }catch (NegativeArraySizeException ex){
            this.corgiValueArray = null;
        }
//        System.out.println("Corgi array initialized to size " +this.corgiValueArray.length);
    }

    public void updateValueAt(CorgiValue corgiValue, int index) {
        if(index >= this.corgiValueArray.length) {
            System.err.println("Array out of bounds"); //TODO: Change to IDE
            return;
        }
        this.corgiValueArray[index] = corgiValue;
    }

    public CorgiValue getValueAt(int index) {
        if(index >= this.corgiValueArray.length) {
            System.err.println("Array out of bounds"); //TODO: Change to IDE
            return this.corgiValueArray[this.corgiValueArray.length - 1];
        }
        else {
            return this.corgiValueArray[index];
        }
    }

    public static CorgiArray createArray(String primitiveTypeString, String arrayIdentifier) {
        //identify primitive type
        PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;

        if(KeywordRecognizer.matchesKeyword(KeywordRecognizer.PRIMITIVE_TYPE_BOOLEAN, primitiveTypeString)) {
            primitiveType = PrimitiveType.BOOLEAN;
        }
        else if(KeywordRecognizer.matchesKeyword(KeywordRecognizer.PRIMITIVE_TYPE_CHAR, primitiveTypeString)) {
            primitiveType = PrimitiveType.CHAR;
        }
        else if(KeywordRecognizer.matchesKeyword(KeywordRecognizer.PRIMITIVE_TYPE_FLOAT, primitiveTypeString)) {
            primitiveType = PrimitiveType.FLOAT;
        }
        else if(KeywordRecognizer.matchesKeyword(KeywordRecognizer.PRIMITIVE_TYPE_INT, primitiveTypeString)) {
            primitiveType = PrimitiveType.INT;
        }
        else if(KeywordRecognizer.matchesKeyword(KeywordRecognizer.PRIMITIVE_TYPE_STRING, primitiveTypeString)) {
            primitiveType = PrimitiveType.STRING;
        }

        CorgiArray corgiArray = new CorgiArray(primitiveType, arrayIdentifier);

        return corgiArray;
    }
}
