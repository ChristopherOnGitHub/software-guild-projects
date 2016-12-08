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
public class HerbivoreDinosaur extends Dinosaur{

    public HerbivoreDinosaur(){
        super("Barney");
    }
    
    @Override
    public boolean eatFood(Food foodToEat) {
       if(foodToEat instanceof Plant){
           System.out.println("Ohm nom nom. " + foodToEat.getFlavour());
           return true;
       }
       
        System.out.println("Ewww! That's disgusting!");
        return false;
    }
    
}
