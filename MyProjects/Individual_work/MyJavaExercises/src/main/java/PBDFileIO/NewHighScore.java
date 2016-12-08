/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDFileIO;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class NewHighScore {

    public static void main(String[] args) throws FileNotFoundException, IOException {
    Scanner userInput = new Scanner(System.in);
    
        System.out.println("YOU GOT A NEW HIGH SCORE!!!");
        System.out.println("WHAT IS YOUR NAME?");
        String userName = userInput.nextLine();
        System.out.println("WHAT WAS YOUR SCORE?");
        double userScore = userInput.nextDouble();
        System.out.println("THANK YOU");
        
        PrintWriter writer = new PrintWriter( new FileWriter("HighScore.txt"));
        writer.println(userName+", set a new high score.");
        writer.println(" ");
        writer.println("The new high score is: "+userScore);
        writer.flush();
        writer.close();
    }
}