package Semantics;

public class SymbolTableManager {
    private SymbolTableManager instance = null;
    private MainScope mainScope;

    public SymbolTableManager getInstance(){
        if(instance == null){
            instance = new SymbolTableManager();
        }
        return instance;
    }

    private SymbolTableManager(){
        mainScope = new MainScope();
    }

    public MainScope getMainScope(){
        return mainScope;
    }

}
