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
public class S06FirstHalf {
    
//    Given a String of even length, return the first half. So the String "WooHoo" yields "Woo". 
//
//firstHalf("WooHoo") -> "Woo"
//firstHalf("HelloThere") -> "Hello"
//firstHalf("abcdef") -> "abc"

public String firstHalf(String str) {
    
    String y = str;
    
    if(str.length()%2==0){
        y = str.substring(0, (str.length()/2));
    }

    return y;
    
}
    
}
