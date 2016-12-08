/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDRecords;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ALittleDatabaseWithALoop {
        public static void main(String[] args) {
        
            Scanner userInput = new Scanner (System.in);
            System.out.println("Enter the three students' names");   
        String[] students = {userInput.next(), userInput.next(), userInput.next()};
            System.out.println("Thank you, please enter their grade level:");
        int[] gradeLevel = {userInput.nextInt(),userInput.nextInt(),userInput.nextInt()};
            System.out.println("Please enter their grade averages");
        double[] avgGrade = {userInput.nextDouble(), userInput.nextDouble(),userInput.nextDouble()};
        
            System.out.print("The student's names are:");
            for (int i = 0; i < students.length; i++) {
                System.out.print(" "+students[i]);
            }
            System.out.println(" ");
            
            System.out.print("The student's grade level is:");
            for (int i = 0; i < gradeLevel.length; i++) {
                System.out.print(" "+gradeLevel[i]);
            }
            System.out.println(" ");
            
            System.out.print("The student's average grades are:");
            for (int i = 0; i < avgGrade.length; i++) {
                System.out.print(" "+avgGrade[i]);
            }
        }
    
}
