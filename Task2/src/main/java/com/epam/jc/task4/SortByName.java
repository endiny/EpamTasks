package com.epam.jc.task4;

import com.epam.jc.task3.stationery.BaseStationery;

import java.util.Comparator;

/**
 * @author Vladislav Boboshko
 */
public class SortByName implements Comparator<BaseStationery> {
    @Override
    public int compare(BaseStationery o1, BaseStationery o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
