/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.javabasics.collections;

import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author ahill
 */
public class IteratingOverMaps {
    public static void main(String[] args) {
        
        HashMap<String, Integer> mapOfThings = new HashMap<>();
        // pretend that I've added a bunch of things here.
        mapOfThings.put("Dog", 2);
        mapOfThings.put("Cat", 5);
        
        
        Collection<String> animals = mapOfThings.keySet();
        for (String animal : animals) {
            System.out.println(animal);
            System.out.println(mapOfThings.get(animal));
        }
        
        String[] animalsAsArray = new String[mapOfThings.keySet().size()];
        mapOfThings.keySet().toArray(animalsAsArray);
        for (int i = 0; i < animalsAsArray.length; i++) {
            System.out.println(animalsAsArray[i]);
        }
        
    }
}
