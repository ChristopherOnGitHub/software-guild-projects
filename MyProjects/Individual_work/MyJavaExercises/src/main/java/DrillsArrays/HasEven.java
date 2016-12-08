//Given an int array , return true if it contains an even number (HINT: Use Mod (%)). 
//
//hasEven({2, 5}) -> true
//hasEven({4, 3}) -> true
//hasEven({7, 5}) -> false
//
//public boolean hasEven(int[] numbers) {
//
//}
package DrillsArrays;

public class HasEven {

    public boolean hasEven(int[] numbers) {

        boolean hasEven = false;

        int[] x = {3, 6, 9};

        int evenCounter = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                evenCounter++;
            }
        }
        if (evenCounter > 0) {
            hasEven = true;
        }
        return hasEven;
    }
}
