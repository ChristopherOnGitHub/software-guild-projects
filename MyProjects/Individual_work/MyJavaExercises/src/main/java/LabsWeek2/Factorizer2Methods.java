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
public class Factorizer2Methods {

    Scanner userInput = new Scanner(System.in);

    public int enterInt() {
        System.out.println(" ");
        System.out.println("PROVIDE NUMBER TO FACTOR");
        int x;
        x = userInput.nextInt();
        while (x <= 0) {
            System.out.println("PLEASE ENTER A VALID NUMBER");
            x = userInput.nextInt();
        }
        return x;

    }

    public void factorizer(int userNumber, int perfTracker) {

        int i = 1;
        int prime = 0;
        while (i < userNumber) {
            if ((userNumber % i) == 0) {
                System.out.println(i);
                prime++;
                perfTracker = perfTracker - i;
            }
            i++;
        }

        if (prime == 1) {
            System.out.println(userNumber + " is a prime number.");
        } else if (perfTracker == 0) {
            System.out.println(userNumber + " is a perfect number.");

        }

    }

}
