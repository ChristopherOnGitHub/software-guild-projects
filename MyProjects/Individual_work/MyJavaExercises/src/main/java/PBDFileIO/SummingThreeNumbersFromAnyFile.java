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
public class SummingThreeNumbersFromAnyFile {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a file add from:");
        String userFileToRead = userInput.next();
        Scanner fileReader = new Scanner(new BufferedReader(new FileReader(userFileToRead)));
        

        int a = fileReader.nextInt();
        int b = fileReader.nextInt();
        int c = fileReader.nextInt();
        int d = a+b+c;
        
        System.out.println(a+"+"+(b)+"+"+c+"="+d);         
    }
    
}
