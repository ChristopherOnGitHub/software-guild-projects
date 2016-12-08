/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author ahill
 */
public class ExceptionsGoBoom {

    public static void main(String[] args) {

        try {

            System.out.println("We are going to try to open a file that doesn't exist...");
            new FileReader("FileThatDoesntExist.txt");
            System.out.println("And if we get here, everything has changed ...");

        } catch(FileNotFoundException e){

            System.out.println("FileNotFoundException occured.");
            System.out.println("\nThe Message:");
            System.out.println(e.getMessage());
//            System.out.println("\nThe stack trace...");
//            System.out.println(e.toString());
        } catch(NullPointerException e){

            System.out.println("This one shouldn't really happen...");
            System.out.println("But if a NullPointer DID happen, this is the code we would run..");
        }finally{

            System.out.println("And then this runs...");
        }

    }

}
