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
public class Managers {
    private String name;
    private int IdentificationNumber;
    public double PayRate;
    public boolean hasMoustache;

    public Managers(String name, int IdentificationNumber, double PayRate, boolean hasMoustache) {
        this.name = name;
        this.IdentificationNumber = IdentificationNumber;
        this.PayRate = PayRate;
        this.hasMoustache = hasMoustache;
    }

    public String getName() {
        return name;
    }

    public int getIdentificationNumber() {
        return IdentificationNumber;
    }

    public double getPayRate() {
        return PayRate;
    }

    public boolean isHasMoustache() {
        return hasMoustache;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentificationNumber(int IdentificationNumber) {
        this.IdentificationNumber = IdentificationNumber;
    }

    public void setPayRate(double PayRate) {
        this.PayRate = PayRate;
    }

    public void setHasMoustache(boolean hasMoustache) {
        this.hasMoustache = hasMoustache;
    }
    
    
    
}
