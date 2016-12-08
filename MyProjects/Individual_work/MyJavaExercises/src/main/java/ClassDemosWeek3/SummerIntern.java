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
public class SummerIntern extends Employee{
    
    private boolean hireable;
    
    public SummerIntern(int id, String name, double yearlySalary, boolean hireable){
        super(name, id, 0.0);
        this.hireable = hireable;
    }
    
    public SummerIntern(){
        super();
    }
    
    public String getCoffee(Employee e){
        System.out.println("Here you go, "+ e.getName());
        e.drinkCoffee("coffee");
        return "coffee";
    }
    
    public void requestPerformanceReview(Manager m){
        System.out.println("Hey boss, it's me, "+this.name);
        System.out.println("How am I doing, boss?");
        m.givePerformanceReview(this);
    }
    
    @Override
    public int doWork(){
        return 1;
    }
    
}
