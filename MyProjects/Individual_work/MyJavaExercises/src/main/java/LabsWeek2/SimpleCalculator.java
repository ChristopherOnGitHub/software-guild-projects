/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2;

import static LabsWeek2.SimpleCalculatorCalculations.addition;
import static LabsWeek2.SimpleCalculatorCalculations.division;
import static LabsWeek2.SimpleCalculatorCalculations.multiplication;
import static LabsWeek2.SimpleCalculatorCalculations.subtraction;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("WELCOME TO THE CALCULATOR");
        

        while(true){
            System.out.println(" ");
            System.out.println("WHAT FUNCTION WOULD YOU LIKE TO PERFORM?");
            System.out.println("VALID OPERATIONS: +-*/");
            System.out.println("PRESS 'Q' TO QUIT");
            String operations;
            operations = userInput.next();

            if (operations.equals("Q") || operations.equals("q")) {
                break;
                
            }

            switch (operations) {
                case "+":
                    {
                        System.out.println(" ");
                        System.out.println("PROVIDE TWO NUMBERS TO ADD");
                        double x = IOCalculator.getDoubleX();
                        double y = IOCalculator.getDoubleX();                    
                        System.out.println(addition(x, y));
                        break;
                    }
                case "-":
                    {
                        System.out.println(" ");
                        System.out.println("PROVIDE TWO NUMBERS TO SUBTRACT");
                        double x = IOCalculator.getFloatX();
                        double y = IOCalculator.getFloatX();                        
                        System.out.println(subtraction(x, y));
                        break;
                    }
                case "*":
                    {
                        System.out.println(" ");
                        System.out.println("PROVIDE TWO NUMBERS TO MULTIPLY");
                        double x = IOCalculator.getFloatX();
                        double y = IOCalculator.getFloatX();
                        System.out.println(multiplication(x, y));
                        break;
                    }
                case "/":
                    {
                        System.out.println(" ");
                        System.out.println("PROVIDE TWO NUMBERS TO DIVIDE");
                        double x = IOCalculator.getFloatX();
                        double y = IOCalculator.getFloatX();
                        System.out.println(division(x, y));
                        break;
                    }
                default:
                    break;
            }

        }

        System.out.println("GOODBYE");
    }

}