/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2contd;

class CapitalObjects{
    public String name;
    public int population; 
    public double size;

    public CapitalObjects(String name, int population, double size) {
        this.name = name;
        this.population = population;
        this.size =  size;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getSize() {
        return size;
    }
   
}