/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDDoWhileLoops;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class FlipAgain {
    public static void main(String[] args) {
        
    
    Scanner inputReader = new Scanner(System.in);
    Random randGen = new Random();
    String playAgain;
    
    do{
    Boolean flip = randGen.nextBoolean();
    if(flip){
        System.out.println("You flipped heads");
    }else{
        System.out.println("You flipped tails");
    }
            System.out.println("Would you like to play again? (y/n)");
            playAgain = inputReader.next();
    }while(playAgain.equals("y"));
    
    
}
}
