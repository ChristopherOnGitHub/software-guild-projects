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
public class FindingValueInAnArray {
    public static void main(String[] args) {
        
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
        System.out.println("Value to find: ");
        int userNumber=userInput.nextInt();
        
        for(int i=0; i<theValues.length; i++){
            if(userNumber==theValues[i]){
                System.out.println(userNumber+" is in the array.");
            }
        }
    }
    
}
