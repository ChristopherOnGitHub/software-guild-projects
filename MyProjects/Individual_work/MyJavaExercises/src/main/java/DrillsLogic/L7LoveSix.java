/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogic;

/**
 *
 * @author apprentice
 */
public class L7LoveSix {
    
//    The number 6 is a truly great number. Given two int values, a and b, 
//    return true if either one is 6. Or if their sum or difference is 6.
//
//loveSix(6, 4) → true
//loveSix(4, 5) → false
//loveSix(1, 5) → true

public boolean loveSix(int a, int b) {
    
    boolean awesome6 = false;
  
    if(a==6 || b==6){
        awesome6 = true;
    }else if(a-b==6 || b-a==6){
        awesome6 = true;
    }else if(a+b==6){
        awesome6 = true;
    }
    
    return awesome6;
    
}
    
}
