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
public class S11TakeOne {
    
//    Given a String, return a String length 1 from its front, unless front is false,
//    in which case return a String length 1 from its back. The String will be non-empty. 
//
//takeOne("Hello", true) -> "H"
//takeOne("Hello", false) -> "o"
//takeOne("oh", true) -> "o"

public String takeOne(String str, boolean fromFront) {
    
    String x;
    
    if(fromFront){
        x = str.substring(0, 1);
    }else{
        x = str.substring(str.length()-1, str.length());
    }
    
    return x;

}
    
}
