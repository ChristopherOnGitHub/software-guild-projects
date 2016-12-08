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
public class c26EndUp {
    
//    Given a String, return a new String where the last 3 chars are now in upper case.
//    If the String has less than 3 chars, uppercase whatever is there. 
//
//endUp("Hello") -> "HeLLO"
//endUp("hi there") -> "hi thERE"
//endUp("hi") -> "HI"

public String endUp(String str) {
    
    String newStr;
    
    if(str.length()>3){
        str = str.substring(0, str.length()-3)+str.substring(str.length()-3, str.length()).toUpperCase();
        newStr = str;
        
    }else if(str.length()<=3){
        newStr = str.toUpperCase();
        
    }else{
        newStr = "ERRORRRR!!!";
    }
    
    return newStr;

}
    
}
