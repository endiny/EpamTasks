package com.epam.jc.task1;

/**
 * @author Vladislav Boboshko
 */
public class Pen {
    public Color getColor() {
        return color;
    }

    public double getDensity() {
        return density;
    }

    public int getOpacity() {
        return opacity;
    }

    private Color color;
    private double density;
    private int opacity;

    public Pen() {
        this(Color.BLUE, 0.1, 0);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pen{");
        sb.append("color=").append(color);
        sb.append(", density=").append(density);
        sb.append(", opacity=").append(opacity);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (Double.compare(pen.density, density) != 0) return false;
        if (opacity != pen.opacity) return false;
        return color == pen.color;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = color != null ? color.hashCode() : 0;
        temp = Double.doubleToLongBits(density);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + opacity;
        return result;
    }

    public Pen(Color color, double density, int opacity) {

        this.color = color;
        this.density = density;
        this.opacity = opacity;
    }
}

enum Color {
    RED,
    GREEN,
    BLUE,
    BLACK,
    YELLOW,
    PURPLE,
    UNKNOWN
}