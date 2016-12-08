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
public class ShapeSquare extends ShapeRectangle{
    private double b;
    private double h;

    public ShapeSquare(double b, double h, String color) {
        super(b, h, color);
        this.b = b;
        this.h = h;
    }
    
    public ShapeSquare(){
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
