/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.basics;

import java.util.Scanner;

/**
 *
 * @author ahill
 */
public class Switches {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a number please: ");

        int day = sc.nextInt();
        String dayName = "";

//        if(day == 1){
//            dayName = "Monday!";
//        } else if(day == 2){
//            dayName = "Tuesday!";
//        } else if(day == 3){
//            dayName = "Wednesday!";
//        } else if(day == 4){
//            dayName = "Thursday!";
//        } else if(day == 5){
//            dayName = "Friday!";
//        } else if(day == 6){
//            dayName = "Saturday!";
//        } else if(day == 7){
//            dayName = "Sunday!";
//        } else if(day == 8){
//            dayName = "Super Special Non Day!";
//        } else{
//            dayName = "notta day.";
//        }
        switch (day) {

            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tues";
                break;
            case 3:
                dayName = "Weds";
                break;
            case 4:
                dayName = "Thurs";
                break;
            case 5:
                dayName = "Fri";
                break;
            case 6:
                dayName = "Sat";
                break;
            case 7:
                dayName = "Sun";
                break;
            default:
                dayName = "notta day";

        }
        
        switch(dayName){
            case "Monday":
                System.out.println("The day number is 1");
                break;
        }

        System.out.println("That day is " + dayName);

    }

}
