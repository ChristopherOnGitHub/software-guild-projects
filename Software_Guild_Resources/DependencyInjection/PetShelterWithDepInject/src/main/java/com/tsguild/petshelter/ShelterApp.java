/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelter;

import com.tsguild.petshelter.ops.ShelterController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ahill
 */
public class ShelterApp {

    public static void main(String[] args) {

        ApplicationContext springFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        ShelterController controller = springFactory.getBean("controller", ShelterController.class); // checks the appcontext file for a matching bean & gets it
        controller.run();

    }

}
