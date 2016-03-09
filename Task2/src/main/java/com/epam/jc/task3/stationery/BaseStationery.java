package com.epam.jc.task3.stationery;

/**
 * @author endiny
 */
public abstract class BaseStationery {
    private double price;
    private String name;
    public abstract String someStationeryAction();

    public String getName() {
        return name;
    }

    public BaseStationery(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {

        return price;
    }
}
