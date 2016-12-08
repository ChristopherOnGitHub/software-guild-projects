/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDWhileLoops;

import java.util.Scanner;


/**
 *
 * @author apprentice
 */
public class HiLoWithLimitedTries {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int correctNumber = 50;
        int numberGuesses = 1;
        
        System.out.println("I'm thinking of a number between 1-100");
        System.out.println("I'll give you 7 guesses!");
        int userGuess = userInput.nextInt();
        
        while((userGuess!=correctNumber)&&(numberGuesses<7)){
            System.out.println("That guess was incorrect. You have " +
                    (7-numberGuesses)+ " left.");
            numberGuesses++;
            if(userGuess>correctNumber){
            System.out.println("Your guess was too high");
            }else if(userGuess<correctNumber){
                System.out.println("Your guess was too low");
            }
            userGuess = userInput.nextInt();
            
        }
        if(userGuess==correctNumber){
            System.out.println("You guessed the number!!");
        }else{
            System.out.println("You could not guess the number in time!!");
        }
    }
    
}
