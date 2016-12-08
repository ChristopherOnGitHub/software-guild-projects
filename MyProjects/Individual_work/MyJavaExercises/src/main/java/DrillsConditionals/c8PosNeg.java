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
public class c8PosNeg {

//    Given two int values, return true if one is negative and one is positive.
//    Except if the parameter "negative" is true, then return true only if both are negative.
//
//posNeg(1, -1, false) -> true
//posNeg(-1, 1, false) -> true
//posNeg(-4, -5, true) -> true

public boolean posNeg(int a, int b, boolean negative) {

    boolean posNeg;
    
    if(a<0 || b<0){
        posNeg = true;
    }else if((a<0&&b<0) && negative){
        posNeg = true;
    }else{
        posNeg = false;
    }
    
    return posNeg;
    
    }

}
