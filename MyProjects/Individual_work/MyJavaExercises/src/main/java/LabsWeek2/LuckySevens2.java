/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2;


public class LuckySevens2 {
    public static void main(String[] args) {


LuckySevens2Methods LuckySevens2Methods = new LuckySevens2Methods();
       
        System.out.println("Welcome to Lucky Sevens! What is your starting bet? : $");
        double beginningBet = IOCalculator.getDoubleXInRange();
        LuckySevens2Methods.runGame(beginningBet);      

    }
}
