package com.epam.jc.task2.stationery;

/**
 * @author Vladislav Boboshko
 */
public class Pencil implements Stationery {
    @Override
    public void doSomethingStationery() {
        System.out.println("I'm a pencil and I'm drawing something gray like your cat\nAh.. never mind.");
    }

    @Override
    public double getPrice() {
        return 3.50;
    }
}
