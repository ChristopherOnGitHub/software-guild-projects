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
public class L4DoubleX {

//    Given a String, return true if the first instance of "x" in the String is 
//            immediately followed by another "x". 
//
//doubleX("axxbb") -> true
//doubleX("axaxxax") -> false
//doubleX("xxxxx") -> true
    public boolean doubleX(String str) {

        boolean derp = false;

        if (str.contains("xx")) {
            if (str.indexOf("xx") == (str.indexOf("x"))) {
                derp = true;
            }
        }
    

    return derp ;

}
}
