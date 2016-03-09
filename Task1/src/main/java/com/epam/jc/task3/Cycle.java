package com.epam.jc.task3;

/**
 * @author endiny
 */
public class Cycle {
    private double min;
    private double max;
    private double step;

    public Cycle() {
        this(10, 20, 0.01);
    }

    public Cycle(double min, double max, double step) {
        this.min = min;
        this.max = max;
        this.step = step;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getStep() {
        return step;
    }

    public void setStep(double step) {
        this.step = step;
    }

    public void print() {
        System.out.println("x\t\tf(x)");
        for (double i = min; i<= max; i+= step) {
            System.out.printf("%.2f\t%.5f\n", i, func(i));
        }
    }

    private double func(double x) {
        return Math.tan(2*x)-3;
    }
}
