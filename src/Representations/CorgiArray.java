package Representations;

import Utlities.KeywordRecognizer;

public class CorgiArray {

    private CorgiValue[] corgiValueArray;
    private PrimitiveType arrayPrimitiveType;
    private String arrayIdentifier;
    private boolean finalFlag = false;

    public CorgiArray(PrimitiveType primitiveType, String identifier) {
        this.arrayPrimitiveType = primitiveType;
        this.arrayIdentifier = identifier;
    }

    public void setPrimitiveType(PrimitiveType primitiveType) {
        this.arrayPrimitiveType = primitiveType;
    }

    public PrimitiveType getPrimitiveType() {
        return this.arrayPrimitiveType;
    }

    public void markFinal() {
        this.finalFlag = true;
    }

    public boolean isFinal() {
        return this.finalFlag;
    }

    public void initializeSize(int size) {
        this.corgiValueArray = new CorgiValue[size];
        System.err.println("Corgi array initialized to size " +this.corgiValueArray.length);
    }

    public int getSize() {
        return this.corgiValueArray.length;
    }

    public void updateValueAt(CorgiValue corgiValue, int index) {
        if(index >= this.corgiValueArray.length) {
           // Console.log(LogType.ERROR, String.format(ErrorRepository.getErrorMessage(ErrorRepository.RUNTIME_ARRAY_OUT_OF_BOUNDS), this.arrayIdentifier));
            return;
        }
        this.corgiValueArray[index] = corgiValue;
    }

    public CorgiValue getValueAt(int index) {
        if(index >= this.corgiValueArray.length) {
           // Console.log(LogType.ERROR, String.format(ErrorRepository.getErrorMessage(ErrorRepository.RUNTIME_ARRAY_OUT_OF_BOUNDS), this.arrayIdentifier));
            return this.corgiValueArray[this.corgiValueArray.length - 1];
        }
        else {
            return this.corgiValueArray[index];
        }
    }

    /*
     * Utility function that returns an arary of specified primitive type.
     */
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
