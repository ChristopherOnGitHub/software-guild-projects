/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDFileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author apprentice
 */
public class SimpleFileInput {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Scanner reader = new Scanner(new BufferedReader(new FileReader("name.txt")));
        
        System.out.println("Your name is "+reader.nextLine());   
       
        
    }
    
}
