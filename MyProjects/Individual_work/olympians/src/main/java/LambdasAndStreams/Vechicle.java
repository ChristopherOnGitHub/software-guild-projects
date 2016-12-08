/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdasAndStreams;

/**
 *
 * @author apprentice
 */
public class Vechicle {

    protected String color;
    protected String make;
    protected String model;
    protected boolean canFloat;

    public Vechicle() {
    }

    public Vechicle(String color, String make, String model, boolean canFloat) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.canFloat = canFloat;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean isCanFloat() {
        return canFloat;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCanFloat(boolean canFloat) {
        this.canFloat = canFloat;
    }

}
