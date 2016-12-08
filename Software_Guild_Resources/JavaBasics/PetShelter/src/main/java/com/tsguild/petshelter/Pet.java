/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelter;

/**
 *
 * @author ahill
 */
public class Pet {
    
    private int id;
    private String name;
    private String condition;
    private String species;
    
    // What the default constructor would look like
    // if it were visible. Otherwise known as a no args constructor.
    // ('cause it's no longer default if I'm writing it out...)
    public Pet(){}
    
    public Pet(int id, String name, String condition, String species){
        this.id = id;
        this.name = name;
        this.condition = condition;
        this.species = species;
    }
    
    // GETTERS FOR MY PROPERTIES
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getCondition(){
        return this.condition;
    }
    
    public String getSpecies(){
        return this.species;
    }
    
    // SETTERS FOR MY PROPERTIES
    
    // This would be part of a builder pattern
//    public Pet setId(int id){
//        this.id = id;
//        return this;
//    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setCondition(String condition){
        this.condition = condition;
    }
    
    public void setSpecies(String species){
        this.species = species;
    }
}
