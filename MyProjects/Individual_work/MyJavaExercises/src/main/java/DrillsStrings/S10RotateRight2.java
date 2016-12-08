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
public class S10RotateRight2 {
    
//    Given a String, return a "rotated right 2" version where the last 2 chars 
//            are moved to the start. The String length will be at least 2. 
//
//rotateRight2("Hello") -> "loHel"
//rotateRight2("java") -> "vaja"
//rotateRight2("Hi") -> "Hi"

public String rotateReft2(String str) {
    
    String x = str.substring(str.length()-2, str.length());
    
    String y = x+(str.substring(0, str.length()-2));
    
    return y;

}
    
}
