/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ahill
 */
public class BasicArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<String> bob = new ArrayList<>();
        
        // Ask bob how big he is
        System.out.println("Bob, is thissss big " + bob.size());
        
        // Add a string to bob
        bob.add("Llama");
        
        // Ask bob how big he is
        System.out.println("Bob, is now thissss big " + bob.size());
        
        // You can add as many things as you want to an array list.
        bob.add("Hey there");
        bob.add("Marmot");
        bob.add("Pikachu");
        bob.add("Chocolate chip cookie");
        bob.add("North East Main Street");
        bob.add("Llama"); // You can add "duplicate" things to an ArrayList
        
        System.out.println("Bob has grown to size " + bob.size());
        
        System.out.println("The first thing I put in bob is " + bob.get(0));
        
        // You can either remove things by index
        bob.remove(3);
        // Or by object (equivalance).
        bob.remove("Llama"); 
        // Notice there are two llamas, this will remove the FIRST item in the list 
        // that matches (or is .equals())
        
        System.out.println("Bob has shrunk to size " + bob.size());
        
        // You can use enhanced for loops with a collection..
        for(String s : bob){
            System.out.println(s);
        }
        
        // Or the traditional for loop, if you prefer.
        // This is the same thing (basically)
        for (int i = 0; i < bob.size(); i++) {
            String s = bob.get(i);
            System.out.println(s);
        }
        
        // You can also loop over the items using an iterator.
        
        // An iterator must share the same generic as the collection it is connected to
        // and you must generate it by calling the iterator functionality!
        Iterator<String> dandelion = bob.iterator();
        
        // Like dandelions, once you blow it off the pod, you can't use it again!
        while(dandelion.hasNext()){
            String s = dandelion.next();
            System.out.println(s);
        }
        
        dandelion = bob.iterator();
        while(dandelion.hasNext()){
            String s = dandelion.next();
            System.out.println(s);
        }
        
    }
}
