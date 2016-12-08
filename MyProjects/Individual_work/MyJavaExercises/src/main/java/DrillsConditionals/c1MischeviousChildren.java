/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//
//We have two children, a and b, and the parameters aSmile and bSmile indicate 
//if each is smiling. We are in trouble if they are both smiling or 
//if neither of them is smiling. Return true if we are in trouble. 
//
//areWeInTrouble(true, true) -> true
//areWeInTrouble(false, false) -> true
//areWeInTrouble(true, false) -> false
//
//public boolean areWeInTrouble(boolean aSmile, boolean bSmile) {
//  
//}
package DrillsConditionals;

/**
 *
 * @author apprentice
 */
public class c1MischeviousChildren {

    public boolean MischeviousChildren(boolean a, boolean b) {

        boolean areWeInTrouble;

        areWeInTrouble = a == b;
        
        return areWeInTrouble;
    }
}
