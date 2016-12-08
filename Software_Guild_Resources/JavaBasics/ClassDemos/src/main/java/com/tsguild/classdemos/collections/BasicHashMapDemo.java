/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.collections;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


/**
 *
 * @author ahill
 */
public class BasicHashMapDemo {
    public static void main(String[] args) {
        
        HashMap< String , Double > favoriteNumbers = new HashMap<>();
        
        // To add things to a map, you have to provide a key AND a value at the time
        // of storage.
        favoriteNumbers.put("Frida", 3.346);
        favoriteNumbers.put("Queenie", 3.1415926);
        favoriteNumbers.put("Dirk", 0.0);
        favoriteNumbers.put("Wren", 7.0);
        favoriteNumbers.put("Lola", 18.0);
        favoriteNumbers.put("Bill", 42.0);
        favoriteNumbers.put("Joe", 13.0);
        
        // If you want to get a particular something from the map that was stored, you need
        // to provide the key to get that value!
        System.out.println("Joe's favorite number is " + favoriteNumbers.get("Joe"));
        System.out.println("Lola's favorite number is " + favoriteNumbers.get("Lola"));
        
        // If you try to find something that hasn't been stored ... you get nuffin'!
        System.out.println("Moomer's favorite number is " + favoriteNumbers.get("Moomer"));
        
        System.out.println("There are " + favoriteNumbers.size() + " things stored in this Map.");
        
        // If you store a value using a previously used key - it will overwrite the old value!
        favoriteNumbers.put("Lola", 2.0);
        
        System.out.println("There are STILL " + favoriteNumbers.size() + " things stored in this Map.");
        
        // Keys have to be unique - so they will return as a set.
        Set<String> keys = favoriteNumbers.keySet();
        
        System.out.println("\n**** All the names ****");
        
        // You can iterate directly over all of the keys - tho they are unordered.
        for(String name : keys){
            System.out.print( name + ", ");
        }
        
        // Values don't have to be unique, you can store similar values with different keys.
        Collection<Double> numbers = favoriteNumbers.values();
        
        System.out.println("\n**** All the numbers ****");
        
        // You can iterate directly over all of the values, also unordered.
        for(Double num : numbers){
            System.out.print(num + ", ");
        }
        
        // If you want to iterate over the key AND value pairs all at once
        // you can use an entry set. Entry is a kind of item that has a single key/value pair
        // So when you get the entry set, it gets a SET of ENTRIES - one for each of the
        // stored items/keys in your map.
        Set<Entry<String, Double>> bothItems = favoriteNumbers.entrySet();
        System.out.println("\n**** Both names and numbers ****");
        for(Entry<String, Double> entry : bothItems){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
    }
}

