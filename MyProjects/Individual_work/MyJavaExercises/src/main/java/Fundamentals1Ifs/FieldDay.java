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
public class FieldDay {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        String Baggins = "Baggins";
        String Dresdin = "Dresdin";
        String Howl = "Howl";
        String Potter = "Potter";
        String Vimes = "Vimes";
        
        
        System.out.println("Please provide your last name:");
        String userName = inputReader.nextLine();
        
        if(userName.compareToIgnoreCase(Baggins)<0){
        System.out.println("Go to team 'Red Dragons'");
        }
        else if(userName.compareToIgnoreCase(Dresdin)<0){
        System.out.println("Go to team 'Dark Wizards'");
        }
        else if(userName.compareToIgnoreCase(Howl)<0){
        System.out.println("Go to team 'Moving Castles'");
        }
        else if(userName.compareToIgnoreCase(Potter)<0){
        System.out.println("Go to team 'Golden Snitches'");
        }
        else if(userName.compareToIgnoreCase(Vimes)<0){
        System.out.println("Go to team 'Night Guards'");
        }
        else{
        System.out.println("Go to team 'Black Holes'");        
        }
    }
}
