/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemosWeek3;

/**
 *
 * @author apprentice
 */
public class Employee {
    protected String name;
    private int id;
    private double yearlySalary;
    
    public Employee(){
        
    }

    public Employee(String name, int id, double yearlySalary) {
        this.name = name;
        this.id = id;
        this.yearlySalary = yearlySalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
    
    public int drinkCoffee(String coffee){
        int work = 7;
        return work;
    }
    
    public int doWork(){
        int work = 3;
        return work;
    }
    

    
}
