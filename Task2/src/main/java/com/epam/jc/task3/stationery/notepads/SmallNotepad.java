package com.epam.jc.task3.stationery.notepads;

/**
 * @author Vladislav Boboshko
 */
public class SmallNotepad extends BaseNotepad {
    public SmallNotepad(Size size, int numberOfSheets) {
        super(4, "Small Notepad", size, numberOfSheets);
    }

    @Override
    public String someStationeryAction() {
        return "I'm so small notepad. You can write on me";
    }
}
