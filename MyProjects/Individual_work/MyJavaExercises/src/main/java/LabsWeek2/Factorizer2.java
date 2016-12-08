/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2;


public class Factorizer2 {
    public static void main(String[] args) {
        
        
        Factorizer2Methods Factorizer2Methods = new Factorizer2Methods();

        System.out.println("Choose a number you'd like to factor.");
        int userNumber = Factorizer2Methods.enterInt();
        int perfTracker = userNumber;
        
        Factorizer2Methods.factorizer(userNumber, perfTracker);
        
        
    }
    
}
