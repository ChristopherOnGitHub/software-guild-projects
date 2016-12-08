/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.drills;

/**
 *
 * @author apprentice
 */
public class Strings {

    public static void main(String[] args) {
        Strings stringsObj = new Strings();
        System.out.println(stringsObj.MinCat("Hello", "Hi"));
    }
    
//    Given two strings, append them together (known as "concatenation") and return the result. 
//    However, if the strings are different lengths, omit chars from the longer string 
//    so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". 
//    The strings may be any length. 
//
//    MinCat("Hello", "Hi") -> "loHi"
//    MinCat("Hello", "java") -> "ellojava"
//    MinCat("java", "Hello") -> "javaello"
    public String MinCat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        
        String result = "";
        if(aLength == bLength){
            result = a + b;
        } else if(aLength > bLength){
            result = a.substring(aLength - bLength) + b;
        } else { // bLength > aLength
            result = a + b.substring(bLength - aLength);
        }
        
        
        return result;
    }

}
