/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2;

/**
 *
 * @author apprentice
 */
public class Squares {
    public static void main(String[] args) {
        
        SquareCalculations bigSquare = new SquareCalculations (298.456, "bigSquare");
        SquareCalculations smallSquare = new SquareCalculations (2.0, "smallSquare");
        SquareCalculations medSquare = new SquareCalculations (45.37, "medSquare");
        
        System.out.println("What is the area of the medium sized square?"+medSquare.areaOfSquare());
        System.out.println("What if it had a slightly longer length?");
        System.out.println("Enter the amount you would like to add to the length");
        System.out.println("(Previously 45.37)");
        medSquare.enlargeSquare();
        System.out.println("Now it is: "+medSquare.areaOfSquare());
        System.out.println("Let's change it back");
        System.out.println("...");
        medSquare.returnOriginalSquare();
        System.out.println("Comparing the area of our three squares...");
        System.out.println(smallSquare.areaOfSquare()+" & "+medSquare.areaOfSquare()+
                " & "+bigSquare.areaOfSquare());
        
        
    }
    
}
