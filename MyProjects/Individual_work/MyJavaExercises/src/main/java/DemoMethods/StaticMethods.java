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
public class StaticMethods {
    
    public static String randimalizer(){
        Random randGen = new Random();
        String animal = "";
        
        switch(randGen.nextInt(9)){
            case 0:
                animal= "Llama";
                break;
            case 1:
                animal= "JackRabbit";
                break;
            case 2:
                animal= "Orca";
                break;
            case 3:
                animal= "Pangolin";
                break;
            case 4:
                animal= "Bull Terrier";
                break;
            case 5:
                animal= "Emu";
                break;
            case 6:
                animal= "Sugar Glider";
                break;
            case 7:
                animal= "Emporer Penguin";
                break;
            case 8:
                animal= "Megadolon";
                break;
            default:
        }
                
        
        
        return animal;
        
    }     
}
