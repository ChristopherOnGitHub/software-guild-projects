/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDForLoops;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BlackJack {
    public static void main(String[] args) {
        
        Random randGen = new Random();
        Scanner userInput = new Scanner (System.in);
        
        String playAgain;
        
        do{int userCard = randGen.nextInt(10)+2;
        int userCard2 = randGen.nextInt(10)+2;
        
        int dealerCard = randGen.nextInt(10)+2;
        int dealerCard2 = randGen.nextInt(10)+2;
        
        int userTotal = userCard + userCard2;
        int dealerTotal = dealerCard + dealerCard2;
        int randomCard = randGen.nextInt(10)+2;
        int i;
        
            System.out.println("Your drew a " +userCard+ " and a " +userCard2);
            System.out.println("You total is " +userTotal);
            System.out.println(" ");
            System.out.println("The dealer has a " +dealerCard+ " and "
                    + "a hidden card on the table.");
            System.out.println("Hit? ('Y' = yes)");
            playAgain = userInput.next();
            
            while((playAgain.equals("y") || playAgain.equals("Y")) && userTotal<21){
                int userHitCard= randGen.nextInt(10)+2;
                userTotal=userTotal + userHitCard;
                System.out.println("You drew a " +userHitCard+ " your total is " +userTotal);
                System.out.println("Hit? ('Y' = yes)");
                playAgain = userInput.next();
            }
            
            if(userTotal>21){
                System.out.println("You have busted!");
            }
            else{
                System.out.println("The dealer's second card is a " +dealerCard2);

                while(dealerTotal<17){
                    System.out.println("The dealer hits");
                    int userHitCard= randGen.nextInt(10)+2;
                    dealerTotal= dealerTotal + userHitCard;
                    System.out.println("The dealer's new total is: " +dealerTotal);
                    System.out.println(" ");
                }
                
                if(dealerTotal>21){
                    System.out.println("THE DEALER BUSTED YOU WIN!");
                }else if(dealerTotal>userTotal){                    
                    System.out.println("The dealer's "+dealerTotal+" beats your "+userTotal);
                }else if(dealerTotal==userTotal){
                    System.out.println("Tie, dealer wins");
                }
            }
            System.out.println(" ");
            System.out.println("Would you like to play again? ('Y' = yes)");
            playAgain = userInput.next();

        }while(playAgain.equals("y") || playAgain.equals("Y"));  
    }
    
}
