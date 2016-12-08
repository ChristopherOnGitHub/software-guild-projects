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
public class UsingMethods {
    public static void main(String[] args) {
        Bee littleDrone = new Bee();
        littleDrone.buzz();
        
        littleDrone.makeHoney(5); 
        //Don't lose the honey!
        
        String honeyJar = littleDrone.makeHoney(5);
        
        System.out.println("My honey: " + honeyJar);
    }
    
}
