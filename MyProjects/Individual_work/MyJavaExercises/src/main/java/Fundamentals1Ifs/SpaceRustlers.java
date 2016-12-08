/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamentals1Ifs;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SpaceRustlers {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;
        
        if(aliens > spaceships){
            System.out.println("Let's get going!!!");
        }
        if(spaceships > aliens){
            System.out.println("Who's gonna drive all the spaceships?");
        }
        
        if(spaceships == cows){
            System.out.println("We have EXACTLY enough spaceships for these cows.");
        }
        else if(cows > spaceships){
            System.out.println("We don't have enough spaceships for all these cows...");
        }
        else{
            System.out.println("We're gonna have some empty spaceships...");
        }
        
        if(aliens > cows){
            System.out.println("Hurrah, we've got the grub!"
                    + " Hamburger party on Alpha Centauri!!!");
        }
        else{
            System.out.println("The cows outnumber us! Looks like we're"
                    + " the hamburger now!");
        }
    }
    
}
