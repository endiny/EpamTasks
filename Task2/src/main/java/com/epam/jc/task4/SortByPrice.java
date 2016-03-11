package com.epam.jc.task4;

import com.epam.jc.task3.stationery.BaseStationery;

import java.util.Comparator;

/**
 * @author Vladislav Boboshko
 */
public class SortByPrice implements Comparator<BaseStationery> {
    @Override
    public int compare(BaseStationery o1, BaseStationery o2) {
        return (int)(o1.getPrice()-o2.getPrice());
    }
}
