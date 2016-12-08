/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

/**
 *
 * @author apprentice
 */
public class Material {
    
    private String type;
    private double costSqFt;
    private double laborSqFt;

    public Material(String type, double costSqFt, double laborSqFt) {
        this.type = type;
        this.costSqFt = costSqFt;
        this.laborSqFt = laborSqFt;
    }

    public String getType() {
        return type;
    }

    public double getCostSqFt() {
        return costSqFt;
    }

    public double getLaborSqFt() {
        return laborSqFt;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCostSqFt(double costSqFt) {
        this.costSqFt = costSqFt;
    }

    public void setLaborSqFt(double laborSqFt) {
        this.laborSqFt = laborSqFt;
    }



    
}
