/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogic;

/**
 *
 * @author apprentice
 */
public class L14AreInOrder {
//    Given three ints, a b c, return true if b is greater than a, and c is greater
//            than b. However, with the exception that if "bOk" is true, b does not need to be greater 
//                    than a. 
//
//areInOrder(1, 2, 4, false) → true
//areInOrder(1, 2, 1, false) → false
//areInOrder(1, 1, 2, true) → true

    public boolean areInOrder(int a, int b, int c, boolean bOk) {

        boolean awesome = false;

        if (c > b && b > a) {
            awesome = true;
        }

        if (bOk) {
            if (c > a && c > b) {
                awesome = true;
            }
        }

        return awesome;

    }
}
