package Fundamentals1Scanners;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class PassingTheTuringTest {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Hello! It's great to meet you!");
        System.out.println("what's your name?");
        String readerName = inputReader.next();
        
        System.out.println("Hi " + readerName + ". My name is 'PassingTheTuringTest.java'");
        System.out.println("So " + readerName + ", what is your favorite color?");
        String readerColor = inputReader.next();
        
        System.out.println("Weird! " + readerColor + " is my favorite color too!");
        System.out.println("What is your favorite fruit?");
        String readerFruit = inputReader.next();
        
        System.out.println("Ew! you like " + readerFruit + "?!?! That's sick!");
        System.out.println("Well anyways, what is your favorite number?");
        int readerNumber = inputReader.nextInt();
        
        System.out.println(readerNumber + "? Huh, well then mine is " + (readerNumber+1));
        System.out.println("That's your favorite number except one higher :D");
        System.out.println("It's been fun chatting, but I'm all out of functions.");
        System.out.println("Goodbye " + readerName + "!");
        
    }
    
}
