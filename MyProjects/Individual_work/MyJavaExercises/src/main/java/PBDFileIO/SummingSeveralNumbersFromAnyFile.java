/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDFileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SummingSeveralNumbersFromAnyFile {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a file add from:");
        String userFileToRead = userInput.next();
        Scanner fileReader = new Scanner(new BufferedReader(new FileReader(userFileToRead)));
        int x=0;
        
    while(fileReader.hasNextInt()){
        x = x + fileReader.nextInt();
    }
    
        System.out.println(x);
    
    }
    
}
