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
abstract public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }
    
    Shape(){
        
    }
    
    abstract public double areaCalc();

    
    abstract public double perimeterCalc();
    
    
}
