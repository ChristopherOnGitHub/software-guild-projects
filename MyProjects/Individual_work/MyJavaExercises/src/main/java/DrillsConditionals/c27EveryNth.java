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
public class c27EveryNth {
    
//    Given a non-empty String and an int N, return the String made starting with char 0, 
//    and then every Nth char of the String. So if N is 3, use char 0, 3, 6, 
//    ... and so on. N is 1 or more. 
//
//everyNth("Miracle", 2) -> "Mrce"
//everyNth("abcdefg", 2) -> "aceg"
//everyNth("abcdefg", 3) -> "adg"

public String everyNth(String str, int n) {

    String newStr = "";
    
    for (int i = 0; i < str.length(); i++) {
        if(i%n == 0){
            newStr = newStr+str.substring(i, i+1);
        }
    }
    
    return newStr;
    
}
    
}
