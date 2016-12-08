/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionals;

/**
 *
 * @author apprentice
 */
public class c25EEEEEEE {
    
//    Return true if the given String contains between 1 and 3 'e' chars. 
//
//gotE("Hello") -> true
//gotE("Heelle") -> true
//gotE("Heelele") -> false

public boolean gotE(String str) {
    
    boolean lengther = false;
    
    if(str.length()>=1 && str.length()<=3){
        lengther = true;
    }
    
    return lengther;

}
    
}
