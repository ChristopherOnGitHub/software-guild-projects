/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.oo.interfaces.dogs;

/**
 *
 * @author ahill
 */
public class StuffAndThings {
    public static void main(String[] args) {
        
        Dog fido = new Dog();
        fido.hug();
        
        TeddyBear teddy = new TeddyBear();
        teddy.hug();
        
        hugSOMETHING(teddy);
        hugSOMETHING(fido);
        hugSOMETHING(new Dog());
        
    }
    
    public static void hugSOMETHING(Huggable something){
        something.hug();
        something.hug();
    }
}
