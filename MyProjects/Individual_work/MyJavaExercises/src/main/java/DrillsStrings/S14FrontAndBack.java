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
public class S14FrontAndBack {
    
//    Given a String and an int n, return a String made of the first and last n 
//            chars from the String. The String length will be at least n. 
//
//frontAndBack("Hello", 2) -> "Helo"
//frontAndBack("Chocolate", 3) -> "Choate"
//frontAndBack("Chocolate", 1) -> "Ce"

public String frontAndBack(String str, int n) {
    
    String x = str.substring(0, n);
    String y = str.substring(str.length()-n, str.length());
    
    String z = x+y;
    
    return z;

}
    
}
