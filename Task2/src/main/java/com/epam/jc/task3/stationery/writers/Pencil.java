package com.epam.jc.task3.stationery.writers;

/**
 * @author endiny
 */
public class Pencil extends WritingTool {
    public Pencil(Color color, double thickness) {
        super(1.50, "Pencil", color, thickness);
    }

    @Override
    public String someStationeryAction() {
        return "A best choice for a pupil who loves to forget his pen";
    }
}
