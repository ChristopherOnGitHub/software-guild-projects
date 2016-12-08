/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.drills;

/**
 *
 * @author apprentice
 */
public class Arrays {
    
//    Given an array of ints, return true if 6 appears as either the first or last 
//    element in the array. The array will be length 1 or more. 
//
//    FirstLast6({1, 2, 6}) -> true
//    FirstLast6({6, 1, 2, 3}) -> true
//    FirstLast6({13, 6, 1, 2, 3}) -> false
    public boolean FirstLast6(int[] numbers) {
        // THEN YOU WRITE CODE
//        if(numbers[0] == 6)
//            return true;
//        if(numbers[numbers.length - 1] == 6)
//            return true;
//        return false;

        boolean hasSix = false;
        
        int lastItemIndex = numbers.length - 1;
        if(numbers[0] == 6 || numbers[lastItemIndex] == 6)
            hasSix = true;
        return hasSix;
    }
    
//    Given an int array , return true if it contains an even number (HINT: Use Mod (%)). 
//
//    HasEven({2, 5}) -> true
//    HasEven({4, 3}) -> true
//    HasEven({7, 5}) -> false

    public boolean HasEven(int[] numbers) {
//        throw new UnsupportedOperationException();
        if(numbers == null)
            return false;
        
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2 == 0)
                return true;
        }
        
        return false;
    }
    
}
