/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDArrays;

/**
 *
 * @author apprentice
 */
public class BasicArrays1 {
    public static void main(String[] args) {
        
        int[] AnArray = {
        -113, -113, -113, -113, -113, -113, -113, -113, -113, -113
    };
        
        for (int i=0; i<AnArray.length; i++){
            int x = AnArray[i];
            System.out.println((i+1) + ")   " + x);
        }
        
    }
    
}
