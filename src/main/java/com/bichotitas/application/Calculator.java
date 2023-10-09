package com.bichotitas.application;

public class Calculator {

    /**
     * @param minuend    The number from which we subtract the other number.
     * @param subtrahend The number which is subtracted from the minuend.
     * @return difference - The final result obtained after performing subtraction.
     *
     * @see Number
     */
    public static Number subtractNumbers(Number minuend, Number subtrahend) {
        return minuend.doubleValue() - subtrahend.doubleValue();
    }

    /**
     * This method provides the result of division between two numbers. If the
     * divisor is the number 0, the result will be "Infinity".
     * 
     * @param divisor  The number that divides the dividend in the operation
     * @param dividend The number that is divided in the operation
     * @see Number
     * @return The result fo dividing the dividend by the divisor
     */
    public static Number divideNumbers(Number dividend, Number divisor) {
        return dividend.doubleValue() / divisor.doubleValue();
    }
    
}
