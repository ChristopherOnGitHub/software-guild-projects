package PBDMethods;

public class FillInFunctions {

    public static void main(String[] args) {
        // Fill in the function calls where appropriate.

        System.out.println("Watch as we demonstrate functions.");

        System.out.println();
        System.out.println("I'm going to get a random character from A-Z");
        char charval = (char) (Math.random() * 26);
        char randchar = (char) (Math.random() * 26);
        randchar();
        System.out.println("The character is: " + randchar);

        System.out.println();
        System.out.println("Now let's count from -10 to 10");
        int start, stop;
        start = -10;
        stop = 10;
        counter();
        System.out.println("How was that?");

        System.out.println();
        System.out.println("Now we take the absolute value of a number.");
        int x = -10, y = -10;
        System.out.println("|" + x + "| = " + abso(y));

        System.out.println();
        System.out.println("That's all.  This program has been brought to you by:");
        credits();
    }

    public static void credits() // No parameters.
    {
        // displays some boilerplate text saying who wrote this program, etc.

        System.out.println();
        System.out.println("programmed by Graham Mitchell");
        System.out.println("modified by Christopher Floyd");
        System.out.print("This code is distributed under the terms of the standard ");
        System.out.println("BSD license.  Do with it as you wish.");

    }

    public static char randchar() // No parameters.
    {
        // chooses a random character in the range "A" to "Z"

        int numval;
        char charval;

        // pick a random number from 0 to 25
        numval = (char) (Math.random() * 26);
        // now add that offset to the value of the letter 'A'
        charval = (char) ('A' + numval);

        return charval;
    }

    public static int counter() {
        int start = -10;
        int stop = 10;
        int begin;

        // counts from start to stop by ones
        int ctr;

        ctr = start;
        while (ctr <= stop) {
            System.out.print(ctr + " ");
            ctr = ctr + 1;
        }

        return ctr;
    }

    public static int abso(int y){
        // finds the absolute value of the parameter
        int absval;

        if (y < 0) {
            absval = -y;
        } else {
            absval = y;
        }

        return y;
    }

}
