/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamentals1Scanners;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HealthyHearts {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Please provide your age: ");
        double age = inputReader.nextInt();
        
        double maxHeart = (age * 2.2);
        double minTarget = (maxHeart * 0.50);
        double maxTarget = (maxHeart * 0.85);
        
        System.out.println("Your maximum heart rate is " + maxHeart);
        System.out.println("Your target heart rate is " + minTarget + " - " + maxTarget);
        
    }
    
}
