/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmups;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class CountingDice {

    public static void main(String[] args) {

        ArrayList<Integer> rolls = new ArrayList<>();
        Random randGen = new Random();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Sides of dice?: ");
        int x = userInput.nextInt();
        int max = 0;

        System.out.println("How many times do you want to roll?");
        int y = userInput.nextInt();

        for (int i = 0; i < y; i++) {
            int dice1 = randGen.nextInt(x) + 1;
            int dice2 = randGen.nextInt(x) + 1;
            int total = dice1 + dice2;
            rolls.add(total);
            if (total > max) {
                max = total;
            }

        }

        for (int i = 2; i <= max; i++) {
            System.out.print(i + ":");
            for (int temp : rolls) {
                if (temp == i) {
                    System.out.print("x");
                }
            }
            System.out.println(" ");
        }

    }

}
