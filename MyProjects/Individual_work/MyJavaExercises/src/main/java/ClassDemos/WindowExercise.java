/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemos;
    
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class WindowExercise {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner (System.in);
        
        final double GLASS_PRICE_PER_SQ_FT = 3.50;
        final double TRIM_PRICE_PER_FT = 2.25;
        double windowHeight;
        double windowWidth;
        
        
        System.out.println("What is the height of the window?");
        String heightInput = inputReader.nextLine();
        windowHeight = Double.parseDouble(heightInput);
        
        
        System.out.println("What is the width of the window?");
        String widthInput = inputReader.nextLine();
        windowWidth = Double.parseDouble(widthInput);
        
        double area = (windowHeight * windowWidth);
        double perimeter = ((windowHeight*2) + (windowWidth*2));
        double windowCost = (area * GLASS_PRICE_PER_SQ_FT);
        double trimCost = (perimeter * TRIM_PRICE_PER_FT);
        
        System.out.println("Area of window is " + area +"sqft");
        System.out.println("Perimeter of trim for window is "+ perimeter + "ft");
        System.out.println("The final cost of your window is $" + windowCost);
        System.out.println("The final cost of your trim is $" + trimCost);
        System.out.println("____________________________________________");
        System.out.println("The current price of glass is $" 
                + GLASS_PRICE_PER_SQ_FT + "/sqft");
        System.out.println("The current price of trim is $" 
                + TRIM_PRICE_PER_FT + "/ft");
        System.out.println("   ");
        
        
        
        
    }
    
}
