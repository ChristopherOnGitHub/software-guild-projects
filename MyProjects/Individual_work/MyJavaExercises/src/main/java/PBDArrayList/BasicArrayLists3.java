/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class BasicArrayLists3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> x = new ArrayList();
        Random randGen = new Random();
        
        for (int i = 0; i < 1000; i++) {
            x.add(randGen.nextInt(90)+10);
        }
        
        for (int i = 1; i < x.size(); i++) {        
        System.out.print(x.get(i)+", ");
        if(i%20==0){
            System.out.println("");
        }
        }
    }
    
}
