/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemos;

/**
 *
 * @author apprentice
 */
public class Loops { 
    public static void main(String[] args) {
        
        boolean llamasAreAwesome = true;
        
        do{
            System.out.println("Llamas are AWESOME!!!");
            llamasAreAwesome = false;
        }while(llamasAreAwesome);
        
        int counter = 0;
        while(true){
            System.out.println("Llamas are still awesome " + counter);
            counter++;
            
            if(counter>10)
                break;
        }
        
        for(int i = 0; i <= 10; i++){
            System.out.println("Times I've told you llamas are awesome: " + i);
        }
        
        for(int i = 0; i <= 10; i++){
            if(i % 2 == 1){
                continue;
            }
            System.out.println("Times I've told you llamas are awesome: " + i);
        }
    }
    
}
