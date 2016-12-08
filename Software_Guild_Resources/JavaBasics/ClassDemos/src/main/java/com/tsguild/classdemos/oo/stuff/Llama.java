/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.oo.stuff;

/**
 *
 * @author apprentice
 */
public class Llama {
    
    // Make properties private, and control your access/mutability via getters & setters
    // There are 4 access modifiers: private, protected, <blank>, public
    private String name;
    private int age;
    LlamaSpit spit;
    
    // A Constructor is a method that shares the same name as the class it is enclosed by
    // and no return type (because it is meant to return the object it is instantiating!)
    public Llama(String name){
        this.name = name;
        this.spit = new LlamaSpit();
    }
    
    // This is a noargs constructor - an empty code block and no parameters
    // This is included by "default" in all classes, until you provide a new constructor.
    public Llama(){
        
    }
    
    // getters should return the same type as a property, take no params and be
    // named after the property, but with get prepended.
    public String getName(){
        return name;
    }
    
    // setters can return void, take in a param if the same type as a property and be
    // named after the property, but with set prepended.
    public void setName(String name){
        this.name = name;
    }

   public int getAge(){
       return this.age;
   }

    // If you want to make a private property read only - remove its setter!
   public void setAge(int age){
       this.age = age;
   }
   
   public void spit(){
       System.out.println("Pthoooey!");
   }
   
   // Non static inner classes belong to instances of the classes that enclose
   // them - the outer object will have to be instantiated first before the inner
   // class can be instantiated!
   public class LlamaSpit{
       private int spitCapacity = 10;
   }
   
   // Static classes belong to the class above them, but can be references directly
   // by OuterClass.InnerClass directly without having to instantiate that outer
   // class.
   static public class LlamaThing{
       
   }
   
}
