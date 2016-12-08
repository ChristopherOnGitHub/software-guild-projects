/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasicsSkillCheck;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class WhatIsYourNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What is your number?");
        int userNumber = userInput.nextInt();
        System.out.println("Let's count to: "+userNumber);
        
        for(int i=0;i<=userNumber;i++){
            System.out.println(i);
        }
        System.out.println("Thank you for playing!");
    }
    
}
