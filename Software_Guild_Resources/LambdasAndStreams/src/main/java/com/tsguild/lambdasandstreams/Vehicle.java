/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.lambdasandstreams;

/**
 *
 * @author ahill
 */
public class Vehicle {
    
    protected String color;
    protected String make;
    protected String model;
    protected boolean canFloat;

    public Vehicle(){}
    
    public Vehicle(String color, String make, String model, boolean canFloat) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.canFloat = canFloat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isCanFloat() {
        return canFloat;
    }

    public void setCanFloat(boolean canFloat) {
        this.canFloat = canFloat;
    }
    
    
    
}
