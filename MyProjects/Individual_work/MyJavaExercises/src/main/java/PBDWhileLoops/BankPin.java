/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDWhileLoops;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BankPin {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        
        System.out.println("WELCOME TO CHRIS FLOYD'S BADASS BANK!");
        System.out.println("PLEASE PROVIDE YOUR PIN NUMBER");
        int entry = keyboard.nextInt();
        
        while (entry != pin){
            System.out.println("THAT PIN IS NOT CORRECT. TRY AGAIN.");
            System.out.println("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }
        
        System.out.println("PIN ACCEPTED. WELCOME TO THE BADASS BANK.");
        
        //both check for a certain criteria
        //loops will continually run code until a criteria is met
        //variable entry was already declared in line 22
        //you are never given a chance to re-enter the pin number, you fall into a black hole
        //
    }
    
}
