/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemosWeek3;

/**
 *
 * @author apprentice
 */
public class StuffAndThings {
    public static void main(String[] args) {
        
        Dog fido = new Dog();
        fido.hug();
        
        TeddyBear teddy = new TeddyBear();
        teddy.hug();
        
        hugSomething(teddy);
        hugSomething(fido);
        hugSomething(new Dog());
    }
        
        
        public static void hugSomething(Huggable something){
        something.hug();
        something.hug();
    }
    
}
