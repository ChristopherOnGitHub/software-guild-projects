/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Randoms5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class GuessMeMore {
        public static void main(String[] args) {
            
            Random generatedNumber = new Random();
            Scanner inputReader = new Scanner(System.in); 
        
            int randNumber = generatedNumber.nextInt(200);
            int correctNumber = 100 - randNumber;
            System.out.println("I'm thinking of a number between 100 and -100"
                    + " can you guess it?");
            int userGuess = inputReader.nextInt();
            
            do{           
            if(userGuess<correctNumber){
                System.out.println("Your guess is less than the correct number.");
            }
            else if(userGuess>correctNumber){
                System.out.println("Your guess is more than the correct number.");
            }
            System.out.println("Try and guess again.");
            userGuess = inputReader.nextInt();
            }while(userGuess != correctNumber);
            
            System.out.println("Nice you guessed, " + correctNumber + 
                    " which is the correct number.");
    }
}
