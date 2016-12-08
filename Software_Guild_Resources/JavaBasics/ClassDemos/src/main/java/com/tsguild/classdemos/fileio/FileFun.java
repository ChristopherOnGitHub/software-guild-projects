/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ahill
 */
public class FileFun {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String fileName = "Thing.txt";
        FileReader librarian = new FileReader(fileName);
        BufferedReader translator = new BufferedReader(librarian);
        Scanner prompter = new Scanner(translator);
        
        Scanner prompterEx = new Scanner(new BufferedReader(new FileReader(fileName)));
        
//        System.out.println(prompter.nextLine());
//        System.out.println(prompter.nextLine());
//        System.out.println(prompter.nextLine());
//        System.out.println(prompter.nextLine());
//        System.out.println(prompter.nextLine());
//        
        
        while(prompter.hasNextLine()){
            System.out.println(prompter.nextLine());
//            System.out.println(prompter.nextLine());
        }
        
//        Scanner prompterAgain = new Scanner(translator);
//        while(prompterAgain.hasNextLine()){
//            System.out.println(prompter.nextLine());
//        }

//        BufferedReader translatorAgain = new BufferedReader(librarian);
//        Scanner prompterAgain = new Scanner(translatorAgain);
//        while(prompterAgain.hasNextLine()){
//            System.out.println(prompter.nextLine());
//        }
        
        librarian.close(); // Have them put back the book

        FileReader librarianAgain = new FileReader(fileName);
        BufferedReader translatorAgain = new BufferedReader(librarianAgain);
        Scanner prompterAgain = new Scanner(translatorAgain);
        while(prompterAgain.hasNextLine()){
            System.out.println(prompterAgain.nextLine());
        }
        
    }
    
}
