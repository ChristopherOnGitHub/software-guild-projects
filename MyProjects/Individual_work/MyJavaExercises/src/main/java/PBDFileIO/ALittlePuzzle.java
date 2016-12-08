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
public class ALittlePuzzle {
    public static void main(String[] args) throws FileNotFoundException {
        
    Scanner fileReader = new Scanner(new BufferedReader(new FileReader("Secret.txt")));        
        
       String x = fileReader.nextLine();
       
        for (int i = 2; i < x.length(); i+=3) {
            System.out.print(x.charAt(i));
        }
    }
}
