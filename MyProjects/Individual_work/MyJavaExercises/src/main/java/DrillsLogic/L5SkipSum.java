/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogic;

/**
 *
 * @author apprentice
 */
public class L5SkipSum {
    
//    Given 2 ints, a and b, return their sum. However, sums in the range 10..19 
//    inclusive are forbidden, so in that case just return 20. 
//
//skipSum(3, 4) → 7
//skipSum(9, 4) → 20
//skipSum(10, 11) → 21

public int skipSum(int a, int b) {
    
    int sum = a+b;
    int returnMe;
    
    if(sum>=10 && sum<=19){
        returnMe=20;
    }else{
        returnMe=sum;
    }
    
    return returnMe;
  
}
    
}
