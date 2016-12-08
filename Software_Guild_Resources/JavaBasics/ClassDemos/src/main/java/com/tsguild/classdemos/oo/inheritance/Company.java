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
public class Company {
    
    public static void main(String[] args) {
        
        
        Employee bob = new Employee("Bob", 42, 42000.01);
        System.out.println("Meet " + bob.getName());
        System.out.println("He makes " + bob.getYearlySalary() + " per annum");
        
        Manager lisa = new Manager();
        lisa.setId(2);
        lisa.setYearlySalary(80000);
        lisa.setName("Lisa");
        lisa.addDirectReport(bob);
        
        System.out.println("Hey Bob, do your work!");
        System.out.println(bob.doWork() + " hrs of work complete.");
        
        System.out.println("Hey Lisa, do YOUR work!");
        System.out.println(lisa.doWork() + " hrs of work complete.");
        
        SummerIntern james = new SummerIntern(true, "James", 66);
        System.out.println("Hey James, stop slacking - get to work!!");
        System.out.println(james.doWork() + " hrs of work complete.");
        
        // James is VERY good at getting coffee.
        // Remember, get Coffee can be done for ANY employee
        james.getCoffee(bob); // He can get it for bob, because bob IS an Employee
        james.getCoffee(lisa); // And for Lisa, tho a Manager, is-a Employee
        james.getCoffee(james); // And even for himself! As a SummerIntern is-a Employee
        
        // James wants to request a performance review (as is his right as an Intern!)
//        james.requestPerformanceReview(bob); // Can't do this bob is-a Employee, but not a Manager
//        james.requestPerformanceReview(james); // Can't do this, james is-a Employee, but not a Manager
        james.requestPerformanceReview(lisa); // Only LISA is a Manager
        
        List<Employee> myCompanyEmployees = new ArrayList<>();
        myCompanyEmployees.add(bob);
        myCompanyEmployees.add(lisa);
        myCompanyEmployees.add(james);
        rollCall(myCompanyEmployees);
        
        Employee stillLisa = lisa;
        System.out.println(stillLisa.getClass());
        
//        Manager managerLisaAgain = stillLisa;
        Manager managerLisaAgain = (Manager)stillLisa;
        managerLisaAgain.fire(bob);
        
//        Manager sneakyBob = (Manager)bob;
//        sneakyBob.fire(lisa);
    }
    
    public static void rollCall(List<Employee> employees){
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            if(e.getClass().equals(Manager.class)){
                System.out.print("Mgr. ");
            }
            
            if(e instanceof SummerIntern){
                System.out.print("Minion ");
            }
            
            System.out.println(employees.get(i).getName() + " reporting for duty!");
        }
    }
    
}
