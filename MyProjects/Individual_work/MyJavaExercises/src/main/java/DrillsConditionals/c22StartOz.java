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
public class c22StartOz {
    
//    Given a String, return a String made of the first 2 chars (if present), 
//            however include first char only if it is 'o' and include the second only if it is 'z', 
//            so "ozymandias" yields "oz". 
//
//startOz("ozymandias") -> "oz"
//startOz("bzoo") -> "z"
//startOz("oxx") -> "o"

public String startOz(String str) {
    
    String a = "";
    String b = "";
    
    if(str.substring(0, 1).equals("o")){
        a = "o";
    }
    if(str.substring(1, 2).equals("z")){
        b = "z";
    }
    
    String yeaBuddy = a+b;
    
    return yeaBuddy;

}
    
}
