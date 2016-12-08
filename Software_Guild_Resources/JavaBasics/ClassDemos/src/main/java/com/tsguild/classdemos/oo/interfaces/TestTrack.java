/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.javabasics.interfaces;

/**
 *
 * @author ahill
 */
public class TestTrack {

    public static void main(String[] args) {

        Car Lady = new Car();

        System.out.println("Gonna drive my car ...");
        System.out.println("Trying to drive my car 50 miles...");
        System.out.println("Does it work?: " + Lady.drive(50));
        System.out.println("How much fuel do you have left? " + Lady.getCurrentFuel());

        // Gonna have my own crazy car garage.
        Driveable[] myGarage = new Driveable[10];
        for (int i = 0; i < myGarage.length; i++) {
            myGarage[i] = new Car();
        }
        
        // I'm storing the cars as driveable in my garage
        // which means they can only be accessed via that interface
        // not all the other things that a car can usually do
        Driveable aDriveableCar = myGarage[3];
        aDriveableCar.drive(100);
        
        
        // Oh no, we lost a wheel while we driving my car!
        // I am sad. Also, I can't remove the wheel while I am using this car
        // ONLY under the Driveable interface.
        
        // To use it as a fully featured car, I have to CAST it back to
        // the Car class Type. THEN I can do things that cars can do like
        // change the number of wheels it has.
        Car brokenCar = (Car)aDriveableCar;
        brokenCar.setNumWheels(3);
        
        // So, I don't like my broken car, so I'm going to replace it with a tank.
        myGarage[3] = new Tank();
        
        // Gonna have party, let everyone drive my cars (and tank)
        for (Driveable vehicle : myGarage) {
            System.out.println("Driving a vehicle...");
            vehicle.drive(20);
        }
        
//        Car thisIsntACar = (Car)myGarage[3];
//        thisIsntACar.setModel("Really a tank..");
        System.out.println("What class is my tank?");
        System.out.println(myGarage[3].getClass());
        
        // I have a really picky friend who only wants to drive
        // the tank. Can't really blame them ...
        for (int i = 0; i < myGarage.length; i++) {
            Driveable thing = myGarage[i];
            if(thing.getClass().equals(Tank.class)){
                System.out.println("Driving the tank ...!!!");
                thing.drive(100);
            }
        }
        
    }

}
