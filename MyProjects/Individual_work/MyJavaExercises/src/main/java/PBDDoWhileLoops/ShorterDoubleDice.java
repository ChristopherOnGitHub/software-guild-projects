/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDDoWhileLoops;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class ShorterDoubleDice {
    public static void main(String[] args) {
        
        System.out.println("YOU'RE ABOUT TO SEE SOME SERIOUS DICING!!!");
        Random randGen = new Random();
        int dice1;
        int dice2;
        
        do{
            dice1 = randGen.nextInt(6)+1;
            dice2 = randGen.nextInt(6)+1;
            System.out.println(" ");
            System.out.println("First roll is: " + dice1);
            System.out.println("Second roll is: " + dice2);
        }while(dice1!=dice2);
        
        System.out.println("DOUBLES BABY!!!");
    }
    
}
