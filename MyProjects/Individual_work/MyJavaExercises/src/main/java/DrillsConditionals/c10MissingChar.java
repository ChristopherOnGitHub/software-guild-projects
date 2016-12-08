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
public class c10MissingChar {
    
//    Given a non-empty String and an int n, return a new String where the char
//            at index n has been removed. The value of n will be a valid index of a
//                    char in the original String (Don't check for bad index). 
//
//missingChar("kitten", 1) -> "ktten"
//missingChar("kitten", 0) -> "itten"
//missingChar("kitten", 4) -> "kittn"

public String missingChar(String str, int n) {
    
    char x = str.charAt(n);
    String y1 = null;
    String y2 = null;
    
    
    if(n==0){
        y1 = "";
        y2 = str.substring(1);
    }
    else if(n != 0 || n>0){
        y1 = str.substring(0, n);
        y2 = str.substring(n+1, str.length());
    }else{
        System.out.println("ERROR!");
        y1 = "";
        y2 = "";
    }
    
    String fosho = ""+y1+y2;
    
    return fosho; 
}
    
}