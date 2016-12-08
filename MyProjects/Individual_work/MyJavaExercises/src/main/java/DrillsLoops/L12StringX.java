/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLoops;

/**
 *
 * @author apprentice
 */
public class L12StringX {
    
//    Given a String, return a version where all the "x" have been removed. 
//            Except an "x" at the very start or end should not be removed. 
//
//stringX("xxHxix") -> "xHix"
//stringX("abxxxcd") -> "abcd"
//stringX("xabxxxcdx") -> "xabcdx"

public String stringX(String str) {

    String a = str.substring(0, 1);
    String b = str.substring(1, str.length()-1);
    String c = str.substring(str.length()-1, str.length());
    
    b = b.replace("x", "");
    
    String amazing = a+b+c;
    
    return amazing;
    
}
    
}
