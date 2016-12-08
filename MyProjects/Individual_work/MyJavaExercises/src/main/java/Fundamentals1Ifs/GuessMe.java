/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamentals1Ifs;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class GuessMe {
        public static void main(String[] args) {
            
            Scanner inputReader = new Scanner(System.in); {
        
            int correctNumber =50;
            
            System.out.println("I'm thinking of a number, try and guess it.");
            int userGuess = inputReader.nextInt();
            
            if(userGuess > correctNumber){
                System.out.println("Too Big! I was thinking of " +correctNumber);
            }
            
            if(userGuess < correctNumber){
                System.out.println("Too Small! I was thinking of " +correctNumber);
            }
                        
            if(userGuess == correctNumber){
                System.out.println("You guessed the number!");
            }

       
            
        }
    }
    
}
