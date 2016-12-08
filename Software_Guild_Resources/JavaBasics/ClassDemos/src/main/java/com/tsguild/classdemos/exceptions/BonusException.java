/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.exceptions;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahill
 */
public class BonusException {
    
    public static void main(String[] args) {
        
        try {
            BonusException bEx = new BonusException();
            bEx.boom();
        } catch (FileNotFoundException ex) {
            System.out.println("It exploded.");
        }
        
    }
    
    public void boom() throws FileNotFoundException{
        throw new FileNotFoundException("Haha, I made it explode");
    }
    
}
