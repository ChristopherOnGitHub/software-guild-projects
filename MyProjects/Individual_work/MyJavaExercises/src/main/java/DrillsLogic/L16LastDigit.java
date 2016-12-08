/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogic;

/**
 *
 * @author apprentice
 */
public class L16LastDigit {
    
//    Given three ints, a b c, return true if two or more of them have the same 
//            rightmost digit. The ints are non-negative. 
//
//lastDigit(23, 19, 13) → true
//lastDigit(23, 19, 12) → false
//lastDigit(23, 19, 3) → true

public boolean lastDigit(int a, int b, int c){

    boolean sameLast = false;
    String aa = ""+a;
    String bb = ""+b;
    String cc = ""+c;
    
    if(aa.substring(aa.length()-1, aa.length()).equals(bb.substring(bb.length()-1, bb.length()))){
        sameLast = true;
    }
        
    if(aa.substring(aa.length()-1, aa.length()).equals(cc.substring(cc.length()-1, cc.length()))){
        sameLast = true;
    }
        
    if(cc.substring(cc.length()-1, cc.length()).equals(bb.substring(bb.length()-1, bb.length()))){
        sameLast = true;
    }
    
    return sameLast;
    
}
    
}
