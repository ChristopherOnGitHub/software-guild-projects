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
public class S17AtFirst {
    
//    Given a String, return a String length 2 made of its first 2 chars. 
//            If the String length is less than 2, use '@' for the missing chars. 
//
//atFirst("hello") -> "he"
//atFirst("hi") -> "hi"
//atFirst("h") -> "h@"

public String atFirst(String str) {
    
    String x;

    if(str.length()==0){
        x="@@";
    }else if(str.length()==1){
        x = str+"@";
    }else{
        x = str.substring(0, 2);
    }
    
    return x;
    
}
    
}
