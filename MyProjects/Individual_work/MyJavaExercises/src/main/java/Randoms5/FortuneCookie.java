/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Randoms5;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class FortuneCookie {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        Random randGen = new Random();
        
        int fortune = randGen.nextInt(10);
        
        System.out.println("Your Geek Fortune: ");
        
        switch(fortune){
            case 0:
                System.out.print("Those aren't the droids you're looking for.");
                break;
            case 1:
                System.out.print("Never go in against a Scilian when death is on the line!");
                break;
            case 2:
                System.out.print("Goonies never say die.");
                break;
            case 3:
                System.out.print("With great power there must also come - great responsibility.");
                break;
            case 4:
                System.out.print("Never argue with the data.");
                break;
            case 5:
                System.out.print("Try not. Do, or do  not. There is no try.");
                break;
            case 6:
                System.out.print("You are a leaf on the wind, watch how you soar.");
                break;
            case 7:
                System.out.print("Do absolutely nothing, and it will be everything "
                        + "that you thought it could be.");
                break;
            case 8:
                System.out.print("Kneel before Zod.");
                break;
            case 9:
                System.out.print("Make it so.");
                break;
        }
    }
    
}
