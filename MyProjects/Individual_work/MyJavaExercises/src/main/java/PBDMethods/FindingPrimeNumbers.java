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
public class FindingPrimeNumbers {
    public static void main(String[] args) {
        for (int n=2; n<=100; n++){
            if(primeCalc(n)==true){
                System.out.println(n);
            }
            
        }
            
        
    }
    
    public static boolean primeCalc(int n){
        boolean prime = true;
        int factorTracker=0;
        
        for(int i=2; i<n; i++){
        if(n%i==0){
            factorTracker++;
        }
        }

        if(factorTracker>0){
            prime = false;
        }
        return prime;
    }
    
}
