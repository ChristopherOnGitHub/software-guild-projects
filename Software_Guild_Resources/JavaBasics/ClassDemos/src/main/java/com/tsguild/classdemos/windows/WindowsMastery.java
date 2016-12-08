/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.windows;

import java.util.Scanner;

/**
 *
 * @author ahill
 */
public class WindowsMastery {
    
    public static void main(String[] args) {
        
        // naming convention for constants is ALL_CAPS
        final double GLASS_PRICE_PER_SQ_FT = 3.50;
        final double TRIM_PRICE_PER_FT = 2.5;
        
        
        double width;
        double height;
        double area; 
        double perimeter;
        
        double windowGlassCost;
        double windowTrimCost;
        double windowTotalCost;
        
        // Declare & Init my Scanner
        Scanner userInput = new Scanner(System.in);
        
        // Hardcode for a bit to write out program logic.
//        width = 12;
//        height = 10;
        
        System.out.println("What is the width (in ft) of the window: ");
        String widthInput;
        widthInput = userInput.nextLine();
        width = Double.parseDouble(widthInput);
        
        System.out.println("What is the height (in ft) of the window: ");
        String heightInput = userInput.nextLine();
        height = Double.parseDouble(heightInput);
        
        area = width * height;
        perimeter = 2 * (width + height);
        
        System.out.print("The perimenter of your glorious new window is: ");
        System.out.println(perimeter + " ft.");
        
        System.out.print("The area is: ");
        System.out.println(area + " sqft.");
        
        windowGlassCost = area * GLASS_PRICE_PER_SQ_FT;
        windowTrimCost = perimeter * TRIM_PRICE_PER_FT;
        
        System.out.print("The glass cost (" 
                + GLASS_PRICE_PER_SQ_FT
                +"$ / sqft)of your window is: ");
        System.out.println(windowGlassCost + "$");
        
        System.out.print("The trim cost (" 
                + TRIM_PRICE_PER_FT
                +"$ / ft)of your window is: ");
        System.out.println(windowTrimCost + "$");
        
        windowTotalCost = windowGlassCost + windowTrimCost;
        System.out.println("The total will be: $" + windowTotalCost);
        System.out.println("Please make checks payable to \"The Software Guild\"");
        
    }
    
    
}
