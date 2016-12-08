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
 * @author apprentice
 */
public class Olympics {
    public static void main(String[] args) {
        Event KittenWeightLifting = new KittenWeightLifting();
        KittenWeightLifting.compete();
        
        Olympian eugene = new Olympian(KittenWeightLifting);
        
        ApplicationContext ctxFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

        Olympian fabio = (Olympian)ctxFactory.getBean("fabioTheUnderWaterWrestler");
     //   Olympian fabio = ctxFactory.getBean("fabioTheUnderWaterWrestler", Olympian.class);
        fabio.competeInEvent();
        
    }
}