package com.epam.jc.task5;

/**
 * @author endiny
 */
public class ArrayCrosser {
    private int[][] array;

    public void createMatrix() {
        array = new int[dimension][dimension];
        for (int[] j:array) {
            for (int i:j) {
                i=0;
            }
        }
        for (int i=0; i<dimension; i++) {
            array[i][i] = array[i][dimension-1-i] = 1;
        }
    }

    public void printMatrix() {
        for (int[] j:array) {
            for (int i:j) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public ArrayCrosser() {
        this(5);
    }

    public ArrayCrosser(int dimension) {
        this.dimension = dimension;
    }

    public int[][] getArray() {
        return array;
    }

    private int dimension;

    public int getDimension() {
        return dimension;
    }

    public ArrayCrosser setDimension(int dimension) {
        this.dimension = dimension;
        return this;
    }
}
