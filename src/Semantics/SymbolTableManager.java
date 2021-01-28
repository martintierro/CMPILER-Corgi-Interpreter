package Semantics;

public class SymbolTableManager {
    private static SymbolTableManager instance = null;
    private MainScope mainScope;

    public static SymbolTableManager getInstance(){
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
