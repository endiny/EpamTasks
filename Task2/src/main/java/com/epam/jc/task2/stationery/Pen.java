package com.epam.jc.task2.stationery;

/**
 * @author Vladislav Boboshko
 */
public class Pen implements Stationery {

    @Override
    public void doSomethingStationery() {
        System.out.println("I'm a pen and I'm drawing on your wallpapers like being in hands of 4yo kid.");
    }

    @Override
    public double getPrice() {
        return 5.5;
    }
}
