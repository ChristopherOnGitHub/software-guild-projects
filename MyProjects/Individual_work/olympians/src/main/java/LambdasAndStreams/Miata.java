/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdasAndStreams;

/**
 *
 * @author apprentice
 */
public class Miata extends Car {

    public Miata(String color) {
        this.color = color;
        this.make = "Mazda";
        this.model = "Miata";
        this.canFloat = false;
    }

    @Override
    public String beep() {
        String x = "*Muffled underwater beep*";
        return x;
    }

}
