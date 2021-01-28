public class ExecutionManager {
    private ExecutionManager instance = null;

    public ExecutionManager getInstance(){
        if(instance == null){
            instance = new ExecutionManager();
        }
        return instance;
    }

    private ExecutionManager(){

    }
}
