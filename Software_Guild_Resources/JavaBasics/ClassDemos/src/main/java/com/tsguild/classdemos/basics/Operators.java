/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.basics;

/**
 *
 * @author ahill
 */
public class Operators {
    
    public static void main(String[] args) {
        
        // Declare some variables to use...
        int result;
        int operand1;
        int operand2;
        int operand3;
        
        // Assign values to a variable
        // so that you can use it!!
        // It takes the value of the thing on the right...
        result = 0; // result is now zero
        
        operand1 = 11;
        operand2 = 7;
        
        // operand2 and operand3 are both 7!
        operand3 = operand2;
        
        // Lets add some things
        
        operand3 = operand3 + 5;
        operand1 = operand1 + 1;
        result = operand1 + operand2 + operand3;
        
//        System.out.println(operand1);
//        ++operand1;
//        System.out.println(operand1);
        System.out.println("This is operand1 now: " + operand1);
        System.out.println("This is ++operand1: " + ++operand1);
        System.out.println("This is operand1 NOW: " + operand1);
        System.out.println("This is operand1++: " + operand1++);
        System.out.println("This is operand1 NOW: " + operand1);
        
        // SUBTRACTION (ain't so different from addition)
        System.out.println("This is the result now: " + result);
        result = result - operand1;
        System.out.println("This is after we subtract " + operand1 + ": " + result);
        
        // MULTIPLICATION!!
        
        System.out.print(operand1 + " * " + operand3 + ": ");
        System.out.println(operand1 * operand3);
        
        // DIVISION
        operand1 = 5;
        operand2 = 4;
        result = operand1 / operand2;
        System.out.println(operand1 + " / " + operand2 + " = " + result);
        System.out.println("4/5 = " + (4/5));
        System.out.println("4.0/5.0 = " + (4.0/5.0));
        
    }
    
}
