/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.olympians;

/**
 *
 * @author apprentice
 */
public class NightTimeDiscGolfing implements Event{
    
    @Override
    public String compete(){
        System.out.println("so... dark...");
        return "NightTimeDiscGolfing";
    }
    
}
