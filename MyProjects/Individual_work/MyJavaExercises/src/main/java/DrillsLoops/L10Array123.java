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
public class L10Array123 {
    
//    Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere. 
//
//array123({1, 1, 2, 3, 1}) -> true
//array123({1, 1, 2, 4, 1}) -> false
//array123({1, 1, 2, 1, 2, 3}) -> true

public boolean array123(int[] numbers) {
    
    boolean hasIt = false;

    for (int i = 0; i < numbers.length-1; i++) {
        if(numbers[i]==1){
            if(numbers[i+1]==2){
                if(numbers[i+2]==3){
                    hasIt = true;
                }
            }
        }
    }
    
    return hasIt;
    
}
    
}
