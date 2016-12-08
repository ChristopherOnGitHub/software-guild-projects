/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDRecords;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SortingArraysOnTwoFields {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileRead = new Scanner(new BufferedReader(new FileReader("gb.txt")));

        ArrayList<Student> StudentAL = new ArrayList<>();

        while (fileRead.hasNextLine()) {
            Student x = new Student(fileRead.nextInt(), fileRead.nextInt(), 
                    fileRead.nextFloat(), fileRead.nextLine());
            StudentAL.add(x);
        }
        
//        for (int i = 1; i < StudentAL.size; i++) {
//            
//        }
        
        
    }

}

class Student {

    private int ID;
    private int yearGrade;
    private float grade;
    private String letterGrade;

    public Student(int ID, int yearGrade, float grade, String letterGrade) {
        this.ID = ID;
        this.yearGrade = yearGrade;
        this.grade = grade;
        this.letterGrade = letterGrade;

    }
}
