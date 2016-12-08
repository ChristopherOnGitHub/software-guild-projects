//Given 2 arrays of ints, a and b, return true if they have the
//same first element or they have the same last element. Both arrays will be length 1 or more. 
//
//commonEnd({1, 2, 3}, {7, 3}) -> true
//commonEnd({1, 2, 3}, {7, 3, 2}) -> false
//commonEnd({1, 2, 3}, {1, 3}) -> true
//
//public boolean commonEnd(int[] a, int[] b) {
//  
//}
package DrillsArrays;

/**
 *
 * @author apprentice
 */
public class CommonEnd {

    public boolean commonEnd(int[] z, int[] y){

    
        boolean x = false;
        if((z[0]==y[0]) || (z[z.length-1]==y[y.length-1])){
            x=true;
        }
        return x;
    }

}
