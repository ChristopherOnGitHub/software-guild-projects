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
public class S12MiddleTwo {
    
//    Given a String of even length, return a String made of the middle two chars,
//    so the String "String" yields "ri". The String length will be at least 2. 
//
//middleTwo("String") -> "ri"
//middleTwo("code") -> "od"
//middleTwo("Practice") -> "ct"

public String middleTwo(String str ) {
    
    String x = str.substring((str.length()/2)-1, (str.length()/2)+1);
    
    return x;

}
    
}
