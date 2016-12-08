/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDRecords;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SortingSrings {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileReader = new Scanner(new BufferedReader(new FileReader("Cars.txt")));

        carObject highlander = new carObject(fileReader.next(), fileReader.next(),
                fileReader.nextInt(), fileReader.next());

        carObject grandAm = new carObject(fileReader.next(), fileReader.next(),
                fileReader.nextInt(), fileReader.next());

        carObject focus = new carObject(fileReader.next(), fileReader.next(),
                fileReader.nextInt(), fileReader.next());

        carObject neon = new carObject(fileReader.next(), fileReader.next(),
                fileReader.nextInt(), fileReader.next());

        carObject escalade = new carObject(fileReader.next(), fileReader.next(),
                fileReader.nextInt(), fileReader.next());
        
        
        carObject[] y = {highlander, grandAm, focus, neon, escalade};
        
        while((y[0].make.compareTo(y[1].make) > 0) || (y[1].make.compareTo(y[2].make) > 0) 
                || (y[2].make.compareTo(y[3].make) > 0)
                || (y[3].make.compareTo(y[4].make) > 0)){
        
        for (int i = 1; i < y.length; i++) {
            
            carObject[] z = {y[i]};
            
            if (y[i-1].make.compareTo(y[i].make) > 0){
                z[0] = y[i];
                y[i] = y[i-1];
                y[i-1] = z[0];
            }
            
            }
        }
        System.out.println("Car 1: "+y[0].make+ " " +y[0].model);
        System.out.println(y[0].year +" plate#: "+y[0].license);
        System.out.println("");
        System.out.println("Car 2: "+y[1].make+ " " +y[1].model);
        System.out.println(y[1].year +" plate#: "+y[1].license);
        System.out.println("");
        System.out.println("Car 3: "+y[2].make+ " " +y[2].model);
        System.out.println(y[2].year +" plate#: "+y[2].license);
        System.out.println("");
        System.out.println("Car 4: "+y[3].make+ " " +y[3].model);
        System.out.println(y[3].year +" plate#: "+y[3].license);
        System.out.println("");
        System.out.println("Car 5: "+y[4].make+ " " +y[4].model);
        System.out.println(y[4].year +" plate#: "+y[4].license);
        System.out.println("");        
    }

    private static class carObject {

        private String make;
        private String model;
        private int year;
        private String license;

        public carObject(String make, String model, int year, String license) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.license = license;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public String getLicense() {
            return license;
        }

    }

}
