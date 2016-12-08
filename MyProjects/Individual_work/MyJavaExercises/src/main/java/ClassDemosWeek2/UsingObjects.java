/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemosWeek2;

/**
 *
 * @author apprentice
 */
public class UsingObjects {
    public static void main(String[] args) {

//       Dog dog = new Dog();
       Dog fido = new Dog("Fido", "Red", 20);
       Dog max = new Dog("Max", "Brown", 4);
       
       fido.bark();
       max.selfReflectiveBark();
       max.getAge();
       
        System.out.println("But Fido's age is "+fido.getAge());
        
        Dog lucy = new Dog();
        lucy.setAge(8);
        lucy.setColor("White");
        lucy.setName("Lucy");
        
        System.out.println("Lucy's color is"+lucy.getColor());
        System.out.println("Lucy's age is"+lucy.getAge());
        
    }
}
