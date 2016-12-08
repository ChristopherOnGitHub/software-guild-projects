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
public class c21IxStart {
    
//    Return true if the given String begins with "*ix", the '*' 
//    can be anything, so "pix", "9ix" .. all count. 
//
//ixStart("mix snacks") -> true
//ixStart("pix snacks") -> true
//ixStart("piz snacks") -> false

public boolean ixStart(String str) {
    
    boolean ix = false;
    
    if(str.length()<=2){
        
    }
    else if(str.substring(1, 3).equals("ix")){
        ix = true;
    }
    
    return ix;

}
    
}
