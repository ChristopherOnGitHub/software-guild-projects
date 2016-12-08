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
public class c11FrontBack {

//    Given a String, return a new String where the first and last chars have been exchanged. 
//
//frontBack("code") -> "eodc"
//frontBack("a") -> "a"
//frontBack("ab") -> "ba"
    public String frontBack(String str) {

        String newStr = "";

        char[] x = str.toCharArray();
        char derp = x[0];
        char temp = x[str.length() - 1];
        x[str.length() - 1] = x[0];
        x[0] = temp;

        for (int i = 0; i < x.length - 1; i++) {
            newStr = newStr + x[i];
        }

        newStr = newStr + derp;

        return newStr;

    }

}
