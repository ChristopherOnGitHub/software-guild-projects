//Given an array of ints length 3, return a new array with the elements in 
//reverse order, so for example {1, 2, 3} becomes {3, 2, 1}. 
//
//public int[] reverse(int[] numbers) {
//
//}
package DrillsArrays;

/**
 *
 * @author apprentice
 */
public class Reverse {

    public int[] Reverse(int[] x){
            
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }

        int[]y = {0};
        y[0]=x[0];
        x[0]=x[x.length-1];
        x[x.length-1]=y[0];
        
        return x;
        
    }
    
}
