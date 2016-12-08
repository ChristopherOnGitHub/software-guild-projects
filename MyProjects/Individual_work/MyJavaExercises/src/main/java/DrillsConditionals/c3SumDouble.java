/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionals;

/**
 *
 * @author apprentice
 */
public class c3SumDouble {
    
//    Given two int values, return their sum. However, 
//if the two values are the same, then return double their sum. 
//
//sumDouble(1, 2) -> 3
//sumDouble(3, 2) -> 5
//sumDouble(2, 2) -> 8

public int sumDouble(int a, int b) {
    
    int sum = a+b;
    
    if(a==b){
        sum = sum*2;
    }
    
    return sum;
    
}
    
}
