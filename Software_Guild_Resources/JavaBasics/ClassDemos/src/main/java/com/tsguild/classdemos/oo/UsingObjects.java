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
public class UsingObjects {
    
    public static void main(String[] args) {
        
        new Dog();
        Dog dog = new Dog();
        Dog fido = new Dog("Fido", "Red", 20);
        
        fido.bark();
        fido.selfReflectiveBark();
        
//        red.bark(); // No Dog variable named red, so doesn't work.
        
        fido.getAge();
        int fidosAge = fido.getAge();
        System.out.println("Fido is this old: " + fidosAge);
        System.out.println("Fido is this old: " + fido.getAge());

//        Dog dog = new Dog(); // you'll start out like this
        dog.setAge(30);
        dog.setColor("Blue");
        dog.setName("Crazy Colored Dog Boo");
        
        System.out.println("dog now has a color, and it is: " + dog.getColor());
        
        Dog blueDog = dog;
        blueDog.setName("Blue");
        
        System.out.println("Both dog, and blueDog refer to the same dog.");
        System.out.println("And both, because blueDog changed, are named:");
        System.out.println("blueDog's name: " + blueDog.getName());
        System.out.println("dog's name: " + dog.getName());
        
    }
    
    
}
