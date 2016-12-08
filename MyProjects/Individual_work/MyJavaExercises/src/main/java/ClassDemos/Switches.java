/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemos;

import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class Switches {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Give me a number please: ");
        
        int day = inputReader.nextInt();
        String dayName = "";
       
/*        if(day == 1){
            dayName = "Monday!";
        }else if(day == 2){
            dayName = "Tuesday!";
        }else if(day == 3){
            dayName = "Wednesday!";
        }else if(day == 4){
            dayName = "Thursday!";
        }else if(day == 5){
            dayName = "Friday!";
        }else if(day == 6){
            dayName = "Saturday!";
        }else if(day == 7){
            dayName = "Sunday!";
        }else{
            dayName = "undefined";
        }   
*/

    switch(day){       
        case 1:
            dayName = "Monday.";
            break;
        case 2:
            dayName = "Tuesday.";
            break;
        case 3:
            dayName = "Wednesday.";
            break;
        case 4:
            dayName = "Thursday.";
            break;
        case 5:
            dayName = "Friday.";
            break;
        case 6:
            dayName = "Saturday.";
            break;
        case 7:
            dayName = "Sunday.";
            break;
        default:
            dayName = "undefined.";
    }
    
        System.out.println("That day is " +dayName);
        
        
    }
    
}
