package com.epam.jc.task2;

import com.epam.jc.task2.stationery.Pen;
import com.epam.jc.task2.stationery.Pencil;
import com.epam.jc.task2.stationery.PieceOfPaper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Vladislav Boboshko
 */
public class StationeryTests {
    @Test
    public void testOfStationeries() throws Exception {
        Worker bob = new Worker("Bob");
        bob.addStationery(new Pen()).addStationery(new Pen())
                .addStationery(new Pencil()).addStationery(new PieceOfPaper());
        System.out.println(bob.getSumOfStationeries());
        assertEquals(14.53, bob.getSumOfStationeries(), 0.001);
    }
}