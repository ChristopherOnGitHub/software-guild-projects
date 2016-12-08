/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDArrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ThereOrNot{
    public static void main(String[] args) {
        
    Scanner userInput= new Scanner(System.in);
    Random randGen = new Random();
    ArrayList<Integer> x = new ArrayList();
    
        for (int i = 0; i < 10; i++) {
            x.add(randGen.nextInt(50)+1);
        }
        System.out.println(x);
        System.out.println("Number to search for: ");
        int y = userInput.nextInt();
    
        if(x.contains(y)){
            System.out.println(y+" is in the array.");
        }else if(!x.contains(y)){
            System.out.println(y+" is not int the array.");
        }
    }
}
