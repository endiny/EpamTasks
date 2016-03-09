package com.epam.jc.task4;

/**
 * @author endiny
 */
public class ArrayMax {

    public static double findMax(double[] array) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i=0; i<array.length-1; i++) {
            if (array[i]+array[i+1] > max) {
                max = array[i]+array[i+1];
            }
        }
        return max;
    }
}
