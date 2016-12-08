/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.oo;

/**
 *
 * @author ahill
 */
public class Gotham {
   
    public static void main(String[] args) {
       
//        System.out.println("Num superheroes: " + SuperHero.superHeroCount);
        SuperHero wonderWoman = new SuperHero("Wonder Woman", "Justice and Magic");
        SuperHero llamaLlama = new SuperHero("Llama Llama", "Spitting from 50000km away");
        
        System.out.println("Num superheroes: " + llamaLlama.getNumSuperHeroes());
        
        SuperHero coffeeMakerMan = new SuperHero("CoffeeMakerMan", "Makes Worlds GREATEST Coffee");
        SuperHero theFlash = new SuperHero("Mystique", "Being blue, and shape shifty");
        
        System.out.println(SuperHero.getSuperHeroCount());
        
        System.out.println("Num superheroes: " + llamaLlama.getNumSuperHeroes());
        System.out.println("Num superheroes: " + theFlash.getNumSuperHeroes());
        
        System.out.println("A superhero will tell you their name...");
        System.out.println(llamaLlama.getName());
        
        System.out.println("We can also ask them their powers...");
        System.out.println(coffeeMakerMan.getName() + "'s power is...");
        System.out.println(coffeeMakerMan.getPower());
        
        System.out.println("Now unfortunately, wonderWoman got bitten by a Mongoose..");
        System.out.println("And evolved a new power...");
        wonderWoman.setPower("The power of a rabid weasel creature. And justice.");
        System.out.println(wonderWoman.getName() + "'s new power: ");
        System.out.println(wonderWoman.getPower());
     
//        theFlash.setName("The Flash");
        theFlash.setSecretIdentity("Really Mystique. Wait no, Lily Thompson. Or Bud.");
//        theFlash.getSecretIdentity();
        
        theFlash.lastKnownLocation = "The Bahamas";
        theFlash.lastKnownLocation = null;
        theFlash.lastKnownLocation = "";
        theFlash.lastKnownLocation = "The Moon";
    
    }
    
}
