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
public class S05MultipleEndings {

//    Given a String, return a new String made of 3 copies of the last 2 chars of
//            the original String. The String length will be at least 2. 
//
//multipleEndings("Hello") -> "lololo"
//multipleEndings("ab") -> "ababab"
//multipleEndings("Hi") -> "HiHiHi"
    public String multipleEndings(String str) {

        String x = str.substring(str.length() - 2, str.length());

        String y = x + x + x;

        return y;
    }
}
