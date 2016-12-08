//Given an array of ints, figure out which is larger between the first and last
//elements in the array, and set all the other elements to be that value. Return the changed array. 
//
//higherWins({1, 2, 3}) -> {3, 3, 3}
//higherWins({11, 5, 9}) -> {11, 11, 11}
//higherWins({2, 11, 3}) -> {3, 3, 3}
//
//public int[] higherWins(int[] numbers) {
//
//}
package DrillsArrays;

/**
 *
 * @author apprentice
 */
public class HighWins {

    public static int[] HighWins(int[] arrX) {

        int[] x = arrX;

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

        int a;
        int b;

        a = x[0];
        b = x[x.length - 1];

        if (a > b) {
            for (int i = 0; i < x.length; i++) {
                x[i] = a;
            }
        } else if (b > a) {
            for (int i = 0; i < x.length; i++) {
                x[i] = b;
            }

        }
        return x;

    }
}
