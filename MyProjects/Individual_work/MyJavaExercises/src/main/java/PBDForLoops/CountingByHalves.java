/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDForLoops;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class CountingByHalves {
    public static void main(String[] args) {
        
    Scanner userInput= new Scanner(System.in);
        System.out.println("How high would you like to count? ");
    double i;

        System.out.println("******************");
        System.out.println(" ");
    for(i=-10;i<=10;i=i+0.5){
        System.out.println(i);
    }
    
    
    }   
}
