/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDRecords;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class GettingDataFromAFile {
    public static void main(String[] args) throws FileNotFoundException {
        
        
        Scanner fileReader = new Scanner(new BufferedReader(new FileReader("dogs.txt")));
        String [] doggers = {fileReader.next(), fileReader.next()};
        int [] doggoAge = {fileReader.nextInt(), fileReader.nextInt()};
        double [] doggoWeight = {fileReader.nextDouble(), fileReader.nextDouble()};
        
        System.out.println("First doggie: "+doggers[0]+" "+doggoAge[0]+" "+doggoWeight[0]);
        System.out.println("Second doggie: "+doggers[1]+" "+doggoAge[1]+" "+doggoWeight[1]);
        
        
    }
}
