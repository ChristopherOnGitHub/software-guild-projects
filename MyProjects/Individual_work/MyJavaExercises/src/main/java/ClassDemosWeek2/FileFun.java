/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemosWeek2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class FileFun {
    public static void main(String[] args) throws FileNotFoundException {
        
        String fileName = "Thing.txt";
        FileReader librarian = new FileReader(fileName);
        BufferedReader translator = new BufferedReader(librarian);
        Scanner prompter = new Scanner(translator);
        
//        Scanner prompterEx = new Scanner(new BufferedReader(new FileReader("Thing.txt")));
        
        while(prompter.hasNextLine()){
            System.out.println(prompter.nextLine());
        }
        
        FileReader librarianAgain = new FileReader(fileName);
        BufferedReader translatorAgain = new BufferedReader(librarianAgain);
        Scanner prompterAgain = new Scanner(translatorAgain);
        while(prompterAgain.hasNextLine()){
            System.out.println(prompterAgain.nextLine());

        }
        
    }
    
}
