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
public class SpaceShip extends Vehicle{
    private int numberOfFins;
    private int aliensAboard;
    
    public SpaceShip(String color, boolean canFloat, int numFins, int aliens){
        super(color, "Spaceship", "Fancy Spaceship", canFloat);
        this.numberOfFins = numFins;
        this.aliensAboard = aliens;
    }

    public int getNumberOfFins() {
        return numberOfFins;
    }

    public void setNumberOfFins(int numberOfFins) {
        this.numberOfFins = numberOfFins;
    }

    public int getAliensAboard() {
        return aliensAboard;
    }

    public void setAliensAboard(int aliensAboard) {
        this.aliensAboard = aliensAboard;
    }
    
    
    
}
