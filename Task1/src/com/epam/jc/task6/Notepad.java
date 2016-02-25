package com.epam.jc.task6;

import com.sun.istack.internal.Nullable;

import java.util.Arrays;
import java.util.List;

/**
 * A simple class that defines a simple notepad which can store some string records for you
 * @author endiny
 */
public class Notepad {
    private NotepadRecord[] records;

    /**
     * Creates an empty notepad without any records
     */
    public Notepad() {
        records = new NotepadRecord[0];
    }

    /**
     * Get a record
     * @param i index
     * @return Notepad record by specified index
     */
    @Nullable
    public NotepadRecord getRecord(int i) {
        if (i>=records.length || i<0) {
            return null;
        }
        return records[i];
    }

    /**
     * Insert a string record into the notepad
     * @param record String to insert
     * @return this
     */
    public Notepad setRecord(String record) {
        return setRecord(new NotepadRecord(record));
    }

    /**
     * Insert a NotepadRecord object into the notepad
     * @param record NotepadRecord to insert
     * @return this
     */
    public Notepad setRecord(NotepadRecord record) {
        List tmp = Arrays.asList(records);
        tmp.add(record);
        records = (NotepadRecord[])tmp.toArray();
        return this;
    }

    /**
     * Edit record by index with a string
     * @param i index
     * @param record string value
     * @return true if succeed
     */
    public boolean editRecord(int i, String record) {
        return editRecord(i, new NotepadRecord(record));
    }

    /**
     * Edit record by index witn a NotepadRecord object
     * @param i index
     * @param record NotepadRecord object
     * @return true if succeed
     */
    public boolean editRecord(int i, NotepadRecord record) {
        if (i>=records.length || i<0) {
            return false;
        }
        records[i] = record;
        return true;
    }

    /**
     * Remove a record at specified index
     * @param i index
     * @return true if succeed
     */
    public boolean removeRecord(int i) {
        if (i>=records.length || i<0) {
            return false;
        }
        List tmp = Arrays.asList(records);
        tmp.remove(i);
        records = (NotepadRecord[])tmp.toArray();
        return true;
    }

    /**
     * Prints all notepad records
     */
    public void printAll() {
        for (NotepadRecord i:records) {
            System.out.println(i.getRecord());
            System.out.println();
        }
    }
}
