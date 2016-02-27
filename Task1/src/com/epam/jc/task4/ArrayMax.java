package com.epam.jc.task4;

import java.util.Random;

/**
 * @author endiny
 */
public class ArrayMax {
    private static Random rand = new Random();
    private static int n = 30;
    public static void main(String[] args) {
        double[] arr = new double[n];
        arr[0] = -100 + 200*rand.nextDouble();
        double max = Double.NEGATIVE_INFINITY;
        for (int i=0; i<n-1; i++) {
            arr[i+1] = -100 + 200*rand.nextDouble();
            if ((arr[i]+arr[i+1])>max) {
                max = arr[i]+arr[i+1];
            }
        }
        System.out.println(max);
    }
}
