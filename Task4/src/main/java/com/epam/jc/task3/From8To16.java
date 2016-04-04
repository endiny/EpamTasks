package com.epam.jc.task3;

import com.sun.media.jfxmedia.track.Track;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created on 04/04/16.
 *
 * @author Vladislav Boboshko
 */
public class From8To16 {
    private StringBuffer buffer = new StringBuffer();

    public boolean setFile(String path) {
        buffer = new StringBuffer();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                buffer.append(s);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found");
            return false;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void encode(String toPath) {
        try (FileWriter fileWriter = new FileWriter(toPath)) {
            String result = new String(buffer.toString().getBytes("UTF-16"), "UTF-8");
            fileWriter.write(result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
