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
public class KeychainsRealUltimatePower {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("CHRIS FLOYD'S BEST EVER KEYCHAIN SHOP!!");
        System.out.println(" ");
        int userSelection;
        int numberKeychains = 0;
        double totalCost = 0;
        
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
                    numberKeychains=numberKeychains+addKeychains(numberKeychains);
                    System.out.println("You know have "+numberKeychains+" keychains");
                    totalCost=totalCost+10;
                    break;
                case 2:
                    removeKeychains(numberKeychains);
                    if(totalCost>0){
                        totalCost=totalCost-10;
                    }
                    numberKeychains=numberKeychains+removeKeychains(numberKeychains);
                    System.out.println("You now have "+numberKeychains+ " keychains");
                    System.out.println(" ");
                    break;
                case 3:
                    viewOrder(numberKeychains, totalCost);
                    break;
                case 4:
                    checkout(numberKeychains, totalCost);
                    break;
                default:
                    System.out.println("YOU DIDN'T GIVE A VALID OPTION!!!");
            }
            System.out.println(" ");
        } while (userSelection != 4);
        System.out.println("THANK YOU FOR BUYING OUR KEYCHAINS");
        
    }
    
    public static int addKeychains(int numberKeychains){
        System.out.println("ADD KEYCHAINS");
        int newKeychains = 1;
        return newKeychains;
    }
    
    public static int removeKeychains(int numberKeychains){
        System.out.println("REMOVE KEYCHAINS");
        int newKeychains = -1;
        if(numberKeychains<=0){
        newKeychains = 0;
        }
        return newKeychains;
    }
    
    public static void viewOrder(int numberKeychains, double totalCost){
        double shipping=5.00;
        int indvidShipping = numberKeychains;
        System.out.println("VIEW ORDER");
        System.out.println("You have "+numberKeychains+" in your basket.");
        double preTaxCost = totalCost +shipping + indvidShipping;
        totalCost = totalCost + shipping + indvidShipping;
        totalCost = totalCost + totalCost*0.0825;
        System.out.println("You have "+numberKeychains);
        System.out.println("There is a $5 flat shipping charge. Additional $1 per keychain.");
        System.out.println("You cost before tax is $ "+preTaxCost);
        System.out.println("Your total cost plus shipping is $"+totalCost);
        
        
        
    }
    
    public static void checkout(int numberKeychains, double totalCost){
        double shipping = 5.00;
        int indvidShipping = numberKeychains;
        System.out.println("CHECKOUT");
        System.out.println("Your order of "+numberKeychains+" keychains. Will ship soon.");
        totalCost = totalCost + shipping + indvidShipping;
        totalCost = totalCost + totalCost*0.0825;
        System.out.println("Your total cost plus shipping is $"+totalCost);
        System.out.println("Have a great day!");
    }

}
