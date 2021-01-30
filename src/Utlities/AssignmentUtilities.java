package Utlities;

import Representations.CorgiValue;
import Representations.PrimitiveType;

import java.math.BigDecimal;

public class AssignmentUtilities {

    /*
     * Assigns an appropriate value depending on the primitive type. Since expression class returns a double value, we attempt
     * to properly cast it. All expression commands accept INT, LONG, BYTE, SHORT, FLOAT and DOUBLE.
     */
    public static void assignAppropriateValue(CorgiValue corgiValue, BigDecimal evaluationValue) {
        if(corgiValue.getPrimitiveType() == PrimitiveType.INT) {
            corgiValue.setValue(Integer.toString(evaluationValue.intValue()));
        }
        else if(corgiValue.getPrimitiveType() == PrimitiveType.FLOAT) {
            corgiValue.setValue(Float.toString(evaluationValue.floatValue()));
        }
        else if(corgiValue.getPrimitiveType() == PrimitiveType.BOOLEAN) {
            int result = evaluationValue.intValue();

            if(result == 1) {
                corgiValue.setValue(KeywordRecognizer.BOOLEAN_TRUE);
            }
            else {
                corgiValue.setValue(KeywordRecognizer.BOOLEAN_FALSE);
            }
        }
        else {
            //Console.log(LogType.DEBUG, "MobiValue: DID NOT FIND APPROPRIATE TYPE!!");
        }
    }

    public static void assignAppropriateValue(CorgiValue corgiValue, String stringValue) {
        if(corgiValue.getPrimitiveType() == PrimitiveType.STRING ||
                corgiValue.getPrimitiveType() == PrimitiveType.CHAR) {
            corgiValue.setValue(stringValue);
        }
    }

}