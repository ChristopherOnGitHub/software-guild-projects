/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class RockPaperScissors2 {
    public static void main(String[] args) {
        
    
    
    int paper = 1;
    int rock = 2;
    int scissors = 3;
    
    Scanner inputReader = new Scanner(System.in);
    Random randGen = new Random();
    
        System.out.println("HOW MANY ROUNDS WOULD YOU LIKE TO PLAY? (max 10)");
        int x = inputReader.nextInt();
        
        while(x>10||x<1){
            System.out.println("Please enter a valid selection");
            x = inputReader.nextInt();
        }
    
        while(x>0){
        System.out.println("PAPER, ROCK, SCISSORS!");
        System.out.println("Choose: 1=Paper 2=Rock 3=Scissors");
        
       int userChoice = inputReader.nextInt();
       
            while(userChoice<0 || userChoice>3){
                System.out.println("Please enter a valid selection");
                
               userChoice = inputReader.nextInt();
            }
            
        int botChoice = randGen.nextInt(3)+1;
 
            if((botChoice==1)&&(userChoice==1)){
                System.out.println("You and the bot both chose paper");
            }else if((botChoice==2)&&(userChoice==1)){
                System.out.println("Your paper beat the bot's rock");
            }else if((botChoice==3)&&(userChoice==1)){
                System.out.println("The bot's scissors beat your paper");
            } else if ((botChoice==1)&&(userChoice==2)){
                System.out.println("The bot's paper beat your rock");
            }else if((botChoice==2)&&(userChoice==2)){
                System.out.println("You and the bot both chose rock");
            }else if((botChoice==3)&&(userChoice==2)){
                System.out.println("Your rock beat the bot's scissors");
            }else if((botChoice==1)&&(userChoice==3)){
                System.out.println("Your scissors beat the bot's paper");
            }else if((botChoice==2)&&(userChoice==3)){
                System.out.println("The bot's rock beat your scissors");
            }else if((botChoice==3)&&(userChoice==3)){
                System.out.println("You and the bot both chose rock");
            }
            System.out.println("____________________________________");
            System.out.println(" ");
            x--;
        }    
        }
}    
        
    
