/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.lambdasandstreams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author ahill
 */
public class FunWithLambdasAndStreams {
    public static void main(String[] args) {
        
        Collection<Vehicle> thingsThatMove = new ArrayList<>();
        thingsThatMove.add(new Vehicle("Slate Blue", "Boat", "Fancy Boat", true));
        thingsThatMove.add(new Miata("Red"));
        thingsThatMove.add(new Miata("Purple with Green Stripes"));
        thingsThatMove.add(new VolkswagenBeetle("Black"));
        thingsThatMove.add(new SpaceShip("Silver", true, 10, 2));
        thingsThatMove.add(new SpaceShip("Blue", false, 1, 200));
        thingsThatMove.add(new SpaceShip("Red", false, 100, 200));
        thingsThatMove.add(new SpaceShip("Turquoise", false, 12, 77));
        thingsThatMove.add(new SpaceShip("Zaphod", true, 13, -1));
        thingsThatMove.add(new SpaceShip("Lilac", false, 14, 90));
        thingsThatMove.add(new SpaceShip("Orange", true, 15, 2));
        thingsThatMove.add(new Miata("Orange"));
        thingsThatMove.add(new Miata("Green"));
        
        Stream<Vehicle> streamOfVehicles = thingsThatMove.stream();
        thingsThatMove.stream()
                .filter((Vehicle v) 
                            -> 
                        {
                            return v.isCanFloat();
                        }
                        )
                .forEach(v -> System.out.println(v.getMake() + ":" + v.getModel()) );
        System.out.println("ALL the things that move's make and model:");
        thingsThatMove.stream()
                    .forEach(v -> System.out.println(v.getMake() + ":" + v.getModel()));
        
        List<Vehicle> greenThings = 
                thingsThatMove.stream()
                .filter(vehicle -> vehicle.getColor().contains("Green"))
                .collect(Collectors.toList());
        
        List<Vehicle> greenThingsThatMove = new ArrayList<>();
        for (Vehicle vehicle : thingsThatMove) {
            if(vehicle.getColor().contains("Green")){
                greenThingsThatMove.add(vehicle);
            }
        }
        

        List<SpaceShip> ships = new ArrayList<>();
        ships.add(new SpaceShip("Silver", true, 10, 2));
        ships.add(new SpaceShip("Blue", false, 1, 200));
        ships.add(new SpaceShip("Red", false, 100, 200));
        ships.add(new SpaceShip("Turquoise", false, 12, 77));
        ships.add(new SpaceShip("Zaphod", true, 13, -1));
        ships.add(new SpaceShip("Lilac", false, 14, 90));
        ships.add(new SpaceShip("Orange", true, 15, 2));        
        
        int aliens = 0;
        for (int i = 0; i < ships.size(); i++) {
            SpaceShip ship = ships.get(i);
            aliens = aliens + ship.getAliensAboard();
        }
        double avgAlien = (double)aliens / ships.size();
        
        System.out.println("Avg number of aliens aboard the spaceships: " + avgAlien);
        
        avgAlien = 
        ships.stream().mapToInt(ship -> ship.getAliensAboard()).average().getAsDouble();
        
        System.out.println("Avg number of aliens aboard the spaceships(via lambda): " + avgAlien);
        
        thingsThatMove.stream()
                .filter(vehicle -> vehicle.getModel().equals("Miata"))
                .map(shouldBeMiata -> (Miata)shouldBeMiata)
                .forEach(miata -> System.out.println("Throwing this " + miata.getColor() + " miata in the river!!!"));
        
        System.out.println("Total Num Fins on all ships " 
                + ships.stream()
                .mapToInt(SpaceShip::getNumberOfFins)
                .sum());
    }
}
