/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2contd;

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
                || o.equals("q") || o.equals("Q"))) {
            if (o.equals("q") || o.equals("Q")) {
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

    public String sm() {
        System.out.println("CHOOSE AN OPERATION");
        System.out.println("Q EXISTS PROGRAM");
        System.out.println("WELCOME, CHOOSE AN OPERATION:");
        System.out.println("Q EXITS PROGRAM");
        System.out.println("1. View Students Enrolled");
        System.out.println("2. View A Student's Quiz Scores");
        System.out.println("3. View A Student's Average Quiz Score");
        System.out.println("4. Enroll A New Student");
        System.out.println("5. Remove A Student From The Database");
        System.out.println("6. View Student Keys");
        String o = userInput.nextLine();
        while (!(o.equals("1") || o.equals("2") || o.equals("3") || o.equals("4")
                || o.equals("5") ||o.equals("6")|| o.equals("q") || o.equals("Q"))) {
            if (o.equals("q") || o.equals("Q")) {
                System.out.println("HAVE A NICE DAY");
            }
            System.out.println("WELCOME, CHOOSE AN OPERATION:");
            System.out.println("Q EXITS PROGRAM");
            System.out.println("1. View Students Enrolled");
            System.out.println("2. View A Student's Quiz Scores");
            System.out.println("3. View A Student's Average Quiz Score");
            System.out.println("4. Enroll A New Student");
            System.out.println("5. Remove A Student From The Database");
            System.out.println("6. View Student Keys");
            o = userInput.nextLine();
        }
        return o;
    }
    
    public double avg(double x, double y, double z){
        double avg;
        double total = x+y+z;
        avg = total/3;
        return avg;
    }
    

}
