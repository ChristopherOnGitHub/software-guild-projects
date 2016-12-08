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
public class Dog {
   
    private String name;
    private int age;
    private String color;
    
    // default constructors look like this
    public Dog(){
    
    }
    
    public Dog(String aName, String aColor, int anAge){
        this.name = aName;
        this.color = aColor;
        this.age = anAge;
    }
    
    public void bark(){
        System.out.println("WOOF!");
    }
    
    public void selfReflectiveBark(){
        System.out.println("I am " + name);
        System.out.println("And thus I bark.");
        this.bark();
    }
    
    public void barkTwice(){
        this.bark();
        this.bark();
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public int getAge(){
        return this.age;
    }
    
    // Setters or Mutators
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
}
