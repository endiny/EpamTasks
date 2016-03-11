package com.epam.jc.task3.stationery;

/**
 * @author Vladislav Boboshko
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseStationery{");
        sb.append("price=").append(price);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
