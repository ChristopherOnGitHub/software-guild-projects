/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDArrays;

import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author apprentice
 */
public class LocatingTheLargestInTheArray {
    public static void main(String[] args) {
        
        int biggest = 0;
        int biggestLocation = 0;
        
        Scanner userInput = new Scanner(System.in);
        Random randGen = new Random();
        
        int[] theValues = {
            randGen.nextInt(50)+1, randGen.nextInt(50)+1, randGen.nextInt(50)+1, 
            randGen.nextInt(50)+1, randGen.nextInt(50)+1, randGen.nextInt(50)+1, 
            randGen.nextInt(50)+1, randGen.nextInt(50)+1, randGen.nextInt(50)+1, 
            randGen.nextInt(50)+1};
        
        System.out.print("Array: ");
        for(int x : theValues){
            System.out.print(x+" ");
        }
        System.out.println(" ");
        
        for(int i=0; i<theValues.length; i++){
            if(theValues[i]>biggest){
                biggest=theValues[i];
                biggestLocation=i;
            }
        }
        System.out.println(biggest+" is the largest number in the array. At "+(biggestLocation+1));
    }
    
}