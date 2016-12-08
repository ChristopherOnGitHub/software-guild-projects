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
public class TableProvingGround {
    
    TableProvingGround(int numberOfLegs, boolean isClearOfDebris){
        this.numberOfLegs = numberOfLegs;
        this.isClearOfDebris = isClearOfDebris;      
    }
    
    public int numberOfLegs;
    public boolean isClearOfDebris;
    
    public boolean cleanTable(){
        return this.isClearOfDebris = true;
    }
    
    public boolean messUpTable(){
        return this.isClearOfDebris = false;
    }
    
    public int numberOfLegs(){
        this.numberOfLegs = numberOfLegs;
        return this.numberOfLegs;
    }
    
    public int sawOffLeg(){
        this.numberOfLegs = numberOfLegs-1;
        return this.numberOfLegs;
    }
    
    
    
    
}
