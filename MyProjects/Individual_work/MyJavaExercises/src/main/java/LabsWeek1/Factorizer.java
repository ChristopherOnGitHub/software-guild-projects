/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek1;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Factorizer {
    public static void main(String[] args) {
        
        int i=1;
        int prime=0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose a number you'd like to factor.");
        int userNumber = userInput.nextInt();
        int perfTracker = userNumber;
        
        while(i<userNumber){
            if((userNumber%i)==0){
                System.out.println(i);
                prime++;
                perfTracker = perfTracker-i;
            }
            i++;
        }
        
        if(prime==1){
            System.out.println(userNumber+" is a prime number.");
        }
        else if(perfTracker==0){
            System.out.println(userNumber+ " is a perfect number." );
            
        }
        
    }
    
}
