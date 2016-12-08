/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2;

/**
 *
 * @author apprentice
 */
public class Trucks {

    public static void main(String[] args) {

        TruckClass Truck1 = new TruckClass(2015, "Toyota", "Tacoma", 28.56, false);
        TruckClass Truck2 = new TruckClass(1998, "GMC", "Sierra", 18.45, false);
        TruckClass Truck3 = new TruckClass(2002, "Chevrolet", "Silverado", 12.4, true);
        TruckClass Truck4 = new TruckClass(2010, "Ford", "F-350", 10, true);
        TruckClass Truck5 = new TruckClass(2009, "Dodge", "RAM", 24.44, false);
        
        System.out.println(Truck1.returnTruckMake() +", "+Truck2.returnTruckMake()+", "
        +Truck3.returnTruckMake()+", "+Truck4.returnTruckMake()+", "+Truck5.returnTruckMake());
        
        System.out.println((Truck1.returnTruckModel())+", "+
                          (Truck2.returnTruckModel())+", "+  
                          (Truck3.returnTruckModel())+", "+  
                          (Truck4.returnTruckModel())+", "+  
                          (Truck5.returnTruckModel())); 
        System.out.println(" ");
        ///////
        System.out.println("As technology gets better, bigger trucks can get better fuel economy:");
        System.out.println((Truck2.returnTruckModelYear())+(Truck2.returnTruckMake())+(Truck2.returnTruckMPG()));
        System.out.println((Truck1.returnTruckModelYear())+(Truck1.returnTruckMake())+(Truck1.returnTruckMPG()));
        System.out.println(" ");
        ///////
        System.out.println("A truck that is not lifted can be lifted.");
        System.out.println("The Toyota Tacoma is lifted: "+Truck1.returnTruckIsLifted());
        System.out.println("Run the 'liftTruck()' function");
        Truck1.liftTruck();
        System.out.println("The Toyota Tacoma is lifted: "+Truck1.returnTruckIsLifted());
        System.out.println(" ");
        ///////
        System.out.println("Through a complex and imaginary process I have determined 'Truck3' "
                + "is the most qualified to 'vroom()'");
        Truck3.vroom();
        

    }
}
