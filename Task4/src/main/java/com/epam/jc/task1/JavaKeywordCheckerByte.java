package com.epam.jc.task1;

import com.epam.jc.JavaKeywordChecker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created on 04/04/16.
 *
 * @author Vladislav Boboshko
 */
public class JavaKeywordCheckerByte extends JavaKeywordChecker {
    @Override
    public boolean setFile(String path) {
        try (FileInputStream inputStream = new FileInputStream(path)) {
            int data = inputStream.read();
            while (data != -1) {
                buffer.append((char)data);
                data = inputStream.read();
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found.");
            return false;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    protected void writeToFile(String path, StringBuffer buffer) {
        try (FileOutputStream outputStream = new FileOutputStream(path)) {
            char[] arr = buffer.toString().toCharArray();
            for (char i:arr) {
                outputStream.write(i);
            }
        }
        catch (Exception e) {
            System.err.println("Something just has happened and couldn't write to file");
        }
    }
}
