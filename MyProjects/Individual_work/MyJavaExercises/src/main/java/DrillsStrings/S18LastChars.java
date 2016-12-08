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
public class S18LastChars {
    
//    Given 2 Strings, a and b, return a new String made of the first char of a 
//    and the last char of b, so "yo" and "java" yields "ya". If either String is
//            length 0, use '@' for its missing char. 
//
//lastChars("last", "chars") -> "ls"
//lastChars("yo", "mama") -> "ya"
//lastChars("hi", "") -> "h@"

public String lastChars(String a, String b) {
    
    if(a.length()==0){
        a = "@";
    }
    if(b.length()==0){
        b = "@";
    }
    
    String awesome = a.substring(0, 1)+b.substring(b.length()-1, b.length());
    
    return awesome;

}
    
}
