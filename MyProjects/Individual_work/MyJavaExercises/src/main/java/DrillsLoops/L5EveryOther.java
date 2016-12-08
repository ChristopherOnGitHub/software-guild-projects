/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLoops;

import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public class L5EveryOther {
    
//    Given a String, return a new String made of every other char starting with 
//            the first, so "Hello" yields "Hlo". 
//
//everyOther("Hello") -> "Hlo"
//everyOther("Hi") -> "H"
//everyOther("Heeololeo") -> "Hello"

public String everyOther(String str) {
    
    char[] x = str.toCharArray();
    ArrayList y = new ArrayList();
    String newString = "";
    
    for (int i = 0; i < x.length; i++) {
        if(i%2==0){
            y.add(x[i]);
        }
    }
    
    for(Object letter : y){
        newString = newString+letter;
    }
    
    return newString;

}
    
}
