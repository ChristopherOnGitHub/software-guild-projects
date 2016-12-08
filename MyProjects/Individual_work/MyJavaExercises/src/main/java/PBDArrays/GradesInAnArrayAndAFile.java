/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDArrays;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class GradesInAnArrayAndAFile {
    public static void main(String[] args) throws IOException {
        
        Scanner userInput = new Scanner(System.in);
        Random randGen = new Random();
        
        System.out.print("Enter firstname lastname:");
        String userName = userInput.nextLine();
        System.out.print("Filename: ");
        String writtenFile = userInput.nextLine();
        
        int[] RandomGrades = {
            randGen.nextInt(100)+1, randGen.nextInt(100)+1, randGen.nextInt(100)+1, 
            randGen.nextInt(100)+1, randGen.nextInt(100)+1
        };
        
        System.out.println("Here are your randomly selected grade "
                + "(chance to pass is random, don't bother studying.)");
        System.out.println("Grade 1: "+RandomGrades[0]);
        System.out.println("Grade 2: "+RandomGrades[1]);
        System.out.println("Grade 3: "+RandomGrades[2]);
        System.out.println("Grade 4: "+RandomGrades[3]);
        System.out.println("Grade 5: "+RandomGrades[4]);
        
        System.out.println("Data saved in "+writtenFile);
        
        PrintWriter writer = new PrintWriter(new FileWriter(writtenFile));
        writer.println(userName);
        writer.println(RandomGrades[0]+" "+RandomGrades[1]+" "+RandomGrades[2]+" "
        +RandomGrades[3]+" "+RandomGrades[4]);
        writer.flush();
        writer.close();
    }
    
    
}
