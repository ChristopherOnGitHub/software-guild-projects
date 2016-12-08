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
public class S24StripX {
    
//    Given a String, if the first or last chars are 'x', return the String without
//            those 'x' chars, and otherwise return the String unchanged. 
//
//stripX("xHix") -> "Hi"
//stripX("xHi") -> "Hi"
//stripX("Hxix") -> "Hxi"

public String stripX(String str) {
    
    if(str.substring(0, 1).equalsIgnoreCase("x")){
        str = str.substring(1);
    }
    
    if(str.substring(str.length()-1, str.length()).equalsIgnoreCase("x")){
        str = str.substring(0, str.length()-1);
    }
    
    return str;

}
    
}
