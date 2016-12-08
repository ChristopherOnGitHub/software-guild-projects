/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drillz.arrays;

/**
 *
 * @author ahill
 */
public class FirstLastSix {
    //    Given an array of ints, return true if 6 appears as either the first or last 
//    element in the array. The array will be length 1 or more. 
//
//    FirstLast6({1, 2, 6}) -> true
//    FirstLast6({6, 1, 2, 3}) -> true
//    FirstLast6({13, 6, 1, 2, 3}) -> false
        public boolean firstLast6(int[] numbers) {
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
    
}