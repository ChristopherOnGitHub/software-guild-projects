
package PBDFileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DisplayingAFile {
    public static void main(String[] args) throws FileNotFoundException {
      
    System.out.println("What file would you like to print to the console?");    
    Scanner userInput = new Scanner(System.in);    
    String fileToRead = userInput.next();    
    Scanner fileReader = new Scanner(new BufferedReader(new FileReader(fileToRead)));
    
    while(fileReader.hasNextLine()){
        System.out.println(fileReader.nextLine());
    }
          
        
        
    }
    
}
