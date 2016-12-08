/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDDoWhileLoops;

import java.util.Scanner;


/**
 *
 * @author apprentice
 */
public class CollatzSequence {
    public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
        System.out.println("See if you can stump Lothar!");
        System.out.println("Choose a number: ");
        int userNumber = userInput.nextInt();
        
        do{
            if(userNumber%2==0){
                userNumber= userNumber/2;
                System.out.println(userNumber);
            }else{
                userNumber = ((userNumber * 3)+1);
                System.out.println(userNumber);
            }
            
        }while(userNumber>1);
        
        
    }
}
