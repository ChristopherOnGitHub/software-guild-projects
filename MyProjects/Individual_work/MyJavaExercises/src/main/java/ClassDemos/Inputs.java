package ClassDemos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Inputs {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please provide a number: ");
        //String input = userInput.nextLine();
        //int x = Integer.parseInt(input);
        
        //userInput.hasNextInt();
        
        while(!userInput.hasNextInt()){
            System.out.println("You need to give a valid integer.");
        }
    }
    
    
    
}
