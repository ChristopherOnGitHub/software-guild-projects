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
public class Skijumper {
    
    private Event event;
    
    public Skijumper(){
        event = new SkiJumpEvent();
    }
    
    public String competeInEvent(){
        return event.compete();
    }
    
}
