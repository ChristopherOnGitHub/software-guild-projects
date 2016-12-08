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
public class c13BackAround {
    
//    Given a String, take the last char and return a new String with the last char 
//            added at the front and back, so "cat" yields "tcatt". The original String 
//                    will be length 1 or more. 
//
//backAround("cat") -> "tcatt"
//backAround("Hello") -> "oHelloo"
//backAround("a") -> "aaa"

public String backAround(String str) {
    
    String lastLetter = str.substring(str.length()-1, str.length());
    
    String bestString = lastLetter+str+lastLetter;
    
    return bestString;

}
    
}
