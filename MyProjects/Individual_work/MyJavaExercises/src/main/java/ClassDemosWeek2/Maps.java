/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemosWeek2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public class Maps {
    public static void main(String[] args) {
        
        HashMap<String, String> favoriteColors = new HashMap<>();
        
        favoriteColors.put("Jimmy", "Green");
        favoriteColors.put("Shade", "Teal");
        favoriteColors.put("Morgan", "Blue");
        favoriteColors.put("Tripp", "Green");
        favoriteColors.put("Jesse", "Aqua-Blue");
        favoriteColors.put("Craig", "Blue");
        favoriteColors.put("Sarah", "Yellow");
        favoriteColors.put("Chris", "Black");
        favoriteColors.put("Dan", "Blue");
        favoriteColors.put("Scott", "Grey");
        favoriteColors.put("James", "Violet");
        favoriteColors.put("Austyn", "CHOCOLATE");
        
        System.out.println("Chris' favorite color is "
        + favoriteColors.get("Chris"));
        
        Set<String> namesOfPeople = favoriteColors.keySet();
        
        System.out.println("These are the people we know have favorite colors...");
        for(String personName : namesOfPeople){
            System.out.println(personName);
        }
        
        Collection<String> colorsPeopleLiked = favoriteColors.values();
        for(String color : colorsPeopleLiked){
            System.out.println(color);
        }
        
        HashMap<String, Integer> howManyLikeColors = new HashMap<>();
        
        for(String color : favoriteColors.values()){
            
           boolean colorInMapAlready = howManyLikeColors.containsKey(color);
           if(!colorInMapAlready){
               howManyLikeColors.put(color, 1);
           }else{
               int howManyLikeItSoFar = howManyLikeColors.get(color);
               howManyLikeItSoFar++;
               howManyLikeColors.put(color, howManyLikeItSoFar);
           }
            
        }
        
        for (String color : howManyLikeColors.keySet()){
            System.out.println(color + " : " + howManyLikeColors.get(color));
        }
        
    }
}
