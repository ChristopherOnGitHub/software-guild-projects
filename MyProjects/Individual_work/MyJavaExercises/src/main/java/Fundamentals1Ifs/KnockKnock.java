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
public class KnockKnock {
        public static void main(String[] args) {
            
            Scanner userInput = new Scanner(System.in);
            
            System.out.println("Knock Knock! Guess Who?");
            String userGuess = userInput.nextLine();
            
            if(userGuess.equalsIgnoreCase("Marty McFly")){
            System.out.println("That's right! I'm back");
            System.out.println("...from the future!");
            }
            else{
                System.out.println("What? No I'm not " + userGuess);
                }
            
            //I believe it no longer recognizes it when set to == because it
            //only stores the first word
            
        
    }
    
}
