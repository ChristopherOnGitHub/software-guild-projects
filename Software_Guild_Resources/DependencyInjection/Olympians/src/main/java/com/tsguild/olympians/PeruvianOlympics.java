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
public class PeruvianOlympics {
    
    public static void main(String[] args) {
        
        ApplicationContext springFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Olympian nigel = springFactory.getBean("nigel", Olympian.class);
        Olympian gwen = springFactory.getBean("gwen", Olympian.class);
        Olympian theo = springFactory.getBean("theodore", Olympian.class);
        Olympian reina = springFactory.getBean("reina", Olympian.class);
        
        System.out.println("Gwen is now competing...");
        String event = gwen.competeInEvent();
        System.out.println("She competed in " + event);
        
        System.out.println("Theo is now competing...");
        event = theo.competeInEvent();
        System.out.println("He competed in " + event);
        
        System.out.println("Reina is now competing...");
        event = reina.competeInEvent();
        System.out.println("She competed in " + event);
        
        System.out.println("Nigel is now competing...");
        event = nigel.competeInEvent();
        System.out.println("He competed in " + event);
    }
    
}
