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
public class CopyingArrayLists {
    public static void main(String[] args) {
        Random randGen = new Random();
        ArrayList<Integer> x = new ArrayList();
        ArrayList<Integer> y = new ArrayList();
        
        for (int i = 0; i < 15; i++) {
            int z = randGen.nextInt(100);
            x.add(z);
            y.add(z);
        }
        
        
        x.set(x.size()-1, -7);
        y.set(y.size()-1, randGen.nextInt(100));
        
        System.out.println(x);
        System.out.println(y);
    }
    
}
