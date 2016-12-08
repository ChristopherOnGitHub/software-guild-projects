/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoMethods;

/**
 *
 * @author apprentice
 */
public class UsingStaticMethods {
    
    public static void main(String[] args) {
        
       String animalName = StaticMethods.randimalizer();
       String animalName2 = StaticMethods.randimalizer();
       String animalName3 = StaticMethods.randimalizer();
       
        System.out.println("Animal chosen: " + animalName);
        System.out.println("Second animal chosen: " + animalName2);
        System.out.println("Third animal chosen: " + animalName3);
        System.out.println("Bonus animal: " + StaticMethods.randimalizer());
        
        String concatenated = UsingStaticMethods.concatenate("a", "b", "c");
        System.out.println(concatenated);
        
        //This one works because I am IN THE SAME CLASS
        //that the method is defined trying to use it.
        //And it, and main, is static.
        concatenated = concatenate("x", "y", "z");
        
        String animals = concatenate(StaticMethods.randimalizer(),
                StaticMethods.randimalizer(),
                StaticMethods.randimalizer());
        
        System.out.println(animals);
        
    }
    
    public static String concatenate(String a, String b, String c){
        String concatenatedValue = a+b+c;
        return concatenatedValue;
        //return a+b+c;
    }
    
}
