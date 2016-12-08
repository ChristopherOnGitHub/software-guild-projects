/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.oo.stuff;

/**
 *
 * @author ahill
 */
public class Dog {
    private String dogName;
    private String breedName;
    private String colorName;
    
    private double numberOfLegs;
    private int numberOfTeeth;
    private double numberOfTails;
    
    private double weight;
    private double age;
    
//    public Dog(){
//        dogName = "Fido";
//        breedName = "Mutt";
//        colorName = "Boring brown";
//        
//        numberOfLegs = 4;
//        numberOfTeeth = 22;
//        numberOfTails = 1;
//        
//        weight = 32;
//        age = 1;
//    }
    
    public Dog(String nameIn, String breedNameIn, String colorNameIn,
            double numLegsIn, int numTeethIn, double numTailsIn,
            double weightIn, double ageIn){
        
        dogName = nameIn;
        breedName = breedNameIn;
        colorName = colorNameIn;
        numberOfLegs = numLegsIn;
        numberOfTeeth = numTeethIn;
        numberOfTails = numTailsIn;
        weight = weightIn;
        age = ageIn;
    }
    
    public String getName(){
        return this.dogName;
    }
    
    public double getAge(){
        return this.age;
    }
    
    public void setAge(double age){
        this.age = age;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public void bark(){
        System.out.println("WOOF!");
    }
    
    public void sit(){
        System.out.println("Sitting...");
    }
    
    public void eat(int poundsOfFood){
        System.out.println("Ohm nom nom..");
        this.weight = this.weight + poundsOfFood;
    }
    
    public void poo(){
        System.out.println("Whiiine...!");
        this.weight = this.weight - 1;
    }
    
    
}
