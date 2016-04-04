package com.epam.jc.task1;

import com.epam.jc.JavaKeywordCheckerTest;

/**
 * Created on 04/04/16.
 *
 * @author Vladislav Boboshko
 */
public class JavaKeywordCheckerTestByte extends JavaKeywordCheckerTest {
    @Override
    public void setUp() throws Exception {
        keywordChecker = new JavaKeywordCheckerByte();
    }
}
