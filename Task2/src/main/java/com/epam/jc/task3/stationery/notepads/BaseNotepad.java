package com.epam.jc.task3.stationery.notepads;

import com.epam.jc.task3.stationery.BaseStationery;

/**
 * @author endiny
 */
public abstract class BaseNotepad extends BaseStationery {

    private Size size;
    private int numberOfSheets;

    public Size getSize() {
        return size;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public BaseNotepad(double price, String name, Size size, int numberOfSheets) {
        super(price, name);
        this.size = size;
        this.numberOfSheets = numberOfSheets;
    }

    @Override
    abstract public String someStationeryAction();
}
