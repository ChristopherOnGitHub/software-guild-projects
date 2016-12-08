/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.javabasics.lambdas;

/**
 *
 * @author ahill
 */
public class Spaceship {
    
    private int numFins = 3;
    private int numEngines = 1;
    
    private String color;
    private String pilotName;
    private String shieldType;
    
    private boolean hasLifeSupport = true;

    public Spaceship(String color, String pilotName, String shieldType,
                        int numFins, int numEngines, boolean hasLifeSupport) {
        this.color = color;
        this.pilotName = pilotName;
        this.shieldType = shieldType;
        this.numEngines = numEngines;
        this.numFins = numFins;
        this.hasLifeSupport = hasLifeSupport;
    }
    
    public void fly(){
        System.out.println("ZooooOoOoOooooOoOOmmm....!!");
    }

    public int getNumFins() {
        return numFins;
    }

    public void setNumFins(int numFins) {
        this.numFins = numFins;
    }

    public int getNumEngines() {
        return numEngines;
    }

    public void setNumEngines(int numEngines) {
        this.numEngines = numEngines;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public String getShieldType() {
        return shieldType;
    }

    public void setShieldType(String shieldType) {
        this.shieldType = shieldType;
    }

    public boolean hasLifeSupport() {
        return hasLifeSupport;
    }

    public void setHasLifeSupport(boolean hasLifeSupport) {
        this.hasLifeSupport = hasLifeSupport;
    }
    
    
}
