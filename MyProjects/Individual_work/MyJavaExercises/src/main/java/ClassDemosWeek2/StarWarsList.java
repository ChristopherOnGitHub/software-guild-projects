/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemosWeek2;

import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public class StarWarsList {

    public static void main(String[] args) {

        ArrayList<String> starWarsCharacters = new ArrayList<>();

        System.out.println("Do I know any Star Wars characters yet? " + !starWarsCharacters.isEmpty());

        starWarsCharacters.add("Jabba the Hutt");
        starWarsCharacters.add("Boba Fett");
        starWarsCharacters.add("Rey");

        System.out.println("Do I know any Star Wars characters yet? " + !starWarsCharacters.isEmpty());

        starWarsCharacters.add("Han Solo");
        starWarsCharacters.add("Chewbacca");

        System.out.println("How many charcters from Star Wars do I know? " + starWarsCharacters.size());

        for (int i = 0; i < starWarsCharacters.size(); i++) {
            System.out.println("This is the "+i+ "th one in my list: "
            +starWarsCharacters.get(i));
        }
        
        starWarsCharacters.add("Chewbacca");
        starWarsCharacters.add("Chewbacca");
        starWarsCharacters.add("Chewbacca");
        starWarsCharacters.add("Chewbacca");

        
        starWarsCharacters.add("Jean Luc Picard");
        int whereIsPicard = starWarsCharacters.indexOf("Jean Luc Picard");
        System.out.println("HEY! Someone put Picard in there!");
        System.out.println("He's hiding at index: "+ whereIsPicard);
        
        starWarsCharacters.remove(whereIsPicard);
        System.out.println("I got him out of there for you.");
        System.out.println("Is he in the list??? " + starWarsCharacters.contains("Jean Luc Picard"));
        
        System.out.println("Let's just be sure..."+starWarsCharacters.remove("Jean Luc Picard"));
        
        System.out.println("These are the characters I still have: ");
        
        for(String character : starWarsCharacters){
            System.out.println(character);
        }

        for (int i = starWarsCharacters.size() -1; i >=0; i--){
            String character = starWarsCharacters.get(i);
            if(character.equals("Chewbacca")){
                starWarsCharacters.remove(i);
                break;
            }
        }
        System.out.println("I have removed the last Chewbacca");
        
        System.out.println("These are the characters I still have: ");
        
        for(String character : starWarsCharacters){
            System.out.println(character);
        }   
        
        starWarsCharacters.add(0, "Darth Vader");

    }

}
