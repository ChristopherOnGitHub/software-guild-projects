/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamentals1Scanners;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BiggerBadderAdder {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Please provide an integer: ");
        int anInt = inputReader.nextInt();
        
        System.out.println("Please provide a double: ");
        double aDouble = inputReader.nextDouble();
        
        System.out.println("Please provide a short: ");
        short aShort = inputReader.nextShort();
        
        double sum = (anInt + aDouble + aShort);
        System.out.println("The sum of your inputs is: " + sum + "!");
        
    }
    
}
