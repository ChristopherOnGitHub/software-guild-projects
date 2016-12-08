/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemosWeek2;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author apprentice
 */
public class ExceptionsGoBoom {
    public static void main(String[] args) {
       
    try{    
       new FileReader("FileThatDoesntExist.txt");
    } catch(FileNotFoundException e){
        System.out.println("FileNotFoundException occured.");
        System.out.println(e.getMessage());
        System.out.println("The stack trace...");
        System.out.println(e.getStackTrace().toString());
    }finally{
        System.out.println("Finally, this will run.");
    }
    
    }
    
    
}
