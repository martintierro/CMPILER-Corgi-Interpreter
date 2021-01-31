package Utlities;

import GeneratedAntlrClasses.CorgiLexer;
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
            corgiValue.setValue(Double.toString(evaluationValue.doubleValue()));
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
            System.out.println("AssignmentUtils: DID NOT FIND APPROPRIATE TYPE!!");
            //Console.log(LogType.DEBUG, "MobiValue: DID NOT FIND APPROPRIATE TYPE!!");
        }
    }

    public static void assignAppropriateValue(CorgiValue corgiValue, String stringValue) {
        if(corgiValue.getPrimitiveType() == PrimitiveType.STRING ||
                corgiValue.getPrimitiveType() == PrimitiveType.CHAR) {
            corgiValue.setValue(stringValue);
        }
    }

    public static void assignAppropriateValue(CorgiValue corgiValue, BigDecimal evaluationValue, int tokenSign) {
        if(corgiValue.getPrimitiveType() == PrimitiveType.INT) {
            int toAssignValue = evaluationValue.intValue();
            int finalValue = Integer.parseInt(corgiValue.getValue().toString());

            if (tokenSign == CorgiLexer.ADD_ASSIGN) {
                finalValue += toAssignValue;
            }
            else if (tokenSign == CorgiLexer.SUB_ASSIGN) {
                finalValue -= toAssignValue;
            }
            else if (tokenSign == CorgiLexer.MUL_ASSIGN) {
                finalValue *= toAssignValue;
            }
            else if (tokenSign == CorgiLexer.DIV_ASSIGN) {
                finalValue /= toAssignValue;
            }
            else if (tokenSign == CorgiLexer.MOD_ASSIGN) {
                finalValue %= toAssignValue;
            }

            corgiValue.setValue(finalValue + "");
        }
        else if(corgiValue.getPrimitiveType() == PrimitiveType.FLOAT) {
            corgiValue.setValue(Double.toString(evaluationValue.doubleValue()));

            double toAssignValue = evaluationValue.intValue();
            double finalValue = Double.parseDouble(corgiValue.getValue().toString());

            if (tokenSign == CorgiLexer.ADD_ASSIGN) {
                finalValue += toAssignValue;
            }
            else if (tokenSign == CorgiLexer.SUB_ASSIGN) {
                finalValue -= toAssignValue;
            }
            else if (tokenSign == CorgiLexer.MUL_ASSIGN) {
                finalValue *= toAssignValue;
            }
            else if (tokenSign == CorgiLexer.DIV_ASSIGN) {
                finalValue /= toAssignValue;
            }
            else if (tokenSign == CorgiLexer.MOD_ASSIGN) {
                finalValue %= toAssignValue;
            }

            corgiValue.setValue(finalValue + "");
        }
        /*else if(baracoValue.getPrimitiveType() == BaracoValue.PrimitiveType.BOOL) {
            int result = evaluationValue.intValue();

            if(result == 1) {
                baracoValue.setValue(RecognizedKeywords.BOOLEAN_TRUE);
            }
            else {
                baracoValue.setValue(RecognizedKeywords.BOOLEAN_FALSE);
            }
        }*/
    }

    public static void addAssignAppropriateValue(CorgiValue corgiValue, String stringValue) {
        if(corgiValue.getPrimitiveType() == PrimitiveType.STRING) {
            String toAddValue = stringValue;
            String originalValue = corgiValue.getValue().toString();

            corgiValue.setValue(toAddValue + originalValue);
        }
    }
}