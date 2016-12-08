/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.collections;

import java.util.HashMap;

/**
 *
 * @author ahill
 */
public class ComplexMapsAndLists {

    public static void main(String[] args) {
        String[] creepySayings = {"Why, that's some shiny stuff you have",
            "You look delicious",
            "How about you take me for a ride....",
            "I want your wallet. Now."};
//        (String furColor, String[] creepyThingsSaid, String name) {
        Furby bob = new Furby("purple with blue spots",
                creepySayings,
                "Bob"
        );
        
        creepySayings[0] = "I would like to wear your shoes.";
        
        Furby xena = new Furby("Teal with red stripes",
                                creepySayings,
                                "Xena");
        
        creepySayings = new String[2];
        creepySayings[0] = "Hey there, you look delicious.";
        creepySayings[1] = "I really like your car.";
        
        Furby zaphod = new Furby("Green Apple", creepySayings, "Zaphod");
        
        // I've decided to index my furbies by name
        HashMap<String, Furby> furbies = new HashMap<>();
        furbies.put("Bob", bob);
        furbies.put(xena.getName(), xena);
        furbies.put(zaphod.getName(), zaphod);
        furbies.put("Molly", new Furby("Polkadot Pink", creepySayings, "Molly"));
        furbies.put("Gene", new Furby("Avocado Puke Green", creepySayings, "Gene"));
        
        System.out.println("What color is that creepy Molly furby??");
        System.out.println(furbies.get("Molly").getFurColor());
        
        Furby gene = furbies.get("Gene");
        String genesColor = gene.getFurColor();
        System.out.println("Gene's fur color: " + genesColor);
        
        System.out.println("Xander's first creepy saying: ");
        // I can protect for bad stuff with try catches or with if checks
        if(furbies.get("Xander") == null)
            System.out.println("Ain't no furby called that...!");
        else
            System.out.println(furbies.get("Xander").getCreepyThingsSaid()[0]);
        

    }

}
