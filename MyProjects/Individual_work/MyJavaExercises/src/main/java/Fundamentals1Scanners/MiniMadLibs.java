package Fundamentals1Scanners;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class MiniMadLibs {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Let's play mad libs! Provide a word for each category!");
        
        System.out.println("1) noun");
        String noun1 = inputReader.next();
        
        System.out.println("2) adjective");
        String adjective1 = inputReader.next();
        
        System.out.println("3) noun");
        String noun2 = inputReader.next();
        
        System.out.println("4) number");
        int number = inputReader.nextInt();
        
        System.out.println("5) adjective");
        String adjective2 = inputReader.next();
        
        System.out.println("6) plural noun");
        String plural1 = inputReader.next();
        
        System.out.println("7) plural noun");
        String plural2 = inputReader.next();
        
        System.out.println("8) plural noun");
        String plural3 = inputReader.next();
        
        System.out.println("9) verb present tense");
        String verbPres = inputReader.next();
        
        System.out.println("10) same verb but past tense");
        String verbPast = inputReader.next();
        
        System.out.println(noun1 + ": the " + adjective1 + " frontier. These are the voyages"
                + " of starship " + noun2 + ". Its " + number + " year mission: to explore strange "
                + adjective2 +" " + plural1 + ", to seek out " + adjective2 + " " + plural2 + " and " + 
                adjective2 + " " + plural3 + ", to boldly " + verbPres + " where no one has " +
                verbPast + " before.");
        
        
               
    }
    
    
    
    
    
}
