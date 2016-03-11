package com.epam.jc.task6;

import com.epam.jc.task7.MyFirstAnnotation;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Vladislav Boboshko
 */
public class AtomicSubmarineTest {

    @Test
    public void testSubmarine() throws Exception {
        AtomicSubmarine submarine = new AtomicSubmarine("U-101");
        assertFalse(submarine.powerOn());
        submarine.getEngine().powerOn();
        assertTrue(submarine.powerOn());
        assertTrue(submarine.getClass().getDeclaredAnnotation(MyFirstAnnotation.class).author().equals("Vladimir Lenin"));
    }
}