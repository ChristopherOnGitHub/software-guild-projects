/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDArrayList;

import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public class BasicArrayLists1 {

    public static void main(String[] args) {

        ArrayList<Integer> basic = new ArrayList();

        for (int i = 0; i < 10; i++) {

            basic.add(-113);

        }

        for (int i = 0; i < basic.size(); i++) {
            System.out.println("index " + (i + 1) + ": " + basic.get(i));
        }
    }

}
