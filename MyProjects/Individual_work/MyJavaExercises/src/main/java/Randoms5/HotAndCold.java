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
public class HotAndCold {
        public static void main(String[] args) {
            Scanner inputReader = new Scanner(System.in);
            Random randGen = new Random();
            
            System.out.println("I'm thinking of a number between 1-1000. "
                    + "Can you guess it?");
            
            int correctNumber = randGen.nextInt((1000)+1);
            int userGuess = inputReader.nextInt();
            
            do{           
            if((userGuess-correctNumber>-2)&&(userGuess-correctNumber<2)){
                System.out.println("Your skin has literally melted off... :(");
            }
            else if((userGuess-correctNumber>-9)&&(userGuess-correctNumber<9)){
                System.out.println("So hot, it's like living on the sun!!!");
            }
            else if((userGuess-correctNumber>-20)&&(userGuess-correctNumber<20)){
                System.out.println("You're bubbling hot!");
            }
            else if((userGuess-correctNumber>-50)&&(userGuess-correctNumber<50)){
                System.out.println("Heating up....");
            }
            else if((userGuess-correctNumber>-100)&&(userGuess-correctNumber<100)){
                System.out.println("Warm, but still off");
            }
            else if((userGuess-correctNumber>-200)&&(userGuess-correctNumber<200)){
                System.out.println("Tepid, but approaching room temp");
            }
            else if((userGuess-correctNumber>-500)&&(userGuess-correctNumber<500)){
                System.out.println("Pretty chilly");
            }
            else{
                    System.out.println("So cold, you're on the north pole...");
                    }
            System.out.println("Try and guess again.");
            userGuess = inputReader.nextInt();
            }while(userGuess != correctNumber);

            System.out.println("WINNER WINNER CHICKEN DINNER!");
    }
    
}
