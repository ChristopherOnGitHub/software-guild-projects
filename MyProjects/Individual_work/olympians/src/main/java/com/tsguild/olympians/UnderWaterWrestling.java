/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.olympians;

/**
 *
 * @author apprentice
 */
public class UnderWaterWrestling implements Event{
    
    @Override
    public String compete(){
        System.out.println("BLUB!");
        return "UnderwaterWrestling";
    }
}
