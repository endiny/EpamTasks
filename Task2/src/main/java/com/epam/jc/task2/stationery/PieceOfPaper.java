package com.epam.jc.task2.stationery;

/**
 * @author endiny
 */
public class PieceOfPaper implements Stationery {
    @Override
    public void doSomethingStationery() {
        System.out.println("So white. It's not about racism, actually.");
    }

    @Override
    public double getPrice() {
        return 0.03;
    }
}
