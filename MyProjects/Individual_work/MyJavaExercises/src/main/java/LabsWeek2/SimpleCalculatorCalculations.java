/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2;

/**
 *
 * @author apprentice
 */
public class SimpleCalculatorCalculations {
    
    private double x;
    private double y;

    public SimpleCalculatorCalculations(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     *
     * @param x
     * @param y
     */

    
    public static double addition(double x, double y) {
        double z;
        z = x + y;
        return z;
    }
    
    public static double subtraction(double x, double y) {
        double z;
        z = x - y;
        return z;
    }

    public static double multiplication(double x, double y) {
        double z;
        z = x * y;
        return z;
    }

    public static double division(double x, double y) {
        double z;
        z = x / y;
        return z;
    }

    SimpleCalculatorCalculations() {
    }
    
}
