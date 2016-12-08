/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.oo.stuff;

import com.tsguild.classdemos.oo.stuff.Llama.LlamaSpit;
import com.tsguild.classdemos.oo.stuff.Llama.LlamaThing;

/**
 *
 * @author apprentice
 */
public class LlamaFarm {
    
    public Llama mascotLlama;

    public static void main(String[] args) {
        Llama[] llamaHerd = new Llama[10];
        
        for (int i = 0; i < 10; i++) {

            llamaHerd[i] = new Llama("No White");
            Llama noWhite = llamaHerd[i];
            noWhite.setAge(10);
            System.out.println(noWhite.getName() + " is " + noWhite.getAge() + " yrs old");
            noWhite.spit();
        }
        
        
        String llamaName = "Bubbles";
        Llama bubbleLlama = new Llama(llamaName);
        llamaName = "Joe";
        
        System.out.println(bubbleLlama.getName());
     
        
        LlamaFarm myLlamaFarm = new LlamaFarm();
        myLlamaFarm.mascotLlama = bubbleLlama;
        
        System.out.println(myLlamaFarm.mascotLlama.getName());
        
        LlamaSpit bubbleSpit = bubbleLlama.new LlamaSpit();
        LlamaThing thing = new Llama.LlamaThing();
        
        // This is an anonymous class!
        Llama ninjaLlama = new Llama(){
            public void spit(){
                System.out.println("Ptooey!!!!!!!!!!!!!!!!!");
            }
        };
    }
}
