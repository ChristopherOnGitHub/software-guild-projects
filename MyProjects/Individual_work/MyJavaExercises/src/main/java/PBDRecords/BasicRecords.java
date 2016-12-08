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
public class BasicRecords {
    public static void main(String[] args) {
        
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the first student's name?");
        String s1name = userInput.nextLine();
        System.out.println("What year of school is this student in?");
        int s1grade = userInput.nextInt();
        System.out.println("What is this student's current average in school?");
        double s1avg = userInput.nextDouble();
        
        System.out.println("What is the first student's name?");
        userInput.nextLine();
        String s2name = userInput.nextLine();
        System.out.println("What year of school is this student in?");
        int s2grade = userInput.nextInt();
        System.out.println("What is this student's current average in school?");
        double s2avg = userInput.nextDouble(); 
        
        System.out.println("What is the first student's name?");
        userInput.nextLine();
        String s3name = userInput.nextLine();
        System.out.println("What year of school is this student in?");
        int s3grade = userInput.nextInt();
        System.out.println("What is this student's current average in school?");
        double s3avg = userInput.nextDouble();        
               
        StudCalculations Student1 = new StudCalculations(s1name, s1grade, s1avg);
        StudCalculations Student2 = new StudCalculations(s2name, s2grade, s2avg);
        StudCalculations Student3 = new StudCalculations(s3name, s3grade, s3avg);
        
        System.out.println("The student's names are: "+Student1.getName()+", "
        +Student2.getName()+", "+Student3.getName());
        System.out.println("The student's years in school are: "+Student1.grade
        +", "+Student2.grade+", "+Student3.grade);
        System.out.println("The student's averages are: "+Student1.avg+", "+Student2.avg
        +", "+Student3.avg);
        
        double total = Student1.avg+Student2.avg+Student3.avg;
        double overallAverage=total/3;
        System.out.println("The overall average for the 3 students is: "+overallAverage);

                
    }

    
}
