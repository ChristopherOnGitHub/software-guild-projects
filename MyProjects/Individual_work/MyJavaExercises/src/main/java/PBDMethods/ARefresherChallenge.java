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
public class ARefresherChallenge {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Give a name to repeat: ");
        String nameGiven = userInput.nextLine();
        
            for(int i = 1; i<=10; i++){
                if((nameGiven.equals("Mitchell"))&&(i>=6)){    
                    break;
                }
                System.out.println(i+".) "+nameGiven);
            }
        }
        
    }
    
