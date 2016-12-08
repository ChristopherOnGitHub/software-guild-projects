/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdasAndStreams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author apprentice
 */
public class FunWithLambdasAndStrings {

    public static void main(String[] args) {

        Collection<Vechicle> thingsThatMove = new ArrayList<>();
        thingsThatMove.add(new Vechicle("SlateBlue", "Boat", "Fancy Boat", true));
        thingsThatMove.add(new Miata("Red"));
        thingsThatMove.add(new Miata("Purple with Green Stripes"));
        thingsThatMove.add(new VolkswagenBeetle("Black"));
        thingsThatMove.add(new SpaceShip("Silver", true, 10, 2));
        thingsThatMove.add(new SpaceShip("Blue", false, 1, 200));
        thingsThatMove.add(new SpaceShip("Blinding Light", false, 3, 10));
        thingsThatMove.add(new SpaceShip("Green", true, 7, 20));
        thingsThatMove.add(new SpaceShip("Blue", false, 2, 4));
        thingsThatMove.add(new SpaceShip("Red", false, 5, 1));
        thingsThatMove.add(new SpaceShip("Clear", true, 0, 0));
        thingsThatMove.add(new Miata("Lime Green"));
        thingsThatMove.add(new Miata("Blue"));

        Stream<Vechicle> streamOfVechicles = thingsThatMove.stream();
        thingsThatMove.stream()
                .filter((Vechicle v) -> {
                    return v.isCanFloat();
                })
                .forEach(v -> System.out.println(v.getMake() + ": " + v.getModel()));

        System.out.println("All the things that move: make and model");
        thingsThatMove.stream()
                .forEach(v -> System.out.println("There is a " + v.getColor()
                        + v.getMake() + ": " + v.getModel()));

        List<Vechicle> greenThings=
                 thingsThatMove.stream()
                .filter(vechicle -> vechicle.getColor().contains("Blue"))
                .collect(Collectors.toList());
    
    
        
        List<SpaceShip> ships = new ArrayList<>();
        ships.add(new SpaceShip("Silver", true, 10, 2));
        ships.add(new SpaceShip("Blue", false, 1, 200));
        ships.add(new SpaceShip("Blinding Light", false, 3, 10));
        ships.add(new SpaceShip("Green", true, 7, 20));
        ships.add(new SpaceShip("Blue", false, 2, 4));
        ships.add(new SpaceShip("Red", false, 5, 1));
        ships.add(new SpaceShip("Clear", true, 0, 0));

        double avgAlien = ships.stream()
                .mapToInt(ship -> ship.getAliensAboard()).average().getAsDouble();
        
        System.out.println("The average number of aliens on the space ships is: " + avgAlien);
        
        System.out.println("");
        System.out.println("LET'S DROWN SOME MIATAS!!!");
        
        thingsThatMove.stream()
                .filter(vechicle -> vechicle.getModel().equals("Miata"))
                .map(vechicle -> (Miata)vechicle)
                .forEach(miata -> System.out.println("Throwing the " 
                + miata.getColor() +" miata into the river!!!" +miata.beep()));
        
        System.out.println("");
        System.out.println("Total number of fins on spaceships");
        System.out.println(ships.stream().mapToInt(SpaceShip::getNumberOfFins).sum());
        
    }
}
