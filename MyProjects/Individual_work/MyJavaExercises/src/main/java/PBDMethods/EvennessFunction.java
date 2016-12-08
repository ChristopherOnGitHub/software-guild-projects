/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDMethods;

/**
 *
 * @author apprentice
 */
public class EvennessFunction {
    public static void main(String[] args) {
        int n;
        boolean soEven;
        boolean isDivisibleBy3;
        for (n=1;n<=20;n++){
            System.out.print(n);
            if(isEven(n)&&isDivisibleBy3(n)){
                System.out.println("<=");
            }
            else if(isDivisibleBy3(n)){
                System.out.println("=");
            }else if(isEven(n)){
                System.out.println("<");
            }else{
                System.out.println(" ");
            }
        }
         
    }
    
    public static boolean isEven(int n){
        boolean soEven = false;
        if(n%2==0){
            soEven=true;
        }
        return soEven;
    }
    
    public static boolean isDivisibleBy3(int n){
        boolean diviThree = false;
        
        if(n%3==0){
            diviThree=true;
        }
        return diviThree;
    }
    
}
