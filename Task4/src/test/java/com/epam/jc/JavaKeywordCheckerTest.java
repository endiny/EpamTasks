package com.epam.jc;

import com.epam.jc.JavaKeywordChecker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.*;

/**
 * Created on 04/04/16.
 *
 * @author Vladislav Boboshko
 */
public abstract class JavaKeywordCheckerTest {
    protected JavaKeywordChecker keywordChecker;

    @Before
    public abstract void setUp() throws Exception;

    @Test
    public void complexTest() throws Exception {
        keywordChecker.setFile("src/main/java/com/epam/jc/task1/JavaKeywordCheckerByte.java");
        keywordChecker.countKeywords("tmp");
    }

    @After
    public void tearDown() throws Exception {
        assertTrue(new File("tmp").delete());
    }
}