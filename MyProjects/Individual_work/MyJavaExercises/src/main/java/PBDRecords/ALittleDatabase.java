/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDRecords;

/**
 *
 * @author apprentice
 */
public class ALittleDatabase {
    public static void main(String[] args) {
        
        String[] students = {"Aaron", "Blake", "Denice"};
        int[] gradeLevel = {12,12,11};
        double[] avgGrade = {78.67, 98.45,81.34};
        
        System.out.println("The student's names are: "+students[0]+", "+students[1]+", "
        +students[2]);
        System.out.println("The student's grade levels are: "+gradeLevel[0]+", "+
                gradeLevel[1]+", "+gradeLevel[2]);
        System.out.println("The average grade of each student is: "+avgGrade[0]+
                ", "+avgGrade[1]+", "+avgGrade[2]);
        
        
    }
    
}
