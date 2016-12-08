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
public class ShapeCircle extends Shape{
    private double r;
    
    public ShapeCircle(){
        super();
    }

    public ShapeCircle(double r, String color) {
        super(color);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double areaCalc(){
        double area = Math.PI*r*r;
        return area;
    }
    
    @Override
    public double perimeterCalc(){
        double p = 2*Math.PI*r;
        return p;
    }
    
    
}