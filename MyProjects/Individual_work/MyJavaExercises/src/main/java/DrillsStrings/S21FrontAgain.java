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
public class S21FrontAgain {
    
//    Given a String, return true if the first 2 chars in the String also appear 
//            at the end of the String, such as with "edited". 
//
//frontAgain("edited") -> true
//frontAgain("edit") -> false
//frontAgain("ed") -> true

public boolean frontAgain(String str) {
    
    boolean x = false;
    
    String a = str.substring(0, 2);
    
    String b = str.substring(str.length()-2, str.length());
    
    if(a.equals(b)){
        x = true;
    }
    
    return x;

}
  
}
