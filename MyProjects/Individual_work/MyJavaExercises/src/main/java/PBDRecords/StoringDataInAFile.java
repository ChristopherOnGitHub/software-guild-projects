/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDRecords;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author apprentice
 */
public class StoringDataInAFile {

    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);

        PrintWriter writer = new PrintWriter(new FileWriter("Cars.txt"));
        System.out.println("Car 1");
        System.out.print("    Make:");
        String car1Make = userInput.next();
        System.out.print("    Model:");
        String car1Model = userInput.next();
        System.out.print("    Year:");
        int car1Year = userInput.nextInt();
        System.out.print("    License:");
        String car1PlateNumber = userInput.next();
        System.out.println(" ");
        /////////
        System.out.println("Car 2");
        System.out.print("    Make:");
        String car2Make = userInput.next();
        System.out.print("    Model:");
        String car2Model = userInput.next();
        System.out.print("    Year:");
        int car2Year = userInput.nextInt();
        System.out.print("    License:");
        String car2PlateNumber = userInput.next();  
        System.out.println(" ");
        /////////
        System.out.println("Car 3");
        System.out.print("    Make:");
        String car3Make = userInput.next();
        System.out.print("    Model:");
        String car3Model = userInput.next();
        System.out.print("    Year:");
        int car3Year = userInput.nextInt();
        System.out.print("    License:");
        String car3PlateNumber = userInput.next(); 
        System.out.println(" ");
        /////////
        System.out.println("Car 4");
        System.out.print("    Make:");
        String car4Make = userInput.next();
        System.out.print("    Model:");
        String car4Model = userInput.next();
        System.out.print("    Year:");
        int car4Year = userInput.nextInt();
        System.out.print("    License:");
        String car4PlateNumber = userInput.next();
        System.out.println(" ");
        /////////
        System.out.println("Car 5");
        System.out.print("    Make:");
        String car5Make = userInput.next();
        System.out.print("    Model:");
        String car5Model = userInput.next();
        System.out.print("    Year:");
        int car5Year = userInput.nextInt();
        System.out.print("    License:");
        String car5PlateNumber = userInput.next();        
        
        
        
        writer.println(car1Make +" "+car1Model +" "+ car1Year +" "+ car1PlateNumber);
        writer.println(car2Make +" "+ car2Model +" "+ car2Year +" "+ car2PlateNumber);
        writer.println(car3Make +" "+ car3Model +"  "+ car3Year +" "+ car3PlateNumber);
        writer.println(car4Make +" "+ car4Model +" "+ car4Year +" "+ car4PlateNumber);
        writer.println(car5Make +" "+ car5Model +" "+ car5Year +" "+ car5PlateNumber);
        writer.flush();
        writer.close();

    }

}
