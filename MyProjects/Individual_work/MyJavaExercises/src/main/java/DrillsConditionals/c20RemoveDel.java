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
public class c20RemoveDel {

//    Given a String, if the String "del" appears starting at index 1, return a 
//    String where that "del" has been deleted. Otherwise, return the String unchanged. 
//
//removeDel("adelbc") -> "abc"
//removeDel("adelHello") -> "aHello"
//removeDel("adedbc") -> "adedbc"
    public String removeDel(String str) {

        if (str.length() >= 4) {
            if (str.substring(1, 4).equals("del")) {
                str = str.replace("del", "");
            }
        }
        
        return str;

    }

}
