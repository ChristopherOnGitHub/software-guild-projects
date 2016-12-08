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
public class L12AnswerCell {
    
//    Your cell phone rings. Return true if you should answer it. Normally you answer, 
//    except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, 
//    you do not answer. 
//
//answerCell(false, false, false) → true
//answerCell(false, false, true) → false
//answerCell(true, false, false) → false

public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    
    boolean answer = true;
    
    if(isMorning){
        if(isMom){
            
        }else{
            answer = false;
        }
    }
    
    if(isAsleep){
        answer = false;
    }
    
    return answer;
  
}
    
}
