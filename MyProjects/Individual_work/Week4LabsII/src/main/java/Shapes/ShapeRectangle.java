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
 public class ShapeRectangle extends Shape{
    
    private double b;
    private double h;

    public ShapeRectangle(double b, double h, String color) {
        super(color);
        this.b = b;
        this.h = h;
    }
    
    public ShapeRectangle(){
        super();
    }
    
    @Override
    public double areaCalc(){
        double area = b*h;
        return area;
    }
    
    @Override
    public double perimeterCalc(){
        double p = (b*2)+(h*2);
        return p;
    }
    
}
