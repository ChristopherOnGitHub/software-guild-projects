/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2contd;

import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class StudentQuizes {

    public static void main(String[] args) {
        IOConsole IOConsole = new IOConsole();
        Scanner userInput = new Scanner(System.in);

        StudentObject Larry = new StudentObject("Larry Larryton", 78.45, 79.00, 85.23);
        StudentObject Barry = new StudentObject("Barry Barryton", 99.99, 100.00, 98.88);
        StudentObject Kerri = new StudentObject("Killer Kerri", 23.45, 19.9, 2.02);
        StudentObject Mike = new StudentObject("Mike Mikers", 56.78, 78.44, 34.67);
        StudentObject Joe = new StudentObject("'THE' Joe", 100.0, 100.0, 100.1);
        StudentObject Bob = new StudentObject("Sir Bobrick III", 56.78, 67.89, 78.90);
        StudentObject Timmy = new StudentObject("Timmy!", 12.345, 23.456, 45.678);
        StudentObject ASDF = new StudentObject("ASDF JKL;", 56.66, 7.7, 99.99);
        StudentObject Gary = new StudentObject("Gary Gary Gary", 67.34, 34.66, 56.7);

        HashMap<String, StudentObject> studentList = new HashMap<>();

        studentList.put("Larry", Larry);
        studentList.put("Barry", Barry);
        studentList.put("Kerri", Kerri);
        studentList.put("Mike", Mike);
        studentList.put("Joe", Joe);
        studentList.put("Bob", Bob);
        studentList.put("Timmy", Timmy);
        studentList.put("ASDF", ASDF);
        studentList.put("Gary", Gary);

        Set<String> studentName = studentList.keySet();

        String o;
        while (true) {
            System.out.println(" ");
            o = IOConsole.sm();
            switch (o) {
                case "1":
                    for (String x : studentName) {
                        StudentObject valueObject = studentList.get(x);
                        System.out.println(valueObject.name);
                    }
                    break;
                case "2":
                    System.out.println("STUDENT NAME:");
                    String x = userInput.nextLine();
                    StudentObject valueObject = studentList.get(x);
                    System.out.println(valueObject.test1);
                    System.out.println(valueObject.test2);
                    System.out.println(valueObject.test3);
                    break;
                case "3":
                    System.out.println("STUDENT NAME:");
                    String y = userInput.nextLine();
                    StudentObject valueObject2 = studentList.get(y);
                    System.out.println(IOConsole.avg(valueObject2.test1, valueObject2.test2, valueObject2.test3));
                    break;
                case "4":
                    System.out.println("USERNAME OF NEW STUDENT:");
                    String a = userInput.nextLine();
                    System.out.println("SCORE ON TEST1:");
                    double b = userInput.nextDouble();
                    System.out.println("SCORE ON TEST2:");
                    double c = userInput.nextDouble();
                    System.out.println("SCORE ON TEST3:");
                    double d = userInput.nextDouble();
                    System.out.println("SAVE KEY AS:");
                    userInput.nextLine();
                    String e = userInput.nextLine();
                    StudentObject f = new StudentObject(a, b, c, d);
                    studentList.put(e, f);
                    break;
                case "5":
                    System.out.println("SELECT STUDENT KEY TO REMOVE FROM DATABASE");
                    String studentToRemove = userInput.nextLine();
                    studentList.remove(studentToRemove);
                    break;
                case "6":
                    for(String x2 : studentName){
                        System.out.println(x2);
                    }

            }
        }

    }

}

//        for (String x : stateName) {
//            System.out.println(x);
//            CapitalObjects asdf = stateCapitals.get(x);
//            System.out.println("Capital name: " + asdf.name);
