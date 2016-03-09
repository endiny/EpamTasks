package com.epam.jc.task2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author endiny
 */
public class RowLookerTest {

    @Test
    public void testRowLooker() throws Exception {
        RowLooker rowLooker = new RowLooker(Math.pow(10,-9));
        assertEquals(31622, rowLooker.findMax());

    }
}