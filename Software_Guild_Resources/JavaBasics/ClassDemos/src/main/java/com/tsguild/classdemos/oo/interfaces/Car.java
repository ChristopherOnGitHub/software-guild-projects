/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.javabasics.interfaces;

/**
 *
 * @author ahill
 */
public class Car implements Driveable{
    
    private int numWheels;
    private String make;
    private String model;
    private int mpg;
    private int currentFuel;

    public Car() {
        this.numWheels = 4;
        this.make = "VW";
        this.model = "New Beetle";
        this.mpg = 50;
        this.currentFuel = 5;
    }

    public Car(int numWheels, String make, String model, int mpg) {
        this.numWheels = numWheels;
        this.make = make;
        this.model = model;
        this.mpg = mpg;
        this.currentFuel = 0;
    }

    
    // Make a car Driveable!!
    public boolean drive(int numMilesToDrive){
        
        int milesAbleToDrive = mpg * currentFuel;
        
        if(numMilesToDrive > milesAbleToDrive)
            return false;
        
        
        currentFuel = currentFuel - numMilesToDrive / mpg;
        return true;
    }
    
    
    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
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

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(int currentFuel) {
        this.currentFuel = currentFuel;
    }
    
    
    
}
