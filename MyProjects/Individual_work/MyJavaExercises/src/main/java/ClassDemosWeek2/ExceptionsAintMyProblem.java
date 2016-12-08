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
public class ExceptionsAintMyProblem {
    public static void main(String[] args) throws FileNotFoundException {
        
     exceptionBoom();   
        
        
        
        
    }
    
    static public void exceptionBoom() throws FileNotFoundException{
        new FileReader ("FileThatDoesntExist.txt");
    }
    
    static public void exceptionCaught(){
        try {
            FileReader fileReader = new FileReader("FileThatDoesntExist.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("I PUT THEM OUT! DONT WORRY");            
        }
    }
    
}

