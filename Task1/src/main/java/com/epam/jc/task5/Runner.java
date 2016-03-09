package com.epam.jc.task5;

/**
 * @author endiny
 */
public class Runner {
    public static void main(String[] args) {
        ArrayCrosser arrayCrosser = new ArrayCrosser(100);
        arrayCrosser.createMatrix();
        arrayCrosser.printMatrix();
    }
}
