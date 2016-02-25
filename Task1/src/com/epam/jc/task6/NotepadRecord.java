package com.epam.jc.task6;

/**
 * A simple class defines simple notepad record
 * @author endiny
 */
public class NotepadRecord {
    private String record;

    /**
     * Creates an empty notepad record
     */
    public NotepadRecord() {
        this("");
    }

    /**
     * Creates a record with a specified value
     * @param record value
     */
    public NotepadRecord(String record) {
        this.record = record;
    }

    public String getRecord() {
        return record;
    }
}
