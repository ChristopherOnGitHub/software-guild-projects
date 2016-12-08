/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.collections;

import java.util.ArrayList;

/**
 *
 * @author ahill
 */
public class ListsAndMapsOhMy {
    
    public static void main(String[] args) {
        
        ArrayList<String> starWarsCharacters = new ArrayList<>();
        
        System.out.println("Do I know any SW characters yet? : " 
                    + !starWarsCharacters.isEmpty());
        
        starWarsCharacters.add("Jabba the Hutt");
        starWarsCharacters.add("Boba Fett");
        starWarsCharacters.add("Rey");
        
        System.out.println("Do I know any SW characters yet? : " 
                    + !starWarsCharacters.isEmpty());
        
        starWarsCharacters.add("Han Solo");
        starWarsCharacters.add("Chewbacca");
        
        System.out.println("How many characters from Star Wars do I know? " 
                + starWarsCharacters.size());
        
        for (int i = 0; i < starWarsCharacters.size(); i++) {
            System.out.println("This is the " + i + "th one in my list "
                                    + starWarsCharacters.get(i));
                                // LIKE: starWarsCharacters[i] if it were an array
        }
        
        starWarsCharacters.add("Chewbacca");
        starWarsCharacters.add("Chewbacca");
        starWarsCharacters.add("Chewbacca");
        starWarsCharacters.add("Chewbacca");
        starWarsCharacters.add("Chewbacca");
        starWarsCharacters.add("Chewbacca");
        
        starWarsCharacters.add("Jean Luc Picard");
        int whereIsPicard = starWarsCharacters.indexOf("Jean Luc Picard");
        System.out.println("HEY! Someone put Picard in there!");
        System.out.println("He's hiding at index: " + whereIsPicard);
        
        starWarsCharacters.remove(whereIsPicard);
        System.out.println("I got him out of there for you.");
        System.out.println("See? Is he in there, List?? " 
                + starWarsCharacters.contains("Jean Luc Picard"));
        
        System.out.println("Let's just be sure..." 
                + starWarsCharacters.remove("Jean Luc Picard"));
//                  + starWarsCharacters.remove(whereIsPicard)); // This one will explode

        starWarsCharacters.remove(0);
        starWarsCharacters.remove(0);
        starWarsCharacters.remove(0);
        
        for(String starWarsCharacter : starWarsCharacters){
            System.out.println(starWarsCharacter);
        }
        
        for (int i = starWarsCharacters.size() - 1; i >= 0; i--) {
            String character = starWarsCharacters.get(i);
            if(character.equals("Chewbacca")){
                starWarsCharacters.remove(i);
                break;
            }
        }
        
        starWarsCharacters.add(0, "Chewbacca");
      
        
        
    }
    
}
