/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class SquareCalculations {
    
    Scanner userInput = new Scanner(System.in);
    public double squareLength;
    private final String squareName;

    SquareCalculations(double squareLength, String squareName) {
        this.squareLength = squareLength;
        this.squareName = squareName;
    }

    public double areaOfSquare() {
        double area = squareLength * squareLength;
        return area;
    }

    public double enlargeSquare() {
        double x = userInput.nextDouble();
        this.squareLength = squareLength + x;
        return squareLength;
    }

    public double returnOriginalSquare() {
        if (squareName.equals("medSquare")) {
            this.squareLength = 45.37;
        } else if (squareName.equals("bigSquare")) {
            this.squareLength = 298.456;
        } else if (squareName.equals("smallSquare")) {
            this.squareLength = 2.3;
        }
        return squareLength;
    }

}
