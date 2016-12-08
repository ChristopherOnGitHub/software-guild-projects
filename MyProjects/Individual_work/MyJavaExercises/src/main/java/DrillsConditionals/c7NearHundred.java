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
public class c7NearHundred {
//    Given an int n, return true if it is within 10 of 100 or 200.
//Hint: Check out the Math class for absolute value
//
//nearHundred(103) -> true
//nearHundred(90) -> true
//nearHundred(89) -> false

    public boolean nearHundred(int n) {

        boolean nearHundred;

        if (n >= 90 || n <= 110) {
            nearHundred = true;
        } else if (n >= 190 || n <= 210) {
            nearHundred = true;
        } else {
            nearHundred = false;
        }

        return nearHundred;

    }

}
