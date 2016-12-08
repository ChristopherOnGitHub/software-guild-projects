/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsArrays;

/**
 *
 * @author apprentice
 */
public class Unlucky1 {

//We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
//Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array. 
//
//unlucky1({1, 3, 4, 5}) -> true
//unlucky1({2, 1, 3, 4, 5}) -> true
//unlucky1({1, 1, 1}) -> false
    public boolean unlucky1(int[] numbers) {

        boolean unlucky1 = false;
        int[] x = numbers;

        for (int i = 0; i < x.length; i++) {
            if ((i == 0) || (i == 1) || (i == x.length - 1) || (i == x.length - 2)) {

                if ((x[i] == 1) && (x[i + 1] == 3)) {
                    unlucky1 = true;
                }
            }
        }
        return unlucky1;
    }
}
