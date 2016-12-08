/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2contd;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class StateCapitals2 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        CapitalObjects Montgomery = new CapitalObjects("Montgomery", 374536, 155.4);
        CapitalObjects Juneau = new CapitalObjects("Juneau", 31275, 2716.7);
        CapitalObjects Phoenix = new CapitalObjects("Phoenix", 4192887, 474.9);
        CapitalObjects LittleRock = new CapitalObjects("Little Rock", 193524, 116.2);
        CapitalObjects Sacramento = new CapitalObjects("Sacramento", 2527123, 97.2);
        CapitalObjects Denver = new CapitalObjects("Denver", 2552195, 153.4);
        CapitalObjects Hartford = new CapitalObjects("Hartford", 1212381, 17.3);
        CapitalObjects Dover = new CapitalObjects("Dover", 162310, 22.4);
        CapitalObjects Tallahassee = new CapitalObjects("Tallahassee", 367413, 95.7);
        CapitalObjects Atlanta = new CapitalObjects("Atlanta", 5268860, 131.7);
        CapitalObjects Honolulu = new CapitalObjects("Honolulu", 953207, 85.7);
        CapitalObjects Boise = new CapitalObjects("Boise", 616561, 63.8);
        CapitalObjects Springfield = new CapitalObjects("Springfield", 208182, 54);
        CapitalObjects Indianapolis = new CapitalObjects("Indianapolis", 1756221, 361.5);
        CapitalObjects DesMoines = new CapitalObjects("Des Moines", 580255, 75.8);
        CapitalObjects Topeka = new CapitalObjects("Topeka", 230824, 75.8);
        CapitalObjects Frankfort = new CapitalObjects("Frankfort", 70758, 14.7);
        CapitalObjects BatonRouge = new CapitalObjects("Baton Rouge", 802484, 76.8);
        CapitalObjects Augusta = new CapitalObjects("Augusta", 117114, 55.4);
        CapitalObjects Annapolis = new CapitalObjects("Annapolis", 38394, 6.73);
        CapitalObjects Boston = new CapitalObjects("Boston", 4522858, 48.4);
        CapitalObjects Lansing = new CapitalObjects("Lansing", 464036, 35.0);
        CapitalObjects SaintPaul = new CapitalObjects("Saint Paul", 3502891, 52.8);
        CapitalObjects Jackson = new CapitalObjects("Jackson", 539057, 104.9);
        CapitalObjects JeffersonCity = new CapitalObjects("Jefferson City", 149807, 27.3);
        CapitalObjects Helena = new CapitalObjects("Helena", 74801, 14.0);
        CapitalObjects Lincoln = new CapitalObjects("Lincoln", 302157, 74.6);
        CapitalObjects CarsonCity = new CapitalObjects("Carson City", 55274, 143.4);
        CapitalObjects Concord = new CapitalObjects("Concord", 42695, 64.3);
        CapitalObjects Trenton = new CapitalObjects("Trenton", 366513, 7.66);
        CapitalObjects SantaFe = new CapitalObjects("Santa Fe", 183732, 37.3);
        CapitalObjects Albany = new CapitalObjects("Albany", 857592, 21.4);
        CapitalObjects Raleigh = new CapitalObjects("Raleigh", 1130490, 114.6);
        CapitalObjects Bismarck = new CapitalObjects("Bismarck", 108779, 26.9);
        CapitalObjects Columbus = new CapitalObjects("Columbus", 1836536, 210.3);
        CapitalObjects OklahomaCity = new CapitalObjects("Oklahoma City", 1252987, 607);
        CapitalObjects Salem = new CapitalObjects("Salem", 390738, 45.7);
        CapitalObjects Harrisburg = new CapitalObjects("Harrisburg", 647390, 8.11);
        CapitalObjects Providence = new CapitalObjects("Providence", 1630956, 18.5);
        CapitalObjects Columbia = new CapitalObjects("Columbia", 913797, 125.2);
        CapitalObjects Pierre = new CapitalObjects("Pierre", 13646, 13);
        CapitalObjects Nashville = new CapitalObjects("Nashville", 1582264, 473.3);
        CapitalObjects Austin = new CapitalObjects("Austin", 1716291, 251.5);
        CapitalObjects SaltLakeCity = new CapitalObjects("Salt Lake City", 1124197, 109.1);
        CapitalObjects Montpelier = new CapitalObjects("Montpelier", 7855, 10.2);
        CapitalObjects Richmond = new CapitalObjects("Richmond", 1231675, 60.1);
        CapitalObjects Olympia = new CapitalObjects("Olympia", 234670, 16.7);
        CapitalObjects Charleston = new CapitalObjects("Charleston", 304214, 31.6);
        CapitalObjects Madison = new CapitalObjects("Madison", 561505, 68.7);
        CapitalObjects Cheyenne = new CapitalObjects("Cheyenne", 91738, 21.1);

        HashMap<String, CapitalObjects> stateCapitals = new HashMap<>();

        stateCapitals.put("Alabama", Montgomery);
        stateCapitals.put("Alaska", Juneau);
        stateCapitals.put("Arizona", Phoenix);
        stateCapitals.put("Arkansas", LittleRock);
        stateCapitals.put("California", Sacramento);
        stateCapitals.put("Colorado", Denver);
        stateCapitals.put("Connecticut", Hartford);
        stateCapitals.put("Delaware", Dover);
        stateCapitals.put("Florida", Tallahassee);
        stateCapitals.put("Georgia", Atlanta);
        stateCapitals.put("Hawaii", Honolulu);
        stateCapitals.put("Idaho", Boise);
        stateCapitals.put("Illinois", Springfield);
        stateCapitals.put("Indiana", Indianapolis);
        stateCapitals.put("Iowa", DesMoines);
        stateCapitals.put("Kansas", Topeka);
        stateCapitals.put("Kentucky", Frankfort);
        stateCapitals.put("Louisiana", BatonRouge);
        stateCapitals.put("Maine", Augusta);
        stateCapitals.put("Maryland", Annapolis);
        stateCapitals.put("Massachusetts", Boston);
        stateCapitals.put("Michigan", Lansing);
        stateCapitals.put("Minnesota", SaintPaul);
        stateCapitals.put("Mississippi", Jackson);
        stateCapitals.put("Missouri", JeffersonCity);
        stateCapitals.put("Montana", Helena);
        stateCapitals.put("Nebraska", Lincoln);
        stateCapitals.put("Nevade", CarsonCity);
        stateCapitals.put("New Hampshire", Concord);
        stateCapitals.put("New Jersey", Trenton);
        stateCapitals.put("New Mexico", SantaFe);
        stateCapitals.put("New York", Albany);
        stateCapitals.put("North Carolina", Raleigh);
        stateCapitals.put("North Dakota", Bismarck);
        stateCapitals.put("Ohio", Columbus);
        stateCapitals.put("Oklahoma", OklahomaCity);
        stateCapitals.put("Oregon", Salem);
        stateCapitals.put("Pennsylvania", Harrisburg);
        stateCapitals.put("Rhode Island", Providence);
        stateCapitals.put("South Carolina", Columbia);
        stateCapitals.put("South Dakota", Pierre);
        stateCapitals.put("Tennessee", Nashville);
        stateCapitals.put("Texas", Austin);
        stateCapitals.put("Utah", SaltLakeCity);
        stateCapitals.put("Vermont", Montpelier);
        stateCapitals.put("Virgina", Richmond);
        stateCapitals.put("Washington", Olympia);
        stateCapitals.put("West Virginia", Charleston);
        stateCapitals.put("Wisconsin", Madison);
        stateCapitals.put("Wyoming", Cheyenne);

        Set<String> stateName = stateCapitals.keySet();
//        Collection<CapitalObjects> cityName = stateCapitals.values();

        for (String x : stateName) {
            System.out.println(x);
            CapitalObjects asdf = stateCapitals.get(x);
            System.out.println("Capital name: " + asdf.name);
            System.out.println("Capital population: " + asdf.population);
            System.out.println("Capital size: " + asdf.size);
            System.out.println(" ");
        }

        while (true) {
            System.out.println("SEARCH FUNCTION: ENTER POPULATION FOR CAPITALS CONTAINING"
                    + " AS MANY PEOPLE OR MORE.");
            int minPopulation = userInput.nextInt();
            int y = 0;

            for (String x : stateName) {
                CapitalObjects asdf = stateCapitals.get(x);
                if (asdf.population > minPopulation) {
                    System.out.println(x);
                    System.out.println("Capital name: " + asdf.name);
                    System.out.println("Capital population: " + asdf.population);
                    System.out.println("Capital size: " + asdf.size);
                    System.out.println(" ");
                    y++;
                }

            }

        }

    }
}
