/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStrings;

import java.util.Arrays;

/**
 *
 * @author apprentice
 */
public class S20SwapLast {
    
//    Given a String of any length, return a new String where the last 2 chars, 
//            if present, are swapped, so "coding" yields "codign". 
//
//swapLast("coding") -> "codign"
//swapLast("cat") -> "cta"
//swapLast("ab") -> "ba"

public String swapLast(String str) {
    
    char[] x = str.toCharArray();
    
    char save = x[x.length-1];
    x[x.length-1] = x[x.length-2];
    x[x.length-2] = save;
    
    String cool = Arrays.toString(x);
    
    cool = cool.replaceAll(",", "");
    cool = cool.replaceAll(" ", "");
    cool = cool.replaceAll("]", "");
    cool = cool.replaceAll("[", "");

    return cool;
}
    
}
