/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemosWeek2;

import java.io.FileNotFoundException;

/**
 *
 * @author apprentice
 */
public class BonusException {
    public static void main(String[] args) {
        
        try{
            BonusException bEx = new BonusException();
            bEx.boom();
        } catch (FileNotFoundException ex) {
            System.out.println("It exploded.");
        }
        
    }
    
    public void boom() throws FileNotFoundException{
        throw new FileNotFoundException("Haha, I made it explode.");
    }
    
}
