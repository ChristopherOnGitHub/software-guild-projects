//Return an int array length n containing the first n digits of pi.
//
//makePi(3) -> {3, 1, 4}
//
//public int[] makePi(int n) {
//
//}
package DrillsArrays;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class MakePi {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int x = userInput.nextInt();
        
        makePi(x);
        
    }

    private static void makePi(int x) {
        double p = Math.PI;
        
        char[] chars = ("" + p).toCharArray();
        
        for (int i = 0; i < x+1; i++) {
            System.out.print(chars[i]);
        }
        
    }
    
    
}
