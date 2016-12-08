/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamentals1Ifs;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What is the year that you were born?");
        int yearBorn = inputReader.nextInt();
        
        if(yearBorn<2005){
            System.out.println("Pixar's 'UP' came out half a decade ago.");
        }
        if(yearBorn <1995){
            System.out.println("The first 'Harry Potter movie came out over 15 years ago.");
        }
        if(yearBorn <1985){
            System.out.println("Space came out not last decade, but the decade before that.");
        }
        if(yearBorn <1975){
            System.out.println("Jurrassic Park's release is closer to the moon landing than today.");
        }
        if(yearBorn <1965){
            System.out.println("M*A*S*H* has been around for over half a century!");
        }
        
    }
    
}
