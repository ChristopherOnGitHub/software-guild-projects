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
public class L11Mod35 {
    
//    Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator
//
//mod35(3) → true
//mod35(10) → true
//mod35(15) → false

public boolean mod35(int n) {
    
    boolean awesome = false;
    
    if(n%3 == 0 && n%5 == 0){
        
    }else if(n%3 == 0){
        awesome = true;
    }else if(n%5 == 0){
        awesome = true;
    }else{
        awesome = false;
    }
    
    return awesome;
  
}
    
}
