/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDForLoops;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class CountingMachineRevisted {
    public static void main(String[] args) {
        
    Scanner userInput= new Scanner(System.in);
        System.out.println("How high would you like to count? ");
    int x =userInput.nextInt();
        System.out.println("What is your starting number?");
    int i =userInput.nextInt();
        System.out.println("Count by how much?");
    int y =userInput.nextInt();  

        System.out.println("******************");
        System.out.println(" ");
        
    for(i=i ; i<=x ; i=i+y){
        System.out.println(i);
    }
    
    
    }   
}
