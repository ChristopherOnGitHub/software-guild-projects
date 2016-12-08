/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.oo.inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahill
 */
public class Manager extends Employee {
    
    List<Employee> directReports = new ArrayList<>();
    
    // All args(properties) constructor 
    // would contain all of the properties of Manager
    // but ALSO all the properties of an Employee
    public Manager(List<Employee> directReports, int id, String name, double yearlySalary){
        super(name, id, yearlySalary); // this is still like new Manager(w/ parameters) WHICH MEANS THEY HAVE TO MATCH TYPE AND ORDER
        this.directReports = directReports;
    }
    
    
    public Manager(){
        // So if you don't specify it
        // there is a DEFAULT CALL to the parent constructor
        // via super() - so if you don't HAVE a no args constructor
        // you're going to get into trouble (if you don't specify)
        // It looks like this:
        super();
    }
    
    
    public void hire(Employee e){
        System.out.println("You're HIRED " + e.getName() + "!!!!!");
    }
    
    public void fire(Employee e){
        System.out.println("You're FIRED " + e.getName() + "!!!!!");
    }
    
    public String givePerformanceReview(Employee e){
        int workDone = e.doWork();
        if(workDone > 5){
            return "Great job!!!";
        } else{
            return "You should really do better. Or you'll be the next on the chopping block.";
        }
    }
    
    public void setDirectReports(List<Employee> directReports){
        this.directReports = directReports;
    }
    
    public List<Employee> getDirectReports(){
        return directReports;
    }
    
    public void addDirectReport(Employee e){
        directReports.add(e);
    }
    
    @Override
    public int doWork(){
        int workDone = 5;
        for (Employee e: directReports) {
            workDone = workDone + e.doWork();
        }
        return workDone;
    }
}
