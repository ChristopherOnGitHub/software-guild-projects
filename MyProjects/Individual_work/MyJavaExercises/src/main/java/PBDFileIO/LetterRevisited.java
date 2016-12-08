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


/**
 *
 * @author apprentice
 */
public class LetterRevisited {
    

    public static void main(String[] args) throws FileNotFoundException, IOException {




        PrintWriter writer = new PrintWriter(new FileWriter("Letter.txt"));
        
        String stuffInFile = "SUCCUCESSFUL VARIABLE WRITE";

        writer.println(stuffInFile);
        writer.println("THIS IS A VERY IMPORTANT MESSAGE");
        writer.println("THE MOST IMPORTANT YOU WILL EVER RECEIVE");
        writer.flush();
        writer.close();
    }
}