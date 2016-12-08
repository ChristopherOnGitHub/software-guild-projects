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
public class S19ConCat {
    
//    Given two Strings, append them together (known as "concatenation") and 
//            return the result. However, if the concatenation creates a double-char, 
//                    then omit one of the chars, so "abc" and "cat" yields "abcat". 
//
//conCat("abc", "cat") -> "abcat"
//conCat("dog", "cat") -> "dogcat"
//conCat("abc", "") -> "abc"

public String conCat(String a, String b) {
    
    String x;

    if(a.substring(a.length()-1, a.length()).equals(b.substring(0, 1))){
        b = b.substring(1, b.length());
    }
    
    x = a+b;
    
    return x;
    
}
    
}
