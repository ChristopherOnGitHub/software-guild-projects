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
public class DogGenetics {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random randGen = new Random();
        
        System.out.println("what is your dog's name?");
        String dogName = userInput.nextLine();
        System.out.println("Great! Now let's find out what " +dogName+ "'s "
                + "genetic background is.");
        
        int breed1 = randGen.nextInt(50);
        int breed2 = randGen.nextInt(100-breed1);
        int breed3 = randGen.nextInt(100-(breed1+breed2));
        int breed4 = randGen.nextInt(100-(breed1+breed2+breed3));
        int breed5 = (100-(breed1+breed2+breed3+breed4));
        
        System.out.println(dogName + "is:");
        System.out.println(breed1+ "% Golden Retriever");
        System.out.println(breed2+ "% Pitbull");
        System.out.println(breed3+ "% Husky");
        System.out.println(breed4+ "% Beagle");
        System.out.println(breed5+ "% Dalmation");
        
        System.out.println(dogName +" is quite the pupper!");
        
    }
    
}
