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
public class L10Mod20 {
    
//    Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
//    See also: Introduction to Mod 
//
//mod20(20) → false
//mod20(21) → true
//mod20(22) → true

public boolean mod20(int n) {
    
    boolean isSpecialSnowflake;
    
    switch (n%20) {
        case 1:
            isSpecialSnowflake = true;
            break;
        case 2:
            isSpecialSnowflake = true;
            break;
        default:
            isSpecialSnowflake = false;
            break;
    }
    
    return isSpecialSnowflake;
}
    
}
