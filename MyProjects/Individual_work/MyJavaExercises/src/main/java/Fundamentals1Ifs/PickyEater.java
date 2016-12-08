/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamentals1Ifs;

import java.util.Scanner;
//Moved order for "as long as green is hidden by cheese result above cheesy doodle result

/**
 *
 * @author apprentice
 */
public class PickyEater {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("How many times has the food been fried? (#)");
        int numberFried = userInput.nextInt();
        System.out.println("Does it have any spinach in it? (y/n)");
        String hasSpinach = userInput.next();
        System.out.println("Is it covered in cheese? (y/n)");
        String hasCheese = userInput.next();
        System.out.println("How many pats of butter are on top? (#)");
        int patsButter = userInput.nextInt();
        System.out.println("Is it covered in chocolate? (y/n)");
        String chocolateCovered = userInput.next();
        System.out.println("Does it have a funny name? (y/n)");
        String funnyName = userInput.next();
        System.out.println("Is it broccoli? (y/n)");
        String isBroccoli = userInput.next();
        
        if((hasSpinach.equals("y")) || (funnyName.equals("y"))){
            System.out.println("There's no way that'll get eaten...");
        }
        else if((numberFried>2) && (numberFried<4) && (chocolateCovered.equals("y"))){
            System.out.println("Oh, it's like a deep fried snickers. That'll be a hit");
        }
         else if((isBroccoli.equals("y")) && (patsButter>6) && (hasCheese.equals("y"))){
            System.out.println("As long as the green is covered by cheese!");
        }       
        else if(isBroccoli.equals("y")){
            System.out.println("Oh, green stuff like that might as well go in the bin.");
        }
        else if((numberFried>2) && (hasCheese.equals("y"))){
            System.out.println("Mmm. Yeah, fried cheesy doodles will get eaten");
        }
        else{
            System.out.println("I dunno, but we can give it a shot...");
        }
        

    }
    
}
