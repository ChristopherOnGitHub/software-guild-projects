//Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more. 
//
//firstLast6({1, 2, 6}) -> true
//firstLast6({6, 1, 2, 3}) -> true
//firstLast6({13, 6, 1, 2, 3}) -> false
//
//public boolean firstLast6(int[] numbers) {
//
//}
package DrillsArrays;

/**
 *
 * @author apprentice
 */
public class FirstLast6 {
    public boolean FirstLast6(int[] x) {
        int[] arrX = x;
     
        boolean isSix = false;
        
        if((arrX[0]==6)||(arrX[arrX.length-1]==6)){
            isSix=true;
        }
        
        return isSix;
    }
    
}


