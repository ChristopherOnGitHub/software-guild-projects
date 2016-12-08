/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.collections;

import java.util.ArrayList;

/**
 *
 * @author ahill
 */
public class AutoBoxingDemo {
    public static void main(String[] args) {
        
        // Collections have to be declared with a OBJECT type as their generic parameter
        // This means you can't store primitives in an ArrayList, they have to be the 
        // "big brother" associated objects, for int this means Integer.
        ArrayList<Integer> integerList = new ArrayList<>();
        // You can create Integer objects using an int and the Integer constructor.
        Integer three = new Integer(3); 
        integerList.add(three); // Adding this to an ArrayList then works as per normal.
        
        // However, you can still use add() and pass it an int, and java will
        // AUTOBOX that number (translating it into it's Integer counterpart)
        // before adding that into the list.
        integerList.add(3);
        
        // Retrieving that newly added primitive can return the corresponding Integer
        Integer x1 = integerList.get(1);
        // Or it can be UNBOXED (translated into the primitive equivalent)
        int x2 = integerList.get(1);
        
    }
}
