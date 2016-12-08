/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.javabasics.interfaces;

/**
 *
 * @author ahill
 */
public class Tank implements Driveable{
    private int currentFuel;
    private int mpg;
    private String model;
    
    public boolean drive(int numMiles){
        return true;
    }
}
