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
public class HouseGettersSetters {
    
    private final int bedrooms;
    public boolean forSale;

    HouseGettersSetters(int bedrooms, boolean forSale) {
       this.bedrooms = bedrooms;
       this.forSale = forSale;
    }
    
    public int numberBedrooms(){
        return this.bedrooms;
    }
    
    public boolean changeForSale(){
        return this.forSale = true;
    }
    
}
