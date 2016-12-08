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
public class L17RollDice {
   
//    Return the sum of two 6-sided dice rolls, each in the range 1..6. However, 
//            if noDoubles is true, if the two dice show the same value, increment
//            one die to the next value, wrapping around to 1 if its value was 6. 
//
//rollDice(2, 3, true) → 5
//rollDice(3, 3, true) → 7
//rollDice(3, 3, false) → 6

public int rollDice(int die1, int die2, boolean noDoubles) {

    if(noDoubles && (die1==die2)){
        if(die1 <= 5){
            die1 = die1 + 1;
        }else if(die1 == 6){
            die1 = 1;
        }
    }
    
    int total = die1 + die2;
    
    return total;
    
}
    
}
