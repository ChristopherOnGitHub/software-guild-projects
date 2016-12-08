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
public class c17Between10and20 {
    
//    Given 2 int values, return true if either of them is in the range 10..20 inclusive. 
//
//between10and20(12, 99) -> true
//between10and20(21, 12) -> true
//between10and20(8, 99) -> false

public boolean between10and20(int a, int b) {
    
    boolean inRange = false;
    
    if((a<=20 && a>=10) || (b<=20 && b>=10)){
        inRange = true;
    }
    
    return inRange;

}
    
}
