/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemosWeek2;

/**
 *
 * @author apprentice
 */
public class Gotham {
    
    public static void main(String[] args) {
        
        SuperHero wonderWoman = new SuperHero("Wonder Woman", "JUSTICE!");
        SuperHero llamaLlama = new SuperHero("Llama Llama", "Spitting from 5000km away");
        SuperHero coffeeMakerMan = new SuperHero("CoffeeMakerMan", "Makes world's GREATEST coffee");
        SuperHero theFlash = new SuperHero("Mystique", "Shape shifting");
        
        System.out.println("A superhero will tell you their name");
        System.out.println(llamaLlama.getName());
        System.out.println("We can also ask them their powers");
        System.out.println(coffeeMakerMan.getName()+"'s power is...");
        System.out.println(coffeeMakerMan.getPower());
        System.out.println("Wonder Woman got bitten by a mongoose.");
        wonderWoman.setPower("The power of a rabid weasel. And justice.");
        System.out.println(wonderWoman.getName()+"'s new power is... ");
        System.out.println(wonderWoman.getPower());
        
        theFlash.setSecretIdentity("Really Mystique.");
        //theFlash.getSecretIdentity won't work. It is read only.
        
        theFlash.lastKnownLocation = "The Bahamas";
        
        
    }
    
}
