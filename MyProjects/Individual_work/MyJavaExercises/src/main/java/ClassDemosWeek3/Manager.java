/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemosWeek3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class Manager extends Employee{
    
    List<Employee> directReports = new ArrayList<>();
    
    public Manager(List<Employee> directReports, int id, String name, double yearlySalary){
        super(name, id, yearlySalary);
        this.directReports = directReports;
    }
    
    public Manager(){
        super();
    }
    
    public void hire(Employee e){
        System.out.println("You're hired " + e.getName());
    }

    public void setDirectReports(List<Employee> directReports) {
        this.directReports = directReports;
    }

    public List<Employee> getDirectReports() {
        return directReports;
    }
    
    public void fire(Employee e){
        System.out.println("You're fired " + e.getName());
    }
    
    public String givePerformanceReview(Employee e){
        int workDone = e.doWork();
        if(workDone > 5){
            return "Good Job";
        }else{
            return "You Suck!";
        }
    }
    
    public void addDirectReport(Employee e){
        directReports.add(e);
    }
    
    @Override
    public int doWork(){
        int workDone=5;
        for (Employee e: directReports){
            workDone = workDone + e.doWork();
        }
        return workDone;
    }
           
}
