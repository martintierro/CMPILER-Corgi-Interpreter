package Commands;

import Execution.ExecutionManager;
import GeneratedAntlrClasses.CorgiParser;
import Notifications.KeyNames;
import Notifications.NotificationCenter;
import Notifications.NotificationListener;
import Notifications.Parameters;
import Notifications.Notifications;
import Representations.CorgiArray;
import Representations.CorgiValue;
import Representations.CorgiValueSearcher;
import Searcher.VariableSearcher;
import Utlities.StringUtilities;

public class ScanCommand implements ICommand, NotificationListener {

    //private final static String TAG = "MobiProg_ScanCommand";

    private String messageToDisplay;
    private String identifier;
    private CorgiParser.ExpressionContext array;

    public ScanCommand(String messageToDisplay, String identifier) {
        this.messageToDisplay = StringUtilities.removeQuotes(messageToDisplay);
        this.identifier = identifier;

    }

    public ScanCommand(String messageToDisplay, CorgiParser.ExpressionContext array, String identifier) {
        this.messageToDisplay = StringUtilities.removeQuotes(messageToDisplay);
        this.array = array;
        this.identifier = identifier;
    }

    @Override
    public void execute() {
        System.out.println("Found scan statement");
        NotificationCenter.getInstance().addObserver(Notifications.ON_SCAN_DIALOG_DISMISSED, this); //add an observer to listen to when the dialog has been dismissed

        Parameters params = new Parameters();
        params.putExtra(KeyNames.MESSAGE_DISPLAY_KEY, this.messageToDisplay);

        ExecutionManager.getInstance().blockExecution();

        NotificationCenter.getInstance().postNotification(Notifications.ON_FOUND_SCAN_STATEMENT, params);
    }

    private void acquireInputFromUser(Parameters params) {
        String valueEntered = params.getStringExtra(KeyNames.VALUE_ENTERED_KEY, "");

        boolean success;

        if(this.array == null) {
            CorgiValue corgiValue = CorgiValueSearcher.searchCorgiValue(identifier);
            //insert if array here
            try {
                corgiValue.setValue(valueEntered);
                success = true;
            } catch (NumberFormatException ex) {
                success = false;
                NotificationCenter.getInstance().removeObserver(Notifications.ON_SCAN_DIALOG_DISMISSED, this); //remove observer after using
                this.execute();

            }
        }
        else {
            handleArrayAssignment(valueEntered);
            success = true;
        }

        if(success) {
            NotificationCenter.getInstance().removeObserver(Notifications.ON_SCAN_DIALOG_DISMISSED, this); //remove observer after using
            ExecutionManager.getInstance().resumeExecution(); //resume execution of thread
        }

    }

    @Override
    public void onNotify(String notificationString, Parameters params) {
        if(notificationString == Notifications.ON_SCAN_DIALOG_DISMISSED) {
            this.acquireInputFromUser(params);
        }
    }

    private void handleArrayAssignment(String resultString) {
        CorgiParser.ExpressionContext arrayIndexExprCtx = this.array;

        CorgiValue corgiValue = VariableSearcher.searchVariable(this.identifier);
        CorgiArray corgiArray = (CorgiArray) corgiValue.getValue();

        EvaluationCommand evaluationCommand = new EvaluationCommand(arrayIndexExprCtx);
        evaluationCommand.execute();

        //create a new array value to replace value at specified index
        CorgiValue newArrayValue = new CorgiValue(null, corgiArray.getArrayType());
        newArrayValue.setValue(resultString);
        corgiArray.updateValueAt(newArrayValue, evaluationCommand.getResult().intValue());

        //Console.log("Index to access: " +evaluationCommand.getResult().intValue()+ " Updated with: " +resultString);
    }
}