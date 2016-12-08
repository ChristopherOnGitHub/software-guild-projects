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
public class IOCalculator {

    private static Scanner userInput = new Scanner(System.in);

    public static int asdf(int x, int y) {
        int z = x + y;
        return z;
    }

    public static int getIntX() {
        System.out.println("ENTER INTEGER:");
        int x = userInput.nextInt();
        return x;
    }

    public static int getIntXInRange() {
        int x = userInput.nextInt();
        while (x < 0) {
            System.out.println("ENTER A POSITIVE INTEGER:");
            x = userInput.nextInt();
        }
        return x;
    }

    public static String getStringX() {
        System.out.println("ENTER STRING:");
        String x = userInput.next();
        return x;
    }

    public static double getDoubleX() {
        System.out.println("ENTER DOUBLE:");
        double x = userInput.nextDouble();
        return x;
    }

    public static double getDoubleXInRange() {
        double x = userInput.nextDouble();
        while (x < 0) {
            System.out.println("ENTER A POSITIVE DOUBLE:");
            x = userInput.nextDouble();
        }
        return x;
    }

    public static float getFloatX() {
        System.out.println("ENTER FLOAT:");
        float x = userInput.nextFloat();
        return x;
    }

    public static float getFloatXInRange() {
        float x = userInput.nextFloat();
        while (x < 0) {
            System.out.println("ENTER A POSITIVE FLOAT:");
            x = userInput.nextFloat();
        }
        return x;
    }

}
