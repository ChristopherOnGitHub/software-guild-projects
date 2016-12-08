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
public class GettingMoreDataFromAFile {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);
        String x = userInput.next();

        Scanner fileReader = new Scanner(new BufferedReader(new FileReader(x)));
        String [] names = {fileReader.next(), fileReader.next(), fileReader.next()
        , fileReader.next(), fileReader.next()};
        int [] ages = {fileReader.nextInt(), fileReader.nextInt(), fileReader.nextInt()
        , fileReader.nextInt(), fileReader.nextInt()};            
//        names[0]=fileReader.next();
//        ages[0]=fileReader.nextInt();
//        names[1]=fileReader.next();
//        ages[1]=fileReader.nextInt();        
//        names[2]=fileReader.next();
//        ages[2]=fileReader.nextInt();
//        names[3]=fileReader.next();
//        ages[3]=fileReader.nextInt();
//        names[4]=fileReader.next();
//        ages[4]=fileReader.nextInt();        
        for (int i = 0; i < ages.length; i++) {
            System.out.println(names[i]);
            System.out.println(ages[i]);
        }

        
        
        
        
        
    }
}
