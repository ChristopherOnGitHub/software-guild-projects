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
public class c23Max {
    
//    Given three int values, a b c, return the largest. 
//
//max(1, 2, 3) -> 3
//max(1, 3, 2) -> 3
//max(3, 2, 1) -> 3

public int max(int a, int b, int c) {
    
    int max =a;
    
    if(b>=a && b>=c){
        max = b;
    }else if(c>=a && c>=b){
        max = c;
    }
    
    return max;


}
    
}
