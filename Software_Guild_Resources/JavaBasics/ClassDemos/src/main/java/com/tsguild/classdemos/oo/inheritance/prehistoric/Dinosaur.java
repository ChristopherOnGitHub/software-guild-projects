/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.javabasics.inheritance.prehistoric;

/**
 *
 * @author ahill
 */
public abstract class Dinosaur {

    private String name;
    
    public Dinosaur(String name){
        this.name = name;
    }
    
    abstract public boolean eatFood(Food foodToEat);
    
    public void move(){
        System.out.println("Dur de dur I am walking, and am a dinosaur ...");
    }
    
}
