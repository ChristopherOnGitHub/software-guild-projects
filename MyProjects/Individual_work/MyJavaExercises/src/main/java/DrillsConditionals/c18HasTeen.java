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
public class c18HasTeen {
//    
//    We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
//            Given 3 int values, return true if 1 or more of them are teen. 
//
//hasTeen(13, 20, 10) -> true
//hasTeen(20, 19, 10) -> true
//hasTeen(20, 10, 12) -> false

public boolean hasTeen(int a, int b, int c) {
    
    boolean hasTeen = false;
    
    if((a<=19 && a>=13) || (b<=19 && b>=13) || (c<=19 && c>=13)){
        hasTeen = true;
    }
    
    return hasTeen;

}
    
}
