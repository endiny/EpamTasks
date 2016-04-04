package com.epam.jc.task3;

import org.junit.After;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created on 04/04/16.
 *
 * @author Vladislav Boboshko
 */
public class From8To16Test {
    @Test
    public void complexTest() throws Exception {
        From8To16 encoder = new From8To16();
        assertTrue(encoder.setFile("src/main/resources/cyrillic_text"));
        encoder.encode("tmp");
    }

    @After
    public void tearDown() throws Exception {
        assertTrue(new File("tmp").delete());
    }
}