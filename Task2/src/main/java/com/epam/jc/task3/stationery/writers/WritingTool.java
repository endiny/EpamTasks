package com.epam.jc.task3.stationery.writers;

import com.epam.jc.task3.stationery.BaseStationery;

/**
 * @author Vladislav Boboshko
 */
public abstract class WritingTool extends BaseStationery {
    public Color getColor() {
        return color;
    }

    public double getThickness() {
        return thickness;
    }

    public WritingTool(double price, String name, Color color, double thickness) {
        super(price, name);
        this.color = color;
        this.thickness = thickness;
    }

    private Color color;
    private double thickness;




}
