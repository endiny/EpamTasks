package com.epam.jc.task2;

import com.epam.jc.JavaKeywordCheckerTest;

/**
 * Created on 04/04/16.
 *
 * @author Vladislav Boboshko
 */
public class JavaKeywordCheckerTestSymbol extends JavaKeywordCheckerTest {
    @Override
    public void setUp() throws Exception {
        keywordChecker = new JavaKeywordCheckerSymbol();
    }
}
