/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionals;

/**
 *
 * @author apprentice
 */
public class c15StartHi {
    
//    Given a String, return true if the String starts with "hi" and false otherwise. 
//
//startHi("hi there") -> true
//startHi("hi") -> true
//startHi("high up") -> false

public boolean startHi(String str) {
    
    boolean soNice = false;
    
    if(str.substring(0, 3).equals("hi ")){
        soNice = true;
    }
    
    return soNice;

}
    
}
