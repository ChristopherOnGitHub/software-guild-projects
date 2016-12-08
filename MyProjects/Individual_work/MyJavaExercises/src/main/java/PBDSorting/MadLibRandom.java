/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDSorting;

import java.util.Scanner;
import java.util.Random;


/**  
 *
 * @author apprentice
 */
public class MadLibRandom {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        Random randGen = new Random();
        
        String[] person1Array = {
            "HOLLYWOOD SUPERSTAR SHIA LABEOUF", "LEX LUTHOR", "MR MITCHELL", "VLADMIR PUTIN"
        };
        
        double[] userNumberArray = {
            1.1234, 11.7, 0.0000000003, 192837.465,
        };
        
        String[] weaponArray = {
          "BALOON ANIMAL", "ROUNDHOUSE KICK", "KATANA", "IMGINARY BASEBALL BAT"  
        };
        
        String[] heroArray = {
            "THE SOFTWARE GUILD", "MARKY MARK AND THE FUNKY BUNCH", "JOHN CENA", "CHRISTOPHER FLOYD" 
        };
        
        System.out.println("TIME TO PLAY MAD LIBS!!!");
        int roll1 = randGen.nextInt(4);
        int roll2 = randGen.nextInt(4);
        int roll3 = randGen.nextInt(4);
        int roll4 = randGen.nextInt(4);
        
        String person1 = person1Array[roll1];
        double userNumber = userNumberArray[roll2];
        String weapon = weaponArray[roll3];
        String hero = heroArray[roll4];
        
        System.out.println("This is the story of the demise of one of history's most");
        System.out.println("feared individuals, "+person1+".");
        System.out.println(person1+"stood at "+userNumber+"feet tall, and was truly feared.");
        System.out.println("His rule was relentless. Any who dared oppose him were");
        System.out.println("subject to the wrath of his razor-sharp "+weapon+".");
        System.out.println("That is, until the arrival of "+person1+"'s greatest nemesis...");
        System.out.println("It was "+hero+"!!!");
        System.out.println(" ");
        System.out.println(hero+" had the amazing ability to completely negate the");
        System.out.println("feared"+weapon+"! "+person1+"was stunned. ");
        System.out.println(hero+" took his chance and delivered a fatal blow to "+person1);
        System.out.println("As "+person1+"'s "+userNumber+" body hit the floor. Morgan Freeman");
        System.out.println("himself came down and thanked      "+hero+"for all he had done.");
        System.out.println(" ");
        System.out.println("THE END!");
                
        //I got a little excited and forgot to scroll down to see a madlib was provided
        //so I hope you enjoy this one that I made :D
        
    }
    
}
