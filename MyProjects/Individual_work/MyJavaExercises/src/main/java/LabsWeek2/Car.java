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
public class Car {
    private String make;
    private String model;
    private int year;
    private int odometer;

    public Car(String make, String model, int year, int odometer) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getOdometer() {
        return odometer;
    }

}
