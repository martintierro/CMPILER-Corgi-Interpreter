package Execution;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExecutionMonitor {
    private boolean executionFlag = true;

    private final Lock lock = new ReentrantLock();
    private final Condition executionGate = lock.newCondition();

    public ExecutionMonitor() {

    }

    /*
     * Attempts to try execution process of a command. Thread sleeps if an existing command has claimed the flag.
     */
    public void tryExecution() throws InterruptedException {
        this.lock.lock();

        try {
            while(!executionFlag) {
                System.err.println("Execution flag has been set to false. Execution sleeps!"); //TODO change to IDE
                this.executionGate.await();
            }

        }
        finally {
            this.lock.unlock();
        }
    }

    /*
     * Claims the execution flag. Call this function if a certain command needs to halt the execution of succeeding commands.
     */
    public void claimExecutionFlag() {
        this.executionFlag = false;
    }

    /*
     * Releases the execution flag. Do not forget to call this function on the command who claimed the execution flag to resume execution!
     */
    public void releaseExecutionFlag() {
        this.lock.lock();
        this.executionFlag = true;
        this.executionGate.signal();
        this.lock.unlock();
    }
}
