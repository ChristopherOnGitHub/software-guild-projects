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
public class Couch {
    public boolean isBeingSatIn;
    private String materialOfCouch;
    public boolean isOnFire;

    public Couch(boolean isBeingSatIn, String materialOfCouch, boolean isOnFire) {
        this.isBeingSatIn = isBeingSatIn;
        this.materialOfCouch = materialOfCouch;
        this.isOnFire = isOnFire;
    }

    public boolean isIsBeingSatIn() {
        return isBeingSatIn;
    }

    public String getMaterialOfCouch() {
        return materialOfCouch;
    }

    public boolean isIsOnFire() {
        return isOnFire;
    }

    public void setIsBeingSatIn(boolean isBeingSatIn) {
        this.isBeingSatIn = isBeingSatIn;
    }

    public void setIsOnFire(boolean isOnFire) {
        this.isOnFire = isOnFire;
    }
    
    
    
}
