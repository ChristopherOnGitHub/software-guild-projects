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
public class S15TakeTwoFromPosition {
    
//    Given a String and an index, return a String length 2 starting at the given index.
//            If the index is too big or too small to define a String length 2, use the first 2 chars.
//                    The String length will be at least 2. 
//
//takeTwoFromPosition("java", 0) -> "ja"
//takeTwoFromPosition("java", 2) -> "va"
//takeTwoFromPosition("java", 3) -> "ja"

public String takeTwoFromPosition(String str, int n) {
    
    String x;
    
    if(str.length()<=n || str.length()-1==n){
        x = str.substring(0, 2);
    }else{
        x = str.substring(n, n+2);
    }
    
    return x;

}
    
}
