/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.arrays;

import java.util.Arrays;

/**
 *
 * @author ahill
 */
public class ArrayDemos {

    public static void main(String[] args) {

        // arrays are an object, but are also built on other
        // objects to instantiate themselves. You can have arrays
        // of any sort of objects, but every array can only contain
        // objects of the type it has been instantiated for.
        int[] llamaAges; // arrays can be declared like any other variables
        // But to use a variable, you have to allocate space for the "group"
        // arrays are FIXED size - once they space is allocated, it doesn't change
        // it only have space for that many items.
        llamaAges = new int[10]; // This sets up an int array of size 10
        llamaAges[0] = 2; // to access an element spot I just use the arrayName[index]
        llamaAges[1] = 8; // I can assign things to every spot in the array
        llamaAges[2] = 3; // They start at 0, and go to the length - 1
        llamaAges[3] = 12;
        llamaAges[4] = 16;
        llamaAges[5] = 11;
        llamaAges[6] = 4;
        llamaAges[7] = 4;
        llamaAges[8] = 5;
        llamaAges[9] = 13;
//        llamaAges[10] = 15; // This will cause a runtime exception because my size is 10, so max index is 9

        System.out.println("How many llama ages am I tracking? ");
        System.out.println(llamaAges.length); // You can find the size of an array using arrayName.length

        // If I wanted to sum all the items in an array I could it do it by hand like so...
        int agesSum = llamaAges[0] + llamaAges[1] + llamaAges[2]
                + llamaAges[3] + llamaAges[4] + llamaAges[5]
                + llamaAges[6] + llamaAges[7] + llamaAges[8]
                + llamaAges[9];

        // But that's really boring, and also not particularly versitile.
        // If my array size changed, I'd have to rewrite that code to reflect that.
        System.out.println("The sum of all the llama ages is: " + agesSum);

        // However, if I LOOPED over that array, I can just start at the first index
        // and go until the very end.
        int agesSumAgain = 0;
        for (int i = 0; i < llamaAges.length; i++) { // notice my start is 0, and my end is when i => llamasAges.length
            agesSumAgain = agesSumAgain + llamaAges[i];
        }

        System.out.println("Checking the math on my for loop, ages sum to: " + agesSumAgain);

        // I can also initialize the size AND elements of an array all at once
        // as long as I know what and where I want to store each element at init time.
        String[] llamaNames = {
            "Boo", "Prism", "Spectra", "Secret",
            "Floyd", "Samurai", "NoWhite", "Dixie",
            "BeeBop", "Penny"
        };

        // I can also use what is known as an ENHANCED for loop to iterate over the array
        // enhanced forloops look like the below (might also have heard of forEach loops?)
        // where a temp var is on the left, to store an element, and the group is on the right
        for (String name : llamaNames) {
            System.out.println("Llama : " + name);
        }

        // Effectively (except w/o access to i):
        for (int i = 0; i < llamaNames.length; i++) {
            String name = llamaNames[i];
            System.out.println("Llama : " + name);
        }

        // Remember, scope of variables declared within a loop does not extend to OUTSIDE that loop
//        System.out.println(name);
        // I can ALSO have multi dimensional arrays. This is effectively an "array of <type> arrays"
        // or if I had more than 2 dimensions, an array of array of array of ... whatever type
        // Here I have an array of string arrays. Each individual String[] represents a mini llama herd
        // where as the array of strings arrays represents the WHOLE herd (comprised of the several mini herds!)
        String[][] llamaHerd = {
            {"Boo", "Floyd"},
            {"Felicity", "Angelina", "Penny", "Dixie", "NoWhite", "BeeBop"},
            {"Spectra", "Secret", "Francis"}
        };

        // Accessing the length of the llamaHerd variable will provide the size of it's first dimension
        // aka how many mini herds there are.
        System.out.println("Number of subherds: " + llamaHerd.length);

        // Accessing an element of that llamaHerd variable will return an array of Strings
        // or a mini herd of llama, and asking for the length of THAT will tell you how many llamas are
        // in that particular mini herd.
        System.out.println("\nThere are this many llamas in the first herd: " + llamaHerd[0].length);

        // To access a particular element inside a multi dimensional array you have to provide all the indices
        // Here I want the first llama in the first herd, so I do llamaHerd[0][0]
        System.out.println("First llama in first herd: " + llamaHerd[0][0]);
        // To access the second llama in the first herd, you do llamaHerd[0] <- the herd
        // Then add a [1] the llama in that herd. Together: llamaHerd[0][1]
        System.out.println("Second llama in first herd: " + llamaHerd[0][1]);
        System.out.println("Third llama in second herd: " + llamaHerd[1][2]);

        // I can iterate over ALL elements in an array by using set of nested for loops
        for (int i = 0; i < llamaHerd.length; i++) {
            String[] subHerd = llamaHerd[i]; // I can store a temp variable and pull out the subHerd
            for (int j = 0; j < subHerd.length; j++) { // And then iterate over it like a normal array iteration
                System.out.print("llamaHerd[" + i + "]");
                System.out.print("[" + j + "]: ");
                System.out.print(subHerd[j]+"\n");
            }
            System.out.println("");
        }

        // Or I can iterate directly
        for (int i = 0; i < llamaHerd.length; i++) {
            System.out.print("Herd#" + i + ": ");
            for (int j = 0; j < llamaHerd[i].length; j++) {
                System.out.print(llamaHerd[i][j]+" , ");
            }
            System.out.println("");
        }
        
        // I can also use an enhanced for loop - but I lose the indices
        System.out.println("\nAll the llamas: ");
        for (String[] subHerd : llamaHerd) {
            for (String llama : subHerd) {
                System.out.print(llama + ", ");
            }
        }

        // If I want to copy the values out of an array, there are a few ways to do it.
        // First I can make a new copy, and then copy everything into it by hand ...
        
        
        // Example: a whole subherd went AWOL, plus one
        // So I declare/init a new array with a size of the rogue subherd + 1
        String[] rogueHerd = new String[llamaHerd[1].length + 1];
//        String[] rogueHerd = new String[6];
    
        // Then I iterate over the old subherd and copy them into an index in the new array
        for (int i = 0; i < llamaHerd[1].length; i++) {
            rogueHerd[i] = llamaHerd[1][i];
        }

        // Since this is one MORE than the subherd, lets up something in the LAST index
        rogueHerd[rogueHerd.length - 1] = "Floyd";
        
        // If I do something with the old array now, it won't affect the runaways
        llamaHerd[1] = new String[0]; // They all ran away, so lets make it a new empty array
        
        System.out.println("\nThis many llamas ran away: " + rogueHerd.length);
        System.out.println("Runaway Llamas: " + rogueHerd[0]);
        System.out.println("Runaway Llamas: " + rogueHerd[6]);

        // But you can also use a lot of the fancy functions provided in the Arrays class
        String[] rogueHerd2 = Arrays.copyOf(rogueHerd, 3);
        System.out.println("Second rogue herd size: " + rogueHerd2.length);

        // Find the max llama Age
        int maxAge = -1; // I defined this "invalid age"
        // as a starting point because I knew the age ranges
        // would be all positive
        int minAge = llamaAges[0]; // This is cleaner, and better
        // because you KNOW that the result
        // will HAVE to be a valid age
        for (int i = 0; i < llamaAges.length; i++) {

            int curAge = llamaAges[i];
            if (curAge > maxAge) {
                maxAge = curAge;
            }

            if (curAge < minAge) {
                minAge = curAge;
            }

        }

    }

}
