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
public class c24Closer {
//    
//    Given 2 int values, return whichever value is nearest to the value 10, 
//    or return 0 in the event of a tie. 
//
//closer(8, 13) -> 8
//closer(13, 8) -> 8
//closer(13, 7) -> 0

public int closer(int a, int b) {

    int aDiff = 10-a;
    int bDiff = 10-b;
    int returner = 0;
    
    if(aDiff<0){
        aDiff = aDiff*-1;
    }
    if(bDiff<0){
        bDiff = bDiff*-1;
    }
    
    if(aDiff<bDiff){
        returner = a;
    }else if(bDiff<aDiff){
        returner = b;
    }
    
    return returner;
    
}
    
}
