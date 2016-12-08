/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2;

/**
 *
 * @author apprentice
 */
public class School {
    public int numberOfStudents;
    private String name;
    private String address;

    public School(int numberOfStudents, String name, String address) {
        this.numberOfStudents = numberOfStudents;
        this.name = name;
        this.address = address;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
