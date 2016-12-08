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
public class VowelCapitalization {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);

        System.out.println("CHOOSE A FILE TO READ");
        String x = userInput.nextLine();

        Scanner fileReader = new Scanner(new BufferedReader(new FileReader(x)));

        while (fileReader.hasNextLine()) {
            String a = fileReader.nextLine();
            
		char[] charArray = a.toCharArray();
		for (char output : charArray) {
                    switch(output){
                        case 'i':
                            output = 'I';
                            break;
                        case 'a':
                            output = 'A';
                            break;
                        case 'o': 
                            output = 'O';
                            break;
                        case 'u': 
                            output = 'U';
                            break;
                        case 'e': 
                            output = 'E';
                            break;
                    }
			System.out.print(output);
                }
                
        }
    }
}