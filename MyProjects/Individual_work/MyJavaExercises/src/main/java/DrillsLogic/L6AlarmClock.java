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
public class L6AlarmClock {

//    Given a day of the week encoded as 0=Sun , 1=Mon , 2=Tue , ...6=Sat ,
//            and a booleanean indicating if we are on vacation, 
//    return a String of the form "7:00" indicating when the alarm clock should ring.
//            Weekdays the alarm should be "7:00" and on the weekend it should be "10:00". 
//             Unless we are on vacation -- then on weekdays it should be "10:00" 
//             and weekends it should be "off". 
//
//      alarmClock(1, false) → "7:00"
//      alarmClock(5, false) → "7:00"
//      alarmClock(0, false) → "10:00"

public String alarmClock(int day, boolean vacation) {

    String ring;
    
    if(vacation){
        if(day==6 || day==0){
            ring = "off";
        }else{
            ring = "10:00";
        }
    }else{
        if(day==6 || day==0){
            ring = "10:00";
        }else{
            ring = "7:00";
        }
    }
    
    return ring;
    
    }

}
