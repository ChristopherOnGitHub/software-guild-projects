/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdlibrary.app;

import com.tsguild.dvdlibrary.ops.DVDController;
import java.io.IOException;

/**
 *
 * @author apprentice
 */
public class DVDapp {
    public static void main(String[] args) throws IOException {
        
        DVDController DVDController = new DVDController();
        
        DVDController.runApplication();
        
        
    }
    
}
