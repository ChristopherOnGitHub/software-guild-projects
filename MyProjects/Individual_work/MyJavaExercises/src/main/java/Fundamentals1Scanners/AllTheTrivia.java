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
public class AllTheTrivia {
        public static void main(String[] args) {
        
            Scanner inputReader = new Scanner (System.in);
            
            System.out.println("What is the closest planet to the sun?");
            String planet = inputReader.next();
            System.out.println("Interesting, who sings 'Bohemian Rhapsody'?");
            String musician = inputReader.next();
            System.out.println("What city are we in right now?");
            String city = inputReader.next();
            System.out.println("What country borders us to the north?");
            String country = inputReader.next();
            
            System.out.println(city + ", must get very hot!");
            System.out.println(planet + " has an incredible vocal range!");
            System.out.println("I hope " + country + " is treating you well!");
            System.out.println("I wonder how cold " + musician + " gets?");
            
    }
    
}
