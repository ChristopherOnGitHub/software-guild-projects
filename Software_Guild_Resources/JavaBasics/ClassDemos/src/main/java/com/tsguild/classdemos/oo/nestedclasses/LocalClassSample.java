/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.oo.nestedclasses;

import java.util.Random;

/**
 *
 * @author ilyagotfryd
 */
public class LocalClassSample {
    public static void main(String[] args) {
        
        class Die
        {
            public int roll()
            {
                Random rnd = new Random();
                return rnd.nextInt(6)+1;
            }
        }
        
        Die die = new Die();
        
        System.out.println("Single roll:" + die.roll());
        
    }
    
    public static void Foo()
    {
        // the Die class is not accessible outsied of psvm
       // Die die = new Die();
    }
    
}
