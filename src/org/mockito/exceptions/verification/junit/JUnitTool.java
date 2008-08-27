package org.mockito.exceptions.verification.junit;

import org.mockito.exceptions.verification.ArgumentsAreDifferent;

public class JUnitTool {

    private static boolean hasJUnit;

    static {
        try {
            Class.forName("junit.framework.ComparisonFailure");
            hasJUnit = true;
        } catch (Throwable t) {
            hasJUnit = false;
        }
    }
    
    public static boolean hasJUnit() {
        return hasJUnit;
    }

    public static AssertionError createArgumentsAreDifferentException(String message, Throwable cause, String wanted, String actual)  {
        //TODO commented out for now...
//        try {
//            Class<?> clazz = Class.forName("org.mockito.exceptions.verification.junit.ArgumentsAreDifferentJUnitStyle");
//            AssertionError throwable = (AssertionError) clazz.getConstructors()[0].newInstance(message, cause, wanted, actual);
//            return throwable;
//        } catch (Throwable t) {
            //throw the default exception in case of problems
            return new ArgumentsAreDifferent(message, cause);
//        }
    }
}