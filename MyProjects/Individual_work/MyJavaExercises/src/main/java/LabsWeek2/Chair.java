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
public class Chair {
    public boolean isBeingSatIn;
    public String sentenceBeingYelledAtChair;
    private String materialOfChair;

    public Chair(boolean isBeingSatIn, String sentenceBeingYelledAtChair, String materialOfChair) {
        this.isBeingSatIn = isBeingSatIn;
        this.sentenceBeingYelledAtChair = sentenceBeingYelledAtChair;
        this.materialOfChair = materialOfChair;
    }

    public boolean isIsBeingSatIn() {
        return isBeingSatIn;
    }

    public String getSentenceBeingYelledAtChair() {
        return sentenceBeingYelledAtChair;
    }

    public String getMaterialOfChair() {
        return materialOfChair;
    }

    public void setIsBeingSatIn(boolean isBeingSatIn) {
        this.isBeingSatIn = isBeingSatIn;
    }

    public void setMaterialOfChair(String materialOfChair) {
        this.materialOfChair = materialOfChair;
    }
    
    
    
}
