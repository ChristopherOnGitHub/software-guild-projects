/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamentals1Ifs;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class MiniZork {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox? ");
        String action = userInput.nextLine();
        
        if (action.equals("open the mailbox")){
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in?");
            action = userInput.nextLine();
            
            if(action.equals("look inside")){
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really dark. So ... so very dark.");
                System.out.println("Run away or keep looking?");
                action = userInput.nextLine();
                
                if (action.equals("keep looking")){
                System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                System.out.println("You've been eaten by a grue. YOU LOSE!");
                }
                else if(action.equals("run away")){
                System.out.println("You run away screaming across the fields - looking very foolish.");
                System.out.println("But you are alive. YOU WIN!!!");
                }   
                
            }else if (action.equals ("stick your hand in"));{
            System.out.println("Sharp teeth bite into your arm.");
            System.out.println("Your character now has -1 dexterity.");
            System.out.println("But you are alive. YOU WIn!!! (sorta)");
            }
                
        ///////////////////////////////////////////////////////
                
        }else if(action.equals("go to the house")){
        System.out.println("You walk to the house. It is very ominous...");
        System.out.println("Knock on the door or go around back?");
        action=userInput.nextLine();
            
            if(action.equals("go around back")){
            System.out.println("You walk around the back");
            System.out.println("You really shouldn't be snooping around...");
            System.out.println("A troll eats you. YOU LOSE!");
            }
            
            else if(action.equals("knock on the door")){
            System.out.println("You knock on the door.");
            System.out.println("A sweet old lady opens the door and...");
            System.out.println("GIVES YOU A COOKIE?");
            System.out.println("Inventory +1 cookies");
            System.out.println("YOU WIN!!! (best possible ending)");
            }
        
    }
    
    }
}    
