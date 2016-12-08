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
public class CountingMachine {
    public static void main(String[] args) {
        
    Scanner userInput= new Scanner(System.in);
        System.out.println("How high would you like to count? ");
    int x =userInput.nextInt();
    int i;

        System.out.println("******************");
        System.out.println(" ");
    for(i=1;i<=x;i++){
        System.out.println(i);
    }
    
    
    }   
}
