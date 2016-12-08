/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDArrays;
import java.util.Random;


/**
 *
 * @author apprentice
 */
public class BasicArrays2 {
    public static void main(String[] args) {
        
        Random randGen = new Random();
        
        int[] RandomNumbers = {
        randGen.nextInt(99), randGen.nextInt(99), randGen.nextInt(99), randGen.nextInt(99), 
        randGen.nextInt(99), randGen.nextInt(99), randGen.nextInt(99), randGen.nextInt(99), 
        randGen.nextInt(99), randGen.nextInt(99)};
        
        for(int x=0; x<RandomNumbers.length; x++){
            int y = RandomNumbers[x];
            System.out.println((x+1)+". "+y);
        }
        
    }
    
}
