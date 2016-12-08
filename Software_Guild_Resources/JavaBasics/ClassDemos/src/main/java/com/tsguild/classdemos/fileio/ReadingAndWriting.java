/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ahill
 */
public class ReadingAndWriting {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Scanner reader = new Scanner(
                            new BufferedReader(
                                    new FileReader("Thing.txt")));
        
        PrintWriter author = new PrintWriter(
                                    new FileWriter("Thing2.txt"));
        
//        // Copy the file to a new location!!
//        while(reader.hasNextLine()){
//            author.println(reader.nextLine());
//        }
//        
//        author.close();

        
        String stuffInFile = "";
        while(reader.hasNextLine()){
            stuffInFile = stuffInFile + reader.nextLine() + "\n";
        }

        reader.close();
        PrintWriter writer = new PrintWriter(
                                new FileWriter("Thing.txt"));
        
        writer.print(stuffInFile);
        writer.println("Here's some more things appended.");
        
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Here, write some stuff: ");
        writer.println(consoleInput.nextLine());
        writer.println(consoleInput.nextLine());
        writer.println(consoleInput.nextLine());
        
        writer.flush();
        writer.close();
        
    }
    
}
