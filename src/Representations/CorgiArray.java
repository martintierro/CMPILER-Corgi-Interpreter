package Representations;

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
}
