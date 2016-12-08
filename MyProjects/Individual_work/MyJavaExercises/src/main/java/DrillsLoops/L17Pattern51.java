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
public class L17Pattern51 {

//    Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value,
//            followed by the value plus 5, followed by the value minus 1.
//
//pattern51({1, 2, 7, 1}) -> true
//pattern51({1, 2, 8, 1}) -> false
//pattern51({2, 7, 1}) -> true

public boolean pattern51(int[] numbers) {
    
    boolean awesome = false;
    
    if(numbers.length<3){
        
    }else{
        for (int i = 0; i < numbers.length-2; i++) {
            if(numbers[i+1]==numbers[i]+5){
                if(numbers[i+2]==numbers[i]-1){
                    awesome = true;
                }
            }
        }
    }
    
    return awesome;

}
   
}