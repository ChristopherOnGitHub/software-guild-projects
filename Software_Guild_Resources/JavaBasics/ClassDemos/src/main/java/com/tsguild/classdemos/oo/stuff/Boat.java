/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.oo.stuff;

/**
 *
 * @author ahill
 */
public class Boat {
    
    private boolean isSunk = false;
    private int peopleAboard = 0;
    private String boatName = "USS Dunno";
    private String ownerName;
    
    
    // A constructor just describes how you want to set up your object
    // By DEFAULT one is provided
    // The default, basically ... doesn't do a lot.
    public Boat(){
        this.boatName = "USS SomethingOther";
    }
    
    public Boat(String boatName){
        this.boatName = boatName;
    }
    
    public Boat(int numPeopleAboard){
        this.peopleAboard = numPeopleAboard;
    }

    public Boat(String boatName, int peopleAboard){
        this.boatName = boatName;
        this.peopleAboard = peopleAboard;
    }
    
    public boolean isIsSunk() {
        return isSunk;
    }

    public void setIsSunk(boolean isSunk) {
        this.isSunk = isSunk;
    }

    public int getPeopleAboard() {
        return peopleAboard;
    }

    public void setPeopleAboard(int peopleAboard) {
        this.peopleAboard = peopleAboard;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }
    
    
    
}
