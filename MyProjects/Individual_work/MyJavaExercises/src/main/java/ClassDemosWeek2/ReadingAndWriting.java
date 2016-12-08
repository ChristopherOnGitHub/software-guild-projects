/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemosWeek2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ReadingAndWriting {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Scanner reader = new Scanner(new BufferedReader(new FileReader("Thing.txt")));

        PrintWriter author = new PrintWriter(new FileWriter("Thing2.txt"));

//        // Copy the file to a new location!!
//        while(reader.hasNextLine()){
//            author.println(reader.nextLine());
//        }
//        
//        author.close();
        String stuffInFile = "";
        while (reader.hasNextLine()) {
            stuffInFile = stuffInFile + reader.nextLine();
        }

        reader.close();
        PrintWriter writer = new PrintWriter(new FileWriter("Thing.txt"));

        writer.println(stuffInFile);
        writer.println("Adding to the file");
        writer.println("More to add");
        writer.flush();
        writer.close();

    }

}
