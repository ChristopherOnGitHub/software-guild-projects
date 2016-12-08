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
public class c4Diff21 {
    
//    Given an int n, return the absolute value of the difference between n and 21, 
    //except return double the absolute value of the difference if n is over 21. 
//
//diff21(23) -> 4
//diff21(10) -> 11
//diff21(21) -> 0

public int diff21(int n) {
    
    int difference = 21 - n;
    if(difference<0){
        difference = difference * -2;
    }
    
    return difference;
  
}
    
}