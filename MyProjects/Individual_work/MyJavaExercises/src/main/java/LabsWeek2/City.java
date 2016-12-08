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
public class City {
    public static void main(String[] args) {
        
    
    
    CityClass Louisville = new CityClass("Kentucky", 760026);
    CityClass Evansville = new CityClass("Indiana", 120346);
    CityClass Lexington = new CityClass("Kentucky", 290263);
    CityClass Nashville = new CityClass("Tennessee", 678889);
    CityClass Princeton = new CityClass("Indiana", 8644);
    CityClass Marion = new CityClass("Kentucky", 2986);
    
        System.out.println("Louisville "+Louisville.giveState()+", "+Louisville.givePopulation());
        System.out.println("Nashville "+Nashville.giveState()+", "+Nashville.givePopulation());
        System.out.println("Lexington "+Lexington.giveState()+", "+Lexington.givePopulation());
        System.out.println("Evansville "+Evansville.giveState()+", "+Evansville.givePopulation());
        System.out.println("Princeton "+Princeton.giveState()+", "+Princeton.givePopulation());
        System.out.println("Marion "+Marion.giveState()+", "+Marion.givePopulation());
        
        Marion.populationBoom();
        Marion.populationBoom();
        Marion.populationBoom();
        Marion.populationBoom();
        Marion.populationBoom();
        Marion.populationBoom();
        System.out.println("  ");
        System.out.println("  ");
        
        System.out.println("Princeton "+Princeton.giveState()+", "+Princeton.givePopulation());
        System.out.println("Marion "+Marion.giveState()+", "+Marion.givePopulation());       
        
    
    } 
}
