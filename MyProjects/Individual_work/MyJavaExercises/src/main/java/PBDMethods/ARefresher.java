/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDMethods;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ARefresher {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Give a name to repeat: ");
        String nameGiven = userInput.nextLine();
        
        if(nameGiven.equals("Mitchell")){
            for(int i = 1; i<=5; i++){
                System.out.println(i+".) "+nameGiven);
            }
        }else{
            for(int i = 1; i<=10; i++){
                System.out.println(i+".) " +nameGiven);
            }
        }
    }
    
}
