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
public class SummingThreeNumbersFromAFile {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner reader = new Scanner(new BufferedReader(new FileReader("3Numbers.txt")));
        
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        int d = a+b+c;
        
        System.out.println(a+"+"+(b)+"+"+c+"="+d);
        
        
    }
    
}
