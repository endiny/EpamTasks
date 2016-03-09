package com.epam.jc.task3.stationery.writers;

/**
 * @author endiny
 */
public class Pen extends WritingTool {
    public Pen(Color color, double thickness) {
        super(3.50, "Pen", color, thickness);
    }

    @Override
    public String someStationeryAction() {
        return "Just a pen. Nothing more.";
    }
}
