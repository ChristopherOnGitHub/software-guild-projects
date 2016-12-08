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
public class BasicArrays3 {

    public static void main(String[] args) {

        Random randGen = new Random();

        for (int x = 0; x < 1000; x++) {
            int[] RandomNumbers = {
            randGen.nextInt(89)+10, randGen.nextInt(89)+10, randGen.nextInt(89)+10,
            randGen.nextInt(89)+10, randGen.nextInt(89)+10, randGen.nextInt(89)+10,
            randGen.nextInt(89)+10, randGen.nextInt(89)+10, randGen.nextInt(89)+10,
            randGen.nextInt(89)+10, randGen.nextInt(89)+10, randGen.nextInt(89)+10,};
            int a = RandomNumbers[0];
            int b = RandomNumbers[1];
            int c = RandomNumbers[2];
            int d = RandomNumbers[3];
            int e = RandomNumbers[4];
            int f = RandomNumbers[5];
            int g = RandomNumbers[6];
            int h = RandomNumbers[7];
            int i = RandomNumbers[8];
            int j = RandomNumbers[9];
            int k = RandomNumbers[10];
            int l = RandomNumbers[11];
            System.out.print(a+"  ");
            System.out.print(b+"  ");
            System.out.print(c+"  ");
            System.out.print(d+"  ");
            System.out.print(e+"  ");
            System.out.print(f+"  ");
            System.out.print(g+"  ");
            System.out.print(h+"  ");
            System.out.print(i+"  ");
            System.out.print(j+"  ");
            System.out.print(k+"  ");
            System.out.println(l+"  ");
        }

    }

}
