/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.oo.inheritance;

/**
 *
 * @author ahill
 */
public class SummerIntern extends Employee {
    
    private boolean hireable;
    
    public SummerIntern(){
        super();
    }
    
    public SummerIntern(boolean hireable, String name, int id){
        super(name, id, 0); // Interns don't get paid! Their salary is hardcoded to 0!
        this.hireable = hireable;
    }
    
    public String getCoffee(Employee e){
        System.out.println("Here ya go "+ e.getName());
        e.drinkCoffee("coffee");
        return "coffee";
    }
    
    public void requestPerformanceReview(Manager m){
        System.out.println("Hey boss, it's "+ this.name);
        System.out.println("How am I doing, boss?!");
        String myReview = m.givePerformanceReview(this);
        System.out.println(m.getName() + " thinks I am doing:");
        System.out.println(myReview);
    }
    
    
    @Override
    public int doWork(){
        return 1;
    }
    
}
