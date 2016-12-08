/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2contd;

public class StudentObject {
    
    public String name;
    public double test1;
    public double test2;
    public double test3;
        

    public StudentObject(String name, double test1, double test2, double test3) {
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    public String getName() {
        return name;
    }

    public double getTest1() {
        return test1;
    }

    public double getTest2() {
        return test2;
    }

    public double getTest3() {
        return test3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTest1(double test1) {
        this.test1 = test1;
    }

    public void setTest2(double test2) {
        this.test2 = test2;
    }

    public void setTest3(double test3) {
        this.test3 = test3;
    }

    


    
    
}

