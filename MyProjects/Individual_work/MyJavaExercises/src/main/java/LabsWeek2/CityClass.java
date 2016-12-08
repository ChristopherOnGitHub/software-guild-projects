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
public class CityClass {
    
    private final String state;
    public int population;
    
    
    CityClass(String state, int population){
        this.state = state;
        this.population = population;       
    }
    
    public String giveState(){
        return this.state;
    }
    
    public int givePopulation(){
        return this.population;
    }
    
    public int populationBoom(){
        this.population = this.population +1000;
        return this.population;
    }
    
    
}
