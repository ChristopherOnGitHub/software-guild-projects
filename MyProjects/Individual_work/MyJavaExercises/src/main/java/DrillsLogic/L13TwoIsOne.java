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
public class L13TwoIsOne {
    
//    Given three ints, a b c, return true if it is possible to add two of the ints to get the third. 
//
//twoIsOne(1, 2, 3) → true
//twoIsOne(3, 1, 2) → true
//twoIsOne(3, 2, 2) → false

public boolean twoIsOne(int a, int b, int c) {
    
    boolean x;
    
    if(a+b==c){
        x=true;
    }else if(a+c==b){
        x=true;
    }else if(b+c==a){
        x=true;
    }else{
        x=false;
    }
    
    return x;
  
}
    
}
