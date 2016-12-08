package ClassDemos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Randoms {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner userInput = new Scanner(System.in);

        int x;

        x = 4;
        x = rand.nextInt();
        System.out.println("My random number is:" + x);

        int btwnZeroAndTen = rand.nextInt(11);
        System.out.println("New random between 0 - 10: " + btwnZeroAndTen);

        //rand.nextInt(-395);
        int d6Roll = 1 + rand.nextInt(6);
        System.out.println("Your dice roll is: " + d6Roll);
        boolean mySuccess = rand.nextBoolean();
        System.out.println("Your random success chance is: " + mySuccess);
        
        

    }
}
