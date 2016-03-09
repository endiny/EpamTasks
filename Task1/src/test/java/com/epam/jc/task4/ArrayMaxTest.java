package com.epam.jc.task4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author endiny
 */
public class ArrayMaxTest {

    @Test
    public void testFindMax() throws Exception {
        double[] array = new double[30];
        for (int i=0; i<30; i++) {
            array[i] = Math.tan(i);
        }
        assertEquals(7.707, ArrayMax.findMax(array), 0.001);
    }
}