/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDMethods;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DisplayingSomeMultiples {
    public static void main(String[] args) {
        
        double x = 0;
        Scanner userInput = new Scanner (System.in);
        
        System.out.println("Choose a number: ");
        double userNumber = userInput.nextDouble();
        
        for(int i = 0; i <=12; i++){
            x = x+userNumber;
            System.out.println(x);
        }
        
        
    }
    
}
