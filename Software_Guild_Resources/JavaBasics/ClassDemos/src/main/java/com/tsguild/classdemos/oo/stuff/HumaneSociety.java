/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.oo.stuff;

import com.tsguild.classdemos.oo.stuff.Dog;

/**
 *
 * @author ahill
 */
public class HumaneSociety {
    public static void main(String[] args) {
        
        // To use a non static method in a class
        // I first have to instantiate a version of the object
        Dog fido = new Dog("Fido", "Mutt", "Brown", 4, 42, 1, 20, 2);
        
        fido.bark();
        fido.sit();
        
        System.out.println("Fido weighs "+ fido.getWeight());
        
        fido.eat(2);
        
        System.out.println("Fido ate food, and weighs: " + fido.getWeight());
        
        fido.poo();
        
        System.out.println("After Fido's bathroom break" + fido.getWeight());
        
        // Fido got older
        fido.setAge(fido.getAge() + 1);
    }
    
}
