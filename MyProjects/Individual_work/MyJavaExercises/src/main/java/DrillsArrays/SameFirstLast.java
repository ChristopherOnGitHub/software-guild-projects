//Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal. 
//
//sameFirstLast({1, 2, 3}) -> false
//sameFirstLast({1, 2, 3, 1}) -> true
//sameFirstLast({1, 2, 1}) -> true
//
//public boolean sameFirstLast(int[] numbers) {

//}
package DrillsArrays;

/**
 *
 * @author apprentice
 */
public class SameFirstLast {
    public static boolean SameChecker(int[] x){
        
        int[] arrX = x;

        boolean booleanX = false;
        
        if((arrX.length>1) && (arrX[0] == arrX[arrX.length-1])){
            booleanX = true;
            
        }
        
        return booleanX;
    }
  
}
