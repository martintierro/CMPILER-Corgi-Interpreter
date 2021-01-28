public class SymbolTableManager {
    private SymbolTableManager instance = null;

    public SymbolTableManager getInstance(){
        if(instance == null){
            instance = new SymbolTableManager();
        }
        return instance;
    }

    private SymbolTableManager(){

    }

}
