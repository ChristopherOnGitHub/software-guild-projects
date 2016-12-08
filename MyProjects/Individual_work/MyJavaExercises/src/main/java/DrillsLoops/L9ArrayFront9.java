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
public class L9ArrayFront9 {
    
//    Given an array of ints, return true if one of the first 4 elements in the array
//            is a 9. The array length may be less than 4. 
//
//arrayFront9({1, 2, 9, 3, 4}) -> true
//arrayFront9({1, 2, 3, 4, 9}) -> false
//arrayFront9({1, 2, 3, 4, 5}) -> false

public boolean arrayFront9(int[] numbers) {
    
    boolean awesome = false;
    
    if(numbers.length<4){
        
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==9){
                awesome = true;
            }
        }
        
    }else if(numbers.length>4){
        
        for (int i = 0; i < 4; i++) {
            if(numbers[i]==9){
                awesome = true;
            }
        }
    }
    
    return awesome;

}
    
}
