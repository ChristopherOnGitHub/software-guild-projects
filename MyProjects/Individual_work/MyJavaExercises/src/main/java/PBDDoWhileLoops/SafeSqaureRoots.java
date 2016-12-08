/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDDoWhileLoops;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SafeSqaureRoots {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("SQUARE ROOTS!!!!!");
        System.out.println("What number would  you like to square root?");
        
        double userNumber;
        userNumber = inputReader.nextDouble();
        
        while(userNumber<=0){
            System.out.println("Please enter a positive number");
            userNumber = inputReader.nextDouble();
        }
        
        double sqaureRoot = Math.sqrt(userNumber);
        System.out.println("The sqaure root of " +userNumber+ " is: " +sqaureRoot);
        
    }
    
}
