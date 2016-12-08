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
public class KeychainsForSale {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("CHRIS FLOYD'S BEST EVER KEYCHAIN SHOP!!");
        System.out.println(" ");
        int userSelection;
        do {
            System.out.println("1. Add keychains to order");
            System.out.println("2. Remove keychains from order");
            System.out.println("3. View current order");
            System.out.println("4. Checkout");
            System.out.println(" ");
            System.out.println("Please enter your choice: ");
            userSelection = userInput.nextInt();
            switch (userSelection) {
                case 1:
                    addKeychains();
                    break;
                case 2:
                    removeKeychains();
                    break;
                case 3:
                    viewOrder();
                    break;
                case 4:
                    checkout();
                    break;
                default:
                    System.out.println("YOU DIDN'T GIVE A VALID OPTION!!!");
            }
            System.out.println(" ");
            System.out.println(" ");
        } while (userSelection != 4);
    }
    
    public static void addKeychains(){
        System.out.println("ADD KEYCHAINS");
    }
    
    public static void removeKeychains(){
        System.out.println("REMOVE KEYCHAINS");
    }
    
    public static void viewOrder(){
        System.out.println("VIEW ORDER");
    }
    
    public static void checkout(){
        System.out.println("CHECKOUT");
    }

}
