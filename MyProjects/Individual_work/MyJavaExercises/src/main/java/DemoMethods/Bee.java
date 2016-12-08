/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoMethods;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class Bee {
    
    public void buzz(){
            System.out.println("BUZZ BUZZ BUZZ");
    }

    
    public String makeHoney(int howMuchHoney){
            String honey = "";
            
            for (int i = 0; i < howMuchHoney; i++){
                buzz();
                honey = honey + "honey";
            }
            
            return honey;
    } 
    
    public String makeHoney(){
        Random randGen = new Random();
        return makeHoney(randGen.nextInt(9));
    }
}

