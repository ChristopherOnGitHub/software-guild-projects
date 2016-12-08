/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDWhileLoops;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random randGen = new Random();
        double userTotal = 0;
        
        System.out.println("I WILL ADD UP ALL THE NUMBERS YOU GIVE ME");
        System.out.println("enter a negative number or zero to quit");
        
        System.out.println("What is your first number?");
        double userNumber = userInput.nextInt();
        
        while(userNumber>0){
            
            userTotal = userTotal + userNumber;
            
            System.out.println("Current total: " + userTotal);
            
            System.out.println("What is your next number?");
            userNumber = userInput.nextInt();
            System.out.println(" ");
            
            
        }
    }
    
}
