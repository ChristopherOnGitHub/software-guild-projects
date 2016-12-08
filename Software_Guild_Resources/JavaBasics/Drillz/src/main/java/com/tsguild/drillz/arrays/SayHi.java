package com.tsguild.drillz.arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahill
 */
public class SayHi {
//    Given a String name, e.g. "Bob", return a greeting of the form "Hello Bob!". 
//
//  sayHi("Bob") -> "Hello Bob!"
//  sayHi("Alice") -> "Hello Alice!"
//  sayHi("X") -> "Hello X!"

    public static void main(String[] args) {
        SayHi testObject = new SayHi();
        String result = testObject.sayHi("Bob");
        System.out.println("With 'Bob': ");
        System.out.println(result);
        
        System.out.println("With 'Alice");
        System.out.println(testObject.sayHi("Alice"));
        
        System.out.println("With 'X");
        System.out.println(testObject.sayHi("X"));
        
    }
    
    
    public String sayHi(String name) {
        return "Hello " + name +"!";
    }

}
