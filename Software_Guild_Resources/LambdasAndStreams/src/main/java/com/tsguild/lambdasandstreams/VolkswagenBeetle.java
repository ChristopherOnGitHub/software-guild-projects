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
public class VolkswagenBeetle extends Car {
    
    public VolkswagenBeetle(String color){
        this.color = color;
        this.make = "Volkswagen";
        this.model = "New Beetle";
        this.canFloat = true;
    }
    
    @Override
    public void beep(){
        System.out.println("Beep beep beepity beep!!! <flower>");
    }
    
}
