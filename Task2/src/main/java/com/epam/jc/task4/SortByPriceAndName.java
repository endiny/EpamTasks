package com.epam.jc.task4;

import com.epam.jc.task3.stationery.BaseStationery;

import java.util.Comparator;

/**
 * @author Vladislav Boboshko
 */
public class SortByPriceAndName implements Comparator<BaseStationery> {
    @Override
    public int compare(BaseStationery o1, BaseStationery o2) {
        if ((int)(o1.getPrice()-o2.getPrice()) != 0) {
            return (int)(o1.getPrice()-o2.getPrice());
        } else {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    }
}
