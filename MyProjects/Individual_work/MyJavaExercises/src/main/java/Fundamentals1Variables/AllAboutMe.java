package Fundamentals1Variables;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apprentice
 */
public class AllAboutMe {
    public static void main(String[] args) {
        
        String myName = "Christopher Floyd.";
        int numberOfPets = 1;
        String favoriteFood = "steak and beer.";
        boolean haveEatenGnocchi = false;
        String ageOfWhistling = "(current status of whistling is very poor, "
                + "please contact author for additional info)";
        
        System.out.println("I am " + myName);
        System.out.println("I have " + numberOfPets + " pet(s).");
        System.out.println("My favorite meal is " + favoriteFood);
        System.out.println("It is " + haveEatenGnocchi + " that I have eaten gnocchi.");
        System.out.println("And when I was " + ageOfWhistling + ", I learned to whistle.");
    }
    
}
