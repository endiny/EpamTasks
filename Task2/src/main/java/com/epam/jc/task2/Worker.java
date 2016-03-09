package com.epam.jc.task2;

import com.epam.jc.task2.stationery.Stationery;

import java.util.ArrayList;
import java.util.List;

/**
 * @author endiny
 */
public class Worker {
    private String name;
    private List<Stationery> stationeries;

    public Worker() {
        this("unnamed");
    }

    public Worker(String name) {
        this.name = name;
        stationeries = new ArrayList<>();
    }

    public Worker addStationery(Stationery item) {
        stationeries.add(item);
        return this;
    }

    public double getSumOfStationeries() {
        double result = 0.0;
        for (Stationery i :stationeries) {
            result += i.getPrice();
        }
        return result;
    }
}
