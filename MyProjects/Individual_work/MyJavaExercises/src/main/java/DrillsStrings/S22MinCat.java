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
public class S22MinCat {

//    Given two Strings, append them together (known as "concatenation") and return
//            the result. However, if the Strings are different lengths, 
//            omit chars from the longer String so it is the same length as the shorter 
//            String. So "Hello" and "Hi" yield "loHi". The Strings may be any length. 
//
//minCat("Hello", "Hi") -> "loHi"
//minCat("Hello", "java") -> "ellojava"
//minCat("java", "Hello") -> "javaello"
    public String minCat(String a, String b) {

        String x;

        if (a.length() > b.length()) {
            a = a.substring(a.length() - b.length(), a.length());

            x = a + b;
        } else if (b.length() > a.length()) {
            b = b.substring(b.length() - a.length(), b.length());

            x = a + b;
        } else {

            x = a + b;

        }

        return x;

    }
}
