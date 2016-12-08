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
public class c6Makes10 {
    
//    Given two ints, a and b, return true if one if them is 10 or if their sum is 10. 
//
//makes10(9, 10) -> true
//makes10(9, 9) -> false
//makes10(1, 9) -> true

public boolean makes10(int a, int b) {
    
    boolean makes10;
    
    if(a == 10 || b ==10){
        makes10=true;
    }else if(a+b == 10){
        makes10=true;
    }else{
        makes10=false;
    }

    return makes10;
    
}
    
}