/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDDoWhileLoops;

import PBDWhileLoops.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AgainWithTheNumerGuessing {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        Random randGen = new Random();
        
        
        System.out.println("I'M THINKING OF A NUMBER BETWEEN 1 AND 10. TRY AND GUESS IT.");
        int correctNumber = randGen.nextInt(10)+1;
        int userGuess = userInput.nextInt();
        int numberGuesses = 1;
        
        if(userGuess != correctNumber){
        do{
            System.out.println("Try Again");
            System.out.println("Take another guess: ");
            numberGuesses++;
            userGuess = userInput.nextInt();
            
        }while(userGuess != correctNumber);
        }
        
        System.out.println("YOU GUESSED THE NUMBER!");
        System.out.println("It took you: " +numberGuesses+ " guesses.");
    }
    
}
