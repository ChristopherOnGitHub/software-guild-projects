/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class IOConsole {

    Scanner userInput = new Scanner(System.in);

    public String menu() {
        System.out.println("WELCOME TO THE *S-I-M-P-L-E* CALCULATOR");
        System.out.println("CHOOSE AN OPERATION");
        System.out.println("Q EXISTS PROGRAM");
        System.out.println("VALID OPERATIONS: +-*/");

        String o = userInput.next();
        while (!(o.equals("+") || o.equals("-") || o.equals("/") || o.equals("*")
                || o.equalsIgnoreCase("q"))) {
            if (o.equalsIgnoreCase("q")) {
                System.out.println("THANK YOU FOR USING THE CALCULATOR");
            }
            System.out.println("WELCOME TO THE *S-I-M-P-L-E* CALCULATOR");
            System.out.println("CHOOSE AN OPERATION");
            System.out.println("Q EXITS PROGRAM");
            System.out.println("VALID OPERATIONS: +-*/");
            o = userInput.next();
        }
        return o;
    }

    public double enterDouble() {
        System.out.println(" ");
        System.out.println("PROVIDE FIRST NUMBER");
        double x;
        x = userInput.nextDouble();
        return x;

    }

    public double enterDoubleY() {
        System.out.println(" ");
        System.out.println("PROVIDE SECOND NUMBER");
        double y;
        y = userInput.nextDouble();
        return y;
    }

    public void goodbye() {
        System.out.println("GOODBYE");
    }

}
