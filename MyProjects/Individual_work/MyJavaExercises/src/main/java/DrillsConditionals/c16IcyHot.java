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
public class c16IcyHot {

//    Given two temperatures, return true if one is less than 0 and the other is greater than 100. 
//
//icyHot(120, -1) -> true
//icyHot(-1, 120) -> true
//icyHot(2, 120) -> false
    public boolean icyHot(int temp1, int temp2) {

        boolean x = false;

        if (temp1 > 0 && temp2 > 0) {

        } else if (temp1 < 0 && temp2 < 0) {

        } else if ((temp1 < 0 || temp1 > 100) && (temp2 < 0 || temp2 > 100)) {
            x = true;
        } else {

        }

        return x;

    }

}
