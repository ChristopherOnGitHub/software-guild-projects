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
public class CoinFlipper {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random coinFlip = new Random();
        

            System.out.println("What do you think you will roll?");
            String guess = userInput.nextLine();
            boolean flipResult = coinFlip.nextBoolean();
            if(flipResult){
                System.out.println("You have flipped heads!");
            }else{
                System.out.println("You have flipped tails!");

            
            
            
        }
        
    }
    
}
