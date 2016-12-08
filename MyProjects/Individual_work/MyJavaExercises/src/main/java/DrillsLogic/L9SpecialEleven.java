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
public class L9SpecialEleven {
    
//    We'll say a number is special if it is a multiple of 11 or if it is one more 
//    than a multiple of 11. Return true if the given non-negative number is special. 
//    Use the % "mod" operator
//
//specialEleven(22) → true
//specialEleven(23) → true
//specialEleven(24) → false

public boolean specialEleven(int n) {

    boolean special;
    
    if((n%11 == 0) && n>0){
        special = true;
    }else if((n%11 == 1) && n>0){
        special = true;
    }else{
        special = false;
    }
    
    return special;
}
    
}
