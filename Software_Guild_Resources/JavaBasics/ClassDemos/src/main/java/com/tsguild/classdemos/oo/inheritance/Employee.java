/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.oo.inheritance;

import java.util.Random;

/**
 *
 * @author ahill
 */
public class Employee {
   
    protected String name;
    private int id;
    private double yearlySalary;
    
    public Employee(){
        
    }
    
    public Employee(String name, int id, double yearlySalary){
        this.name = name;
        this.id = id;
        this.yearlySalary = yearlySalary;
    }

    public int doWork(){
        Random workGenerator = new Random();
        return workGenerator.nextInt(10);
    }
    
    public int drinkCoffee(String coffee){
        Random workGenerator = new Random();
        return workGenerator.nextInt(50);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
    
    
    
}
