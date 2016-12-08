/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.collections;


import com.tsguild.classdemos.methods.Bee;
import com.tsguild.classdemos.collections.Llama;
import java.util.HashMap;

/**
 *
 * @author ahill
 */
public class ComplexMaps {
    public static void main(String[] args) {
        
        HashMap<String, String> wordsToWords = new HashMap<>();
        HashMap<String, Integer> favoriteNumbersOfPeople = new HashMap<>();
        HashMap<String, Bee> beeHive = new HashMap<>();
        
        // I can instantiate a new object and store it in a var name
        // And THEN store that in the HashMap
        Bee queenBee = new Bee();
        beeHive.put("Queenie", queenBee);
        
        beeHive.put("Drone", new Bee());
        beeHive.put("Worker", new Bee());
        
        
        HashMap<String, Llama> llamaHerd = new HashMap<>();
        llamaHerd.put("Floyd", new Llama("Floyd", 3, "curly"));
        llamaHerd.put("Angelina", new Llama("Angelina", 13, "straight black and white"));
        llamaHerd.put("Pepper", new Llama("Pepper", 8, "soft brown and white"));
        llamaHerd.put("Oreo", new Llama("Oreo", 10, "curly brown and white"));
        llamaHerd.put("Boo", new Llama("Boo", 1, "straight black"));
        
        Llama oreo = llamaHerd.get("Oreo");
//        System.out.println(oreo);
        System.out.println("Oreo's age is " + oreo.getAge());
        System.out.println("Oreo's wool type is " + oreo.getWoolType());
        
        System.out.println("These are my llama's wools");
        for (Llama aLlama : llamaHerd.values()) {
            System.out.println(aLlama.getWoolType());
        }
        
        
        
        
    }
}
