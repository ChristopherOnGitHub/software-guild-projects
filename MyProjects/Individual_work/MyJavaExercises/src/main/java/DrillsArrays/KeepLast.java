//Given an int array, return a new array with double the length where its last 
//element is the same as the original array, and all the other elements are 0. 
//The original array will be length 1 or more. Note: by default, a new int array 
//contains all 0's. 
//
//keepLast({4, 5, 6}) -> {0, 0, 0, 0, 0, 6}
//keepLast({1, 2}) -> {0, 0, 0, 2}
//keepLast({3}) -> {0, 3}
//
//public int[] keepLast(int[] numbers) {
//
//}
package DrillsArrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class KeepLast {
    public int[] KeepLast(int[] testA){
        
        int[] x = testA;        
        
        
        int[] asdf = new int[x.length*2];
        asdf[(x.length*2)-1] = x[x.length-1];
        
        return asdf;
    }


}
