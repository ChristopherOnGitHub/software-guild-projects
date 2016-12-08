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
public class BasicArrayLists2 {

    public static void main(String[] args) {

        Random randGen = new Random();

        ArrayList<Integer> x = new ArrayList();

        x.add(randGen.nextInt(100));
        x.add(randGen.nextInt(100));
        x.add(randGen.nextInt(100));
        x.add(randGen.nextInt(100));
        x.add(randGen.nextInt(100));
        x.add(randGen.nextInt(100));
        x.add(randGen.nextInt(100));
        x.add(randGen.nextInt(100));
        x.add(randGen.nextInt(100));
        x.add(randGen.nextInt(100));

        System.out.println("Random Number ArrayList: " + x);

    }

}
