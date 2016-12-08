/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.methods;

import java.util.Random;

/**
 *
 * @author ahill
 */
public class StaticMethods {

    public static String randimalizer() {
        Random r = new Random();
        String animal = "";

        switch (r.nextInt(9)) {
            case 1:
                animal = "Llama";
                break;
            case 2:
                animal = "JackRabbit";
                break;
            case 3:
                animal = "Orca";
                break;
            case 4:
                animal = "Pangolin";
                break;
            case 5:
                animal = "Bull Terrier";
                break;
            case 6:
                animal = "Emu";
                break;
            case 7:
                animal = "Sugar Glider";
                break;
            case 8:
                animal = "Emperor Penguin";
                break;
            default:
                animal = "Pternadon";
        }

        return animal;
    }

}
