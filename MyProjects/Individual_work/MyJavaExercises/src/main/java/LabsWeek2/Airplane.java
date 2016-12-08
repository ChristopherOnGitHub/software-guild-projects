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
public class Airplane {
    public int numberOfPassengers;
    public String nextDestination;
    private int numberOfWings;

    public Airplane(int numberOfPassengers, String nextDestination, int numberOfWings) {
        this.numberOfPassengers = numberOfPassengers;
        this.nextDestination = nextDestination;
        this.numberOfWings = numberOfWings;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getNextDestination() {
        return nextDestination;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setNextDestination(String nextDestination) {
        this.nextDestination = nextDestination;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }
    
    
}
