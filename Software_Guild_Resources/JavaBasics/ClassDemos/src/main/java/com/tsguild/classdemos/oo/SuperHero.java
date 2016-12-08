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
public class SuperHero {
   
    private static int superHeroCount;
    
    private String name;
    private String power;
    private String secretIdentity;
    public String lastKnownLocation;
    
    public SuperHero(String name, String power){
        superHeroCount++;
        this.name = name;
        this.power = power;
    }
    
    public static int getSuperHeroCount(){
        return superHeroCount;
    }
    
    public int getNumSuperHeroes(){
        return superHeroCount;
    }
    
    // A super hero will tell anyone who asks
    // their name. But, no one gets to CHANGE it.
    public String getName(){
        return this.name;
    }
    
    // Super heroes will also tell other people their power
    // If asked.
    public String getPower(){
        return this.power;
    }
    
    // And their powers can even be changed by external forces
    // DUN DUN DUN
    public void setPower(String power){
        this.power = power;
    }
    
    // However, while they allow their secret identity to change
    // They're not going to tell ANYONE about it. It's SECRET!!!
    public void setSecretIdentity(String newIdentity){
        this.secretIdentity = newIdentity;
    }
    
    
    
}
