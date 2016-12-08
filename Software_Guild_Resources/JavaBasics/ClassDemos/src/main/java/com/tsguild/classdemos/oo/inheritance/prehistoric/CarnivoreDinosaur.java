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
public class CarnivoreDinosaur extends Dinosaur{

    public CarnivoreDinosaur(String name){
        super(name);
    }
    
    @Override
    public boolean eatFood(Food foodToEat) {
        
        if(foodToEat instanceof Meat){
            System.out.println("Mmmm," + foodToEat.getFlavour());
            return true;
        }
        
        System.out.println("I can't eat that.");
        return false;
    }
    
    public void eatMeat(Meat meatses){
        System.out.println("Mmmm. That is delicious.");
    }
    
}
