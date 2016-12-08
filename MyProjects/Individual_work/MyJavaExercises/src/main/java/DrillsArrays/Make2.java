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
public class Make2 {

//    Given 2 int arrays, a and b, return a new array length 2 containing,
//as much as will fit, the elements from a followed by the elements from b. 
//The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays. 
//
//make2({4, 5}, {1, 2, 3}) -> {4, 5}
//make2({4}, {1, 2, 3}) -> {4, 1}
//make2({}, {1, 2}) -> {1, 2}
    public int[] make2(int[] a, int[] b) {
        int[] c = {};
        int[] first = a;
        int[] second = b;

        for (int i = 0; i < first.length; i++) {
            c[i] = first[i];
        }

        if (first.length < 2) {
            int x = 2 - first.length;
            for (int i = first.length; i < x; i++) {
                c[i] = second[i];
            }

        }

        return c;

    }
}