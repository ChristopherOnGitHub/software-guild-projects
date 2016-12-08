/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ahill
 */
public class WritingFun {
    
    public static void main(String[] args) throws IOException {
        
        String fileName = "Thing.txt";
        FileWriter scribe = new FileWriter(fileName);
        PrintWriter storyTeller = new PrintWriter(scribe);
        
        storyTeller.println("There once was a programmer named Jeeves..");
        storyTeller.println("Who would live upstairs in the eaves...");
        storyTeller.flush();// Yeah, you told me you'd write that. So do it.
        
        // Tell them to close up shop. It's good form.
        storyTeller.close();
        scribe.close();
        
    }
    
}
