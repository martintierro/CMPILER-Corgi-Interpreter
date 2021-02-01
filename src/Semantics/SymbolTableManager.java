package Semantics;

import java.util.HashMap;

public class SymbolTableManager {
    private static SymbolTableManager instance = null;
    private MainScope mainScope;
    private HashMap<String, LocalScope> classTable;


    public static SymbolTableManager getInstance(){
        if(instance == null){
            instance = new SymbolTableManager();
        }
        return instance;
    }

    public static void initialize() {
        instance = new SymbolTableManager();
    }
    private SymbolTableManager(){
        mainScope = new MainScope();
    }

    public MainScope getMainScope(){
        return mainScope;
    }



    public void resetClassTables() {
        MainScope[] classScopes = this.classTable.values().toArray(new MainScope[this.classTable.size()]);

        for(int i = 0; i < classScopes.length; i++) {
            classScopes[i].resetValues();
        }
    }

}
