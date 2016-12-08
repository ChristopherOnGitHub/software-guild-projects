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
public class Students {
    private final String name;
    private final int age;
    private final double height;
    public boolean onBasketballTeam;

    public Students(String name, int age, double height, boolean onBasketballTeam) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.onBasketballTeam = onBasketballTeam;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public boolean isOnBasketballTeam() {
        return onBasketballTeam;
    }

    public void setOnBasketballTeam(boolean onBasketballTeam) {
        this.onBasketballTeam = onBasketballTeam;
    }    
    
}
