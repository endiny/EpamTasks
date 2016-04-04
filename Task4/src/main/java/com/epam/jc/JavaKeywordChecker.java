package com.epam.jc;

import java.io.FileInputStream;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created on 04/04/16.
 *
 * @author Vladislav Boboshko
 */
public abstract class JavaKeywordChecker {
    protected StringBuffer buffer = new StringBuffer();
    private final String[] keywords = { "abstract", "assert", "boolean",
            "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "extends", "false",
            "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native",
            "new", "null", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "true",
            "try", "void", "volatile", "while" };

    public abstract boolean setFile(String path);

    public void countKeywords(String path) {
        StringBuffer result = new StringBuffer();
        for (String i:keywords) {
            int tmp = buffer.indexOf(i);
            int count = 0;
            while (tmp != -1) {
                count++;
                tmp = buffer.indexOf(i, tmp+1);
            }
            result.append(i)
                    .append(" - ")
                    .append(count)
                    .append('\n');
        }
        System.out.println(result);
        writeToFile(path, result);
    }

    protected abstract void writeToFile(String path, StringBuffer buffer);
}
