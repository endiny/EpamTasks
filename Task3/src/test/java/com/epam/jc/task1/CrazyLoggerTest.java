package com.epam.jc.task1;

import org.junit.Test;

import java.util.concurrent.Future;

import static org.junit.Assert.*;

/**
 * Created by endiny on 16.03.16.
 */
public class CrazyLoggerTest {

    @Test
    public void testLogger() throws Exception {
        CrazyLogger.addMessage("test");
        CrazyLogger.addMessage("Mario");
        CrazyLogger.addMessage("testMario");
        CrazyLogger.addMessage("Variative");
        CrazyLogger.addMessage("So crazy");
        String a;
        System.out.println(a = CrazyLogger.findLastMessage("Var") + "\n");
        CrazyLogger.findMessages("Mario").forEach(System.out::println);
    }
}