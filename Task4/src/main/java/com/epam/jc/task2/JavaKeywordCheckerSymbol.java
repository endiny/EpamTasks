package com.epam.jc.task2;

import com.epam.jc.JavaKeywordChecker;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created on 04/04/16.
 *
 * @author Vladislav Boboshko
 */
public class JavaKeywordCheckerSymbol extends JavaKeywordChecker {
    @Override
    public boolean setFile(String path) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                buffer.append(s);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    protected void writeToFile(String path, StringBuffer buffer) {
        try (FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write(buffer.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
