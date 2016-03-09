package com.epam.jc.task5;

import org.junit.Test;

/**
 * @author endiny
 */
public class ArrayCrosserTest {

    @Test
    public void testPrintMatrix() throws Exception {
        ArrayCrosser arrayCrosser = new ArrayCrosser(9);
        arrayCrosser.createMatrix();
        arrayCrosser.printMatrix();
    }
}