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
public class DoItBetter {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("How many miles can you run?");
        double ranMiles = inputReader.nextDouble();
        System.out.println("Yeah well I can run " + (ranMiles*2+1) + " miles.");
        
        System.out.println("How many hotdogs can you eat?");
        int eatenDogs = inputReader.nextInt();
        System.out.println("I've eaten " + (eatenDogs*2+1) + " before!");
        
        System.out.println("How many languages can you speak?");
        int knownLanguages = inputReader.nextInt();
        System.out.println("Pssh.. I can speak " + (knownLanguages*2+1));
        
        
        
       
        
        
    }
    
}
