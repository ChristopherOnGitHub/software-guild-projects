/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fundamentals1Ifs;

/**
 *
 * @author apprentice
 */
public class LlamasWhalesandDodosOhMy {
    public static void main(String[] args) {
    
    int llamas = 15;
    int whales = 20;
    int dodos = 0;
    
    if (dodos > 0){
            System.out.println("Egads! I thought dodos were extinct!");
    }
    if (dodos < 0){
            System.out.println("How can we have negative dodos?");
    }
    if (llamas > whales){
        System.out.println("Ha! Whales may be bigger, but llamas are better!");
    }
    if (llamas <= whales){
        System.out.println("Aw man, brawn over brains I guess. Whales beat llamas.");
    }
        System.out.println("There's been a huge increase in dodos due to cloning!!");
        dodos += 100;
        
    if ((whales + llamas)<(dodos)){
        System.out.println("I never thought I'd see the day dodos ruled the earth!");
    }
    
    llamas += 100;
    
    if ((llamas > whales) && (llamas > dodos)){
        System.out.println("I don't know how but llamas have come out ahead!");
    }
    
    } 
}
