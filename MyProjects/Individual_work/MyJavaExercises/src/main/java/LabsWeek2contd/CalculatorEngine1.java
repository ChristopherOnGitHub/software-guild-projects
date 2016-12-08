/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2contd;

/**
 *
 * @author apprentice
 */
public class CalculatorEngine1 {
        
    public static void addition(double x, double y) {
        double z;
        z = x + y;
        System.out.println(z);
        System.out.println(" ");
    }
    
    public static void subtraction(double x, double y) {
        double z;
        z = x - y;
        System.out.println(z);
        System.out.println(" ");
    }

    public static void multiplication(double x, double y) {
        double z;
        z = x * y;
        System.out.println(z);
        System.out.println(" ");
    }

    public static void division(double x, double y) {
        double z;
        z = x / y;
        System.out.println(z);
        System.out.println(" ");
    }
    
    public static double average(double x, double y, double z){
        double avg;
        double total;
        total = x+y+z;
        avg = total/3;
        return avg;
    }
    
    public static void grades(double x, double y, double z){
        System.out.println("Quiz1: "+x);
        System.out.println("Quiz2: "+y);
        System.out.println("Quiz3: "+z);
    }
    
    public static void studentsEnrolled(){
        
    }
    
}
