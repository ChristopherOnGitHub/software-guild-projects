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
public class FurbyComplexMapsAndLists {
    public static void main(String[] args) {
        
        String [] creepySayings = {"Why, that's some shiny stuff you have",
        "You look delicious", "How about you tak eme for a ride....",
        "I want your waller. Now."};
    
        
        Furby bob = new Furby ("Purple with blue spots", creepySayings, "Bob");
     
        creepySayings[0] = "I would like to wear your shoes.";
        
        Furby xena = new Furby("Teal with red stripes", creepySayings, "Xena");
        
        creepySayings = new String[2];
        

    }        
}
