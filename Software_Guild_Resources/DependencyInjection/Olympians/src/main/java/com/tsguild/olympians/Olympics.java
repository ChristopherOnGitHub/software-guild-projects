/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.olympians;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ahill
 */
public class Olympics {
    
    public static void main(String[] args) {
        
        // Old school instantiation way
        // Have to make an event first!
        Event kittenWeightLifting = new KittenWeightLifting();
//        kittenWeightLifting.compete();
        
        Olympian eugene = new Olympian(kittenWeightLifting);
        eugene.competeInEvent();
        
        
        ApplicationContext ctxFactory 
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        
//        Olympian fabio = (Olympian)ctxFactory.getBean("fabioTheUnderwaterWrestler");
        Olympian fabio = ctxFactory.getBean("fabioTheUnderwaterWrestler", Olympian.class);
        fabio.competeInEvent();
        
        
    }
    
}
