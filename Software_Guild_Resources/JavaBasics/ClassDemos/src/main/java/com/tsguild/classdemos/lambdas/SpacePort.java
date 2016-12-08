/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.javabasics.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ahill
 */
public class SpacePort {

    public static void main(String[] args) {

        List<Spaceship> hangar = new ArrayList<>();

//        String color, String pilotName, String shieldType,
//        int numFins, int numEngines, boolean hasLifeSupport
        Spaceship shinyShip = new Spaceship("Blue", "Yerrble Beeblebrox", "Bad",
                100, 3, false);
        hangar.add(shinyShip);

        Spaceship notAsShinyShip = new Spaceship("Puce", "Jo Jordan", "Great",
                0, 1, true);
        hangar.add(notAsShinyShip);

        hangar.add(new Spaceship("Yellow w/ White Stripes", "Meep", "Not so bad",
                5, 2, true));
        hangar.add(new Spaceship("Blue", "Sir Pennington", "Okay",
                10, 21, true));
        hangar.add(new Spaceship("Green w/ PolkaDots", "Papa Horton", "Better",
                1, 12, false));
        hangar.add(new Spaceship("Reddish", "Lady Elsa", "Not so bad",
                500, 22, true));
        hangar.add(new Spaceship("Purple green yellow rainbow", "Quix Quizo", "The Best",
                51, 2, true));
        hangar.add(new Spaceship("Shiny Silver", "Frankenfurter", "Bad",
                39, 42, true));
        hangar.add(new Spaceship("Not Shiny Silver", "Ben Billionaire", "Good",
                4, 52, true));
        hangar.add(new Spaceship("Gold", "Queen Queenington", "Great",
                2, 32, true));
        hangar.add(new Spaceship("Platinum", "Frank", "Awesome",
                1, 1, false));
        hangar.add(new Spaceship("Steel Green", "Frank Jr.", "Pretty okay",
                5, 1, true));
        hangar.add(new Spaceship("Banana", "Ainsley Princeton III", "Not so bad",
                6, 0, true));

        // oldschool
        System.out.println("We can print them out the old school way ...");
        for (Spaceship spaceship : hangar) {
            System.out.println(spaceship.getPilotName());
        }

        System.out.println("OR we can do it with our new fancy method...");

        hangar
                .stream()
                .forEach(ship -> System.out.println(ship.getPilotName()));

        System.out.println("old school printing out ships pilots whose ships"
                + " have more than 5 fins...");

        for (Spaceship spaceship : hangar) {
            if (spaceship.getNumFins() > 5) {
                System.out.println(spaceship.getPilotName());
            }
        }

        System.out.println("fancy way printing out ships pilots whose ships"
                + " have more than 5 fins...");

        hangar.stream()
                //              // notice you can basically steal the conditional from your
                // if statement in the 'old school' way, above for your filter
                .filter(ship -> ship.getNumFins() > 5)
                .forEach(ship -> System.out.println(ship.getPilotName()));

        int sumOfFins = 0;
        for (Spaceship spaceship : hangar) {
            sumOfFins = spaceship.getNumFins() + sumOfFins;
        }
        double avgFins = ((double) sumOfFins) / hangar.size();
        System.out.println("Avg Num of fins in all ships: " + avgFins);

        double avgFinsAgain
                = hangar.stream()
                .mapToInt(ship -> ship.getNumFins())
                .average()
                .getAsDouble();
        System.out.println("Avg Num of fins in all ships: " + avgFinsAgain);

        List<Spaceship> shipsWithLifeSupport
                = hangar.stream()
                .filter(ship -> ship.hasLifeSupport())
                .collect(Collectors.toList());
        
        List<Spaceship> shipsWithOutLifeSupport
                = hangar.stream()
                .filter(ship -> !ship.hasLifeSupport())
                .collect(Collectors.toList());

    }
}
