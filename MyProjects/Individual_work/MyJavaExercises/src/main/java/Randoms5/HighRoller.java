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
public class HighRoller {
    public static void main(String[] args) {
        
    Random diceRoller = new Random();
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("How many sides does your die have?");
    int sidesOfDice = userInput.nextInt();
    
    int rollResult = diceRoller.nextInt(sidesOfDice)+1;
    
        
        if(rollResult == 1){
            System.out.println("You rolled a critical failure!");
        }
        else if(rollResult == 20){
        System.out.println("You roll 20 - super effective!");
        }
        else{
            System.out.println("You rolled a: " + rollResult);
        }
    
    
    
    
    
}
}
