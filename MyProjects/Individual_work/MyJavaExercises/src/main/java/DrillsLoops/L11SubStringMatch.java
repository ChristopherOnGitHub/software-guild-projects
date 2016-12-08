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
public class L11SubStringMatch {
    
//    Given 2 Strings, a and b, return the number of the positions where they contain 
//    the same length 2 subString. So "xxcaazz" and "xxbaaz" yields 3, since the "xx",
//    "aa", and "az" subStrings appear in the same place in both Strings. 
//
//subStringMatch("xxcaazz", "xxbaaz") -> 3
//subStringMatch("abc", "abc") -> 2
//subStringMatch("abc", "axc") -> 0

public int subStringMatch(String a, String b) {
    
    int counter = 0;
    
    for (int i = 0; i < a.length()-1; i++) {
        String x = a.substring(i, i+2);
        
        for (int j = 0; j < b.length()-1; j++) {
            String y = b.substring(j, j+2);
            if(x.equals(y)){
                counter++;
            }
        }
    }
    
    return counter;
}
    
}
