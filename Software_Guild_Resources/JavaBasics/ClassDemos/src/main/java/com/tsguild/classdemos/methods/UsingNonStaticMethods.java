/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.methods;

/**
 *
 * @author ahill
 */
public class UsingNonStaticMethods {
    
    public static void main(String[] args) {
        
        // Because it is not static
        // This is illegal:
//        Bee.buzz();

        // But I CAN create a bee, and then use it's behaviours
        Bee littleDrone = new Bee();
        littleDrone.buzz();
        
        littleDrone.makeHoney(3);
        // Don't lose the honey!
        // Especiall drone honey, it is basically .... impossible
        String honeyJar = littleDrone.makeHoney(5);
        
        System.out.println("My honey: " + honeyJar);
        
        
    }
    
}
