package com.epam.jc.task4;

import com.epam.jc.task3.stationery.BaseStationery;
import com.epam.jc.task3.stationery.notepads.Size;
import com.epam.jc.task3.stationery.notepads.SmallNotepad;
import com.epam.jc.task3.stationery.writers.Color;
import com.epam.jc.task3.stationery.writers.Pen;
import com.epam.jc.task3.stationery.writers.Pencil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Vladislav Boboshko
 */
public class SortTest {

    private List<BaseStationery> stationeries;

    @Before
    public void setUp() throws Exception {
        stationeries = new ArrayList<>();
        stationeries.add(new Pen(Color.BLACK, 1.2));
        stationeries.add(new Pencil(Color.BLUE, 1.2));
        stationeries.add(new SmallNotepad(Size.A5, 48));
        stationeries.add(new SmallNotepad(Size.A4, 96));
        System.out.println("Unsorted:\n");
        for (BaseStationery i:stationeries) {
            System.out.println(i.toString());
        }
        System.out.println();
    }

    @Test
    public void testSortByPrice() throws Exception {
        Collections.sort(stationeries, new SortByPrice());
        System.out.println("Sorted by price:\n");
        for (BaseStationery i:stationeries) {
            System.out.println(i.toString());
        }
        System.out.println();
    }

    @Test
    public void testSortByName() throws Exception {
        Collections.sort(stationeries, new SortByName());
        System.out.println("Sorted by name:\n");
        for (BaseStationery i:stationeries) {
            System.out.println(i.toString());
        }
        System.out.println();
    }

    @Test
    public void testSortByPriceAndName() throws Exception {
        Collections.sort(stationeries, new SortByPriceAndName());
        System.out.println("Sorted by price and name:\n");
        for (BaseStationery i:stationeries) {
            System.out.println(i.toString());
        }
        System.out.println();
    }

    @After
    public void tearDown() throws Exception {
        stationeries.clear();
    }
}