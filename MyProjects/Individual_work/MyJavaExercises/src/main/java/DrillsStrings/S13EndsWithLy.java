/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStrings;

/**
 *
 * @author apprentice
 */
public class S13EndsWithLy {
    
//    Given a String, return true if it ends in "ly". 
//
//endsWithLy("oddly") -> true
//endsWithLy("y") -> false
//endsWithLy("oddy") -> false

public boolean endsWithLy(String str) { 

    boolean endsWithLy = false;
    
    if(str.substring(str.length()-2, str.length()).equalsIgnoreCase("ly")){
       endsWithLy = true;
    }
    
    return endsWithLy;
    
}
    
}
