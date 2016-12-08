/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDForLoops;

/**
 *
 * @author apprentice
 */
public class FizzBuzz {
    public static void main(String[] args) {
        
        int i;
        
        for(i=1 ; i<=100 ;i++){
            
            if((i%3==0)&&(i%5==0)){
                System.out.println("Fizz Buzz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
            
        }
    }
    
}