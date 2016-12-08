/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemos;

import java.util.Scanner;


/**
 *
 * @author apprentice
 */
public class Adder2 {
    public static void main(String[] args) {
        
        Scanner userInput;
        userInput = new Scanner(System.in);
        
        System.out.println("LETS ADD NUMBERS!");
        System.out.print("Please provide your first number: ");
               
        
        double number1 = 55.5;
        double number2 = 33.3;
        
        number1 = userInput.nextDouble();
        
        System.out.println("Please provide your second number: ");
        number2 = userInput.nextDouble();
        
        double sum = (number1+number2);
        
        System.out.println("var number1 is " + number1);
        System.out.println("var number2 is " + number2);
        System.out.println("number1 plus number2 is " + sum);
  }
    
}
