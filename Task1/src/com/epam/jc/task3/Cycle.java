package com.epam.jc.task3;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @author endiny
 */
public class Cycle {
    private static double a;
    private static double b;
    private static double h;
    public static void main(String[] args) {
        a = 10;
        b = 20;
        h = 0.01;
        System.out.println("x\t\tf(x)");
        for (double i=a; i<=b; i+=h) {
            System.out.printf("%.2f\t%.5f\n", i, func(i));
        }
    }

    private static double func(double x) {
        return Math.tan(2*x)-3;
    }
}
