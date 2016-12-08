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
public class AddingValues {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int x = userInput.nextInt();
        int i = 1;
        int total = 0;
        
        for (i=1; i<=x; i++){
            System.out.println(i);
            total=total+i;
        }
        System.out.println("The numbers counting up to " +x+ " add up to " +total);
    }
    
}
