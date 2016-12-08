/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.oo;

import com.tsguild.classdemos.oo.stuff.Boat;

/**
 *
 * @author ahill
 */
public class UsingMoreObjects {
    
    public static void main(String[] args) {
        
        
        new Boat();
        Boat coolBoat = new Boat("Cool Boat");
//        Boat coolBoat2 = new Boat(3);
        coolBoat.setPeopleAboard(3);
        
        
    }
    
}
