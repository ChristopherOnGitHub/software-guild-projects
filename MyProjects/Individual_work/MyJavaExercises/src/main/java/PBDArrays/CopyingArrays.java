/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDArrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class CopyingArrays {

    public static void main(String[] args) {
        Random randGen = new Random();

        int[] RandomNumbers = {
            randGen.nextInt(100) + 1, randGen.nextInt(100) + 1, randGen.nextInt(100) + 1,
            randGen.nextInt(100) + 1, randGen.nextInt(100) + 1, randGen.nextInt(100) + 1,
            randGen.nextInt(100) + 1, randGen.nextInt(100) + 1, randGen.nextInt(100) + 1,
            randGen.nextInt(100) + 1,};

        System.out.print("Array 1: ");
        for (int x =0; x<RandomNumbers.length-1; x++) {
            System.out.print(RandomNumbers[0+x]+" ");
        }
        System.out.println(-7);
        
        int[] RandomNumbers2 = Arrays.copyOf(RandomNumbers, 10);
        System.out.print("Array 2: ");
        for (int x : RandomNumbers2) {
            System.out.print(x + " ");
        }        
    }

}
