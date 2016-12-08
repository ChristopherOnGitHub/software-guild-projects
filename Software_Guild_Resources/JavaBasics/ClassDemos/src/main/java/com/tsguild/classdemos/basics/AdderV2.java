/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.basics;

//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author ahill
 */
public class AdderV2 {
    
    public static void main(String[] args) {
        
        Scanner userInput; 
        userInput = new Scanner(System.in);
        
        System.out.println("LETS ADD NUMBERS!");
        System.out.print("Please give me your first number: ");
        
        double sum = 0;
        double op1 = 55;
        double op2 = 66;
        
        op1 = userInput.nextDouble();
        
        System.out.print("Please give me your SECOND number: ");
        op2 = userInput.nextDouble();
        
        System.out.print(op1 + " + " + op2 + " = ");
        sum = op1 + op2;
        System.out.println(sum);
        
    }
    
    
}
