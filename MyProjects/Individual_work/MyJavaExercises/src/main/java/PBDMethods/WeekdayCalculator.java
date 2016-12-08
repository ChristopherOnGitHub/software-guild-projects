/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDMethods;

import java.util.Scanner;

public class WeekdayCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
        System.out.println();
        System.out.println("All you have to do is enter your birth date, and it will");
        System.out.println("tell you the day of the week on which you were born.");
        System.out.println();
        System.out.println("Some automatic tests....");
        System.out.println("12 10 2003 => " + weekday(12, 10, 2003));
        System.out.println(" 2 13 1976 => " + weekday(2, 13, 1976));
        System.out.println(" 2 13 1977 => " + weekday(2, 13, 1977));
        System.out.println(" 7  2 1974 => " + weekday(7, 2, 1974));
        System.out.println(" 1 15 2003 => " + weekday(1, 15, 2003));
        System.out.println("10 13 2000 => " + weekday(10, 13, 2000));
        System.out.println();

        System.out.println("Now it's your turn!  What's your birthday?");
        System.out.print("Birth date (mm dd yyyy): ");
        int mm = keyboard.nextInt();
        int dd = keyboard.nextInt();
        int yyyy = keyboard.nextInt();

       // System.out.println("You were born on " +nameOfDay(total) + weekday(mm, dd, yyyy));
    }

    public static String weekday(int mm, int dd, int yyyy) {
        int yy, total;
        String date = "";

        yy = yyyy - 1900;
        total = yy / 4;
        total = total + dd;
        total = total + month_offset(mm);

        if ((is_leap(yyyy) == true) && (mm == 1 || mm == 2)) {
            total = total - 1;
        }

        total = total % 7;

        nameOfDay(total);

        date = month_name(mm) + ", " + yyyy;

        return date;
    }

    // paste your functions from MonthName, WeekdayName, and MonthOffset here
    public static String month_name(int month) {
        String result;

        switch (month) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
            default:
                result = "Smh you picked a dumb number kiddo";
        }

        return result;
    }

    public static int month_offset(int mm) {
        int result;

        switch (mm) {
            case 1:
                result = 1;
                break;
            case 2:
                result = 4;
                break;
            case 3:
                result = 4;
                break;
            case 4:
                result = 0;
                break;
            case 5:
                result = 2;
                break;
            case 6:
                result = 5;
                break;
            case 7:
                result = 0;
                break;
            case 8:
                result = 3;
                break;
            case 9:
                result = 6;
                break;
            case 10:
                result = 1;
                break;
            case 11:
                result = 4;
                break;
            case 12:
                result = 6;
                break;
            default:
                result = -1;

        }

        return result;
    }

    public static boolean is_leap(int yyyy) {
        // years which are evenly divisible by 4 are leap years,
        // but years divisible by 100 are not leap years,
        // though years divisible by 400 are leap years
        boolean result;

        if (yyyy % 400 == 0) {
            result = true;
        } else if (yyyy % 100 == 0) {
            result = false;
        } else if (yyyy % 4 == 0) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public static void nameOfDay(int total) {
        String result = "derp";
        switch (total) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
                  
        }
    }
}
