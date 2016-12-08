//Given an array of ints, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}. 
//
//rotateLeft({1, 2, 3}) -> {2, 3, 1}
//rotateLeft({5, 11, 9}) -> {11, 9, 5}
//rotateLeft({7, 0, 0}) -> {0, 0, 7}
//
//public int[] rotateLeft(int[] numbers) {
//
//}
package DrillsArrays;

/**
 *
 * @author apprentice
 */
public class RotateLeft {

    public static int[] Rotater(int[] xz) {

        int[] x = xz;

        
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
        
        int[] y = {2};
        y[0] = x[0];
        for (int i = 1; i < x.length; i++) {
            x[i-1]=x[i];
        }
        x[x.length-1] = y[0];
        
        return x;
    }

}
