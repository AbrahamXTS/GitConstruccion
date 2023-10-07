package com.bichotitas.application;

public class Calculator {

    /**
     * @param minuend The number from which we subtract the other number.
     * @param subtrahend The number which is subtracted from the minuend.
     * @return difference - The final result obtained after performing subtraction.
     *
     * @see Number
     */
    public static Number subtractNumbers(Number minuend, Number subtrahend) {
        return minuend.doubleValue() - subtrahend.doubleValue();
    }
}
