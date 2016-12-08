//
//Given an int array, return true if the array contains 2 twice, or 3 twice. 
//
//double23({2, 2, 3}) -> true
//double23({3, 4, 5, 3}) -> true
//double23({2, 3, 2, 2}) -> false
//
//public boolean double23(int[] numbers) {
//
//}
package DrillsArrays;

/**
 *
 * @author apprentice
 */
public class Double23 {
    
    int num2 = 0;
    int num3 = 0;
    boolean isTwice = false;
    
    public boolean double23(int[] x){
        for (int i = 0; i < x.length; i++) {
            if(x[i]==2){
                num2++;
            }
            if(x[i]==3){
                num3++;
            }
        }
        
        if(num2==2 || num3==2){
            isTwice = true;
        }
        
        return isTwice;
    }
    
}
