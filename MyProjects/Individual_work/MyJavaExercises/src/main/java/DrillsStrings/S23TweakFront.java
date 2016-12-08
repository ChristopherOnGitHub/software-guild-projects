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
public class S23TweakFront {
    
    
//Given a String, return a version without the first 2 chars. Except keep the
//        first char if it is 'a' and keep the second char if it is 'b'.
//        The String may be any length.
//
//tweakFront("Hello") -> "llo"
//tweakFront("away") -> "aay"
//tweakFront("abed") -> "abed"

public String tweakFront(String str) {

    if(str.substring(0, 1).equalsIgnoreCase("a")){

        if(!str.substring(1, 2).equalsIgnoreCase("b")){
            str = str.substring(0, 1) + str.substring(2,str.length());
        }
        
    }else{
        str = str.substring(1);
        
        if(str.substring(0, 1).equalsIgnoreCase("b")){
            
        }else{
            str = str.substring(1);
        }
    }
    
 
    
    return str;
    
}
    
}
