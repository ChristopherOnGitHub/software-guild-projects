/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Randoms5;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class Opinionator {
        public static void main(String[] args) {
        Random randGen = new Random();
        
        int x = randGen.nextInt(6);
        
            System.out.println("The number we chose is: " +x);
            
            if(x==0){
                System.out.println("Llamas are the best!");
            }else if(x==1){
                System.out.println("Dodos are the best!");
            }else if(x==2){
                System.out.println("Woolly Mammoths are DEFINITELY the best!");
            }else if(x==3){
                System.out.println("Sharks are the greatest, they have their own week!");
            }else if (x==4){
                System.out.println("Cockatoos are just so awesome!");
            }else if (x==5){
                System.out.println("Have you ever met a Mole-Rat? They're GREAT!");
            }
            
            System.out.println("Thanks Random, maybe YOU'RE the best!");
            //must generate between 0 &  6, not 5
            
    }
        
    
    
}
