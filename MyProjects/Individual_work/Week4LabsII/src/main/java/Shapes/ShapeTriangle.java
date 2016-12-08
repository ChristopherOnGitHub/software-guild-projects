/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

/**
 *
 * @author apprentice
 */
public class ShapeTriangle extends Shape {

    private double side1;
    private double side2;
    private double side3;
    private double b;
    private double h;

    public ShapeTriangle() {
        super();
    }

    public ShapeTriangle(double side1, double side2, double isde3, String color, double b, double h) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = isde3;
        this.b = b;
        this.h = h;
    }
    
    @Override
    public double areaCalc(){
        double area = b*h*0.5;
        return area;
    }
    
    @Override
    public double perimeterCalc(){
       double p = side1 + side2 + side3;
       return p;
    }


}
