/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.methods;

import java.util.Random;

/**
 *
 * @author ahill
 */
public class Bee {
    
    public void buzz(){
        System.out.println("BuzzZZzZZzZZzzzzz....!");
    }
    
    /**
     * Tells the bee to make honey
     * @param howMuchHoney - how much you want
     * @return a string of honey
     */
    public String makeHoney(int howMuchHoney){
        String honey = "";
        
        for (int i = 0; i < howMuchHoney; i++) {
            buzz();
            honey = honey + "honey";
        }
        
        return honey;
    }
    
    public String makeHoney(){
        Random r = new Random();
        return makeHoney(r.nextInt(9));
    }
    
}
