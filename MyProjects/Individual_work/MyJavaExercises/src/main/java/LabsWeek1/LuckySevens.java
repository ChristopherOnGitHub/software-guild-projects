/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek1;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class LuckySevens {
    public static void main(String[] args) {
        
       Random randGen = new Random();
       Scanner inputReader = new Scanner(System.in);
       double maxWin= 0;
       int maxWinRoll= 0;
       int rolls= 0;
       
        System.out.println("Welcome to Lucky Sevens! What is your starting bet? : $");
        double beginningBet = inputReader.nextDouble();
        
        double startingBet = beginningBet;
        
        while(startingBet>0){
            int die1 = randGen.nextInt((6)+1);
            int die2 = randGen.nextInt((6)+1);
            int dieTotal = (die1+die2);
            
            if(dieTotal != 7){
                startingBet = startingBet-1;
                rolls++;    
            }
            else if(dieTotal == 7){
                startingBet = startingBet+4;
                rolls++;
                if(startingBet>maxWin){
                    maxWin = startingBet;
                    maxWinRoll = rolls;
                }
            }
        }
        
        System.out.println("YOU LOSE!!!");
        System.out.println("You started with : $" + beginningBet);
        System.out.println("The most you won was: $" + maxWin);
        System.out.println("You won the most on roll #" + maxWinRoll);
        System.out.println("Total rolls before going broke: " +rolls);
    }
    
}
