package Execution;

import Commands.ICommand;

import java.util.ArrayList;
import java.util.List;

public class ExecutionThread extends Thread {

    private List<ICommand> executionList = new ArrayList<>();
    private ExecutionMonitor executionMonitor;

    public ExecutionThread(ArrayList<ICommand> executionList, ExecutionMonitor executionMonitor) {
        this.executionList = executionList;
        this.executionMonitor = executionMonitor;
    }

    @Override
    public void run() {
        try{
            for (ICommand command: this.executionList) {
                this.executionMonitor.tryExecution();
                command.execute();
            }
        }catch (InterruptedException e){
            System.err.println("Monitor block interrupted!"); //TODO: Change to IDE
        }
        //TODO: Add notification to observers
    }
}
