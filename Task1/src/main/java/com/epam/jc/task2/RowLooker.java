package com.epam.jc.task2;

/**
 * @author endiny
 */
public class RowLooker {
    public RowLooker() {
        this(Math.pow(10,-13));
    }

    public RowLooker(double eps) {
        this.eps = eps;
    }

    public double getEps() {

        return eps;
    }

    public void setEps(double eps) {
        this.eps = eps;
    }

    private double eps;

    public int findMax() {
        int i=1;
        while (1/Math.pow(i+1,2)>=eps) {
            System.out.println(1/Math.pow(i++ + 1,2));
        }
        return i;
    }
}
