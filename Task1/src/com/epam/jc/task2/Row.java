package com.epam.jc.task2;

/**
 * @author endiny
 */
public class Row {
    final private static double eps = Math.pow(10, -13);
    public static void main(String[] args) {
        int i=1;
        while (1/Math.pow(i+1,2)>=eps) {
            System.out.println(1/Math.pow(i++ + 1,2));
        }
        System.out.println(i);
    }
}
