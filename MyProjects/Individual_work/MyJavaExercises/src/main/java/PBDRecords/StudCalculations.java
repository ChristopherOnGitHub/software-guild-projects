/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDRecords;

public class StudCalculations{      
    
    String name;
    int grade;
    double avg;

    public StudCalculations(String name, int grade, double avg) {
        this.name = name;
        this.grade = grade;
        this.avg = avg;
    }


    
    public double StudentAverage(double avg1, double avg2, double avg3){
        double total = avg1+avg2+avg3;
        double average = total/3;
        return average;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getAvg() {
        return avg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
    
    
    
}
