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
public class L16NoTriples {

//    Given an array of ints, we'll say that a triple is a value appearing 3 times
//    in a row in the array. Return true if the array does not contain any triples. 
//
//noTriples({1, 1, 2, 2, 1}) -> true
//noTriples({1, 1, 2, 2, 2, 1}) -> false
//noTriples({1, 1, 1, 2, 2, 2, 1}) -> false
    public boolean noTriples(int[] numbers) {

        boolean noTriples = true;

        if (numbers.length <= 3) {

        } else {
            for (int i = 0; i < numbers.length - 2; i++) {
                if (numbers[i] == numbers[i + 1] && numbers[i + 1] == numbers[i + 2]) {
                    noTriples = false;
                }
            }
        }

        return noTriples;

    }

}
