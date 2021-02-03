package Semantics;

import java.util.HashMap;

public class SymbolTableManager {
    private static SymbolTableManager instance = null;
    private CorgiScope corgiScope;
//    private HashMap<String, LocalScope> classTable;


    public static SymbolTableManager getInstance(){
        if(instance == null){
            instance = new SymbolTableManager();
        }
        return instance;
    }

    private SymbolTableManager(){
        corgiScope = new CorgiScope();
    }

    public CorgiScope getCorgiScope(){
        return corgiScope;
    }



//    public void resetClassTables() {
//        CorgiScope[] classScopes = this.classTable.values().toArray(new CorgiScope[this.classTable.size()]);
//
//        for(int i = 0; i < classScopes.length; i++) {
//            classScopes[i].resetValues();
//        }
//    }

}
