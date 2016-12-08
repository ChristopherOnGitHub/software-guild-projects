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
public class BirthStones {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What month do you want a birthstone for?");
        int monthNumber = inputReader.nextInt();
        
            if(monthNumber==1){
            System.out.println("January's birthstone is Garnet.");
            }
        
            else if(monthNumber==2){
            System.out.println("February's birthstone is Amethyst.");
            }
            
            else if(monthNumber==3){
            System.out.println("March's birthstone is Aquamarine.");
            }
            
            else if(monthNumber==4){
            System.out.println("April's birthstone is Diamond.");
            }
            
            else if(monthNumber==5){
            System.out.println("May's birthstone is Emerald.");
            }
            
            else if(monthNumber==6){
            System.out.println("June's birthstone is Pearl.");
            }
            
            else if(monthNumber==7){
            System.out.println("July's birthstone is Ruby.");
            }
            
            else if(monthNumber==8){
            System.out.println("August's birthstone is Peridot.");
            }
            
            else if(monthNumber==9){
            System.out.println("September's birthstone is Sapphire.");
            }
            
            else if(monthNumber==10){
            System.out.println("October's birthstone is Opal.");
            }
            
            else if(monthNumber==11){
            System.out.println("November's birthstone is Topaz.");
            }
            
            else if(monthNumber==12){
            System.out.println("December's birthstone is Turquoise.");
            }
            
            else{System.out.println("That is not viable month number.");}
              
        
    }
    
    
}
