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
public class L13AltPairs {

//    Given a String, return a String made of the chars at indexes 
//            0,1, 4,5, 8,9 ... so "kittens" yields "kien". 
//
//altPairs("kitten") -> "kien"
//altPairs("Chocolate") -> "Chole"
//altPairs("CodingHorror") -> "Congrr"
    public String altPairs(String str) {
        
        String x = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == 1 || i == 4 || i == 5 || i == 8 || i == 9) {

                x = x+(str.charAt(i));
                
            }

        }
        
        return x;

    }

}
