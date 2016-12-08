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
public class Compnay {

    public static void main(String[] args) {

        Employee Employee = new Employee();

        ArrayList<Employee> myCompanyEmployees = new ArrayList<>();
        Employee bob = new Employee("Bob", 42, 42000.00);
        Manager lisa = new Manager();
        lisa.setId(2);
        lisa.setName("Lisa");
        lisa.setYearlySalary(80000.09);
        lisa.addDirectReport(bob);

        System.out.println("Bob drank coffee" + bob.doWork());

        SummerIntern james = new SummerIntern(66, "James", 0.0, true);
        james.getCoffee(bob);
        james.getCoffee(lisa);
        james.getCoffee(james);

        james.requestPerformanceReview(lisa);

        myCompanyEmployees.add(bob);
        myCompanyEmployees.add(lisa);
        myCompanyEmployees.add(james);
        rollCall(myCompanyEmployees);
        
        Employee stillLisa = lisa;
        System.out.println(stillLisa.getClass());
        
        Manager managerLisaAgain = (Manager)stillLisa;
        managerLisaAgain.fire(bob);
        
//        Manager sneakyBob = (Manager)bob;
//        sneakyBob.fire(stillLisa);
//        sneakyBob.fire(lisa);
//        sneakyBob.fire(managerLisaAgain);
        //bob can't do manager stuff
        
        
    }

    public static void rollCall(List<Employee> myCompanyEmployees) {
        for (Employee x : myCompanyEmployees) {
            
            System.out.println(x.getName()+" is in the roll call. He is a "+
                    x.getClass());
            if(x instanceof SummerIntern){
                System.out.println("...and is easily ignored.");
            }
            if(x.getClass().equals(Manager.class)){
                System.out.println("he's a manager and whatnot. asdf...");
            }
        }
    }

}
