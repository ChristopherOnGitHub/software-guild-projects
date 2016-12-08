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
public class L8InRange {

//    Given a number n, return true if n is in the range 1..10, inclusive.Unless 
//    "outsideMode" is true, in which case return true if the number is less or 
//            equal to 1, or greater or equal to 10. 
//
//    inRange(
//
//    5, false) → true
//inRange(11, false) → false
//inRange(11, true) → true
    public boolean inRange(int n, boolean outsideMode) {

        boolean ranger;

        if (outsideMode) {
            if (n <= 1 || n >= 10) {
                ranger = true;
            } else {
                ranger = false;
            }
        }else{    
            if (n >= 1 && n <= 10) {
                ranger = true;
            } else {
                ranger = false;
            }

        }

        return ranger;
    }

}
