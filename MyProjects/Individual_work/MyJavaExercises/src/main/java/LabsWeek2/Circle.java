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
public class Circle {
    public double diameter;
    public double radius;
    public String color;

    public Circle(double diameter, double radius, String color) {
        this.diameter = diameter;
        this.radius = radius;
        this.color = color;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
