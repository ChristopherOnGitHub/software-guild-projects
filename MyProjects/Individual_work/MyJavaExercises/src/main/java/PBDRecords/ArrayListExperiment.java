/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDRecords;


import static PBDMethods.FunctionCallAlphabet.i;
import java.util.ArrayList;
import java.util.Scanner;

class CarArray{
    String make;
    String model;
    int year;
    String license;
    
    public String printCar(){
    
        return(this.make+" "+this.model+" "+this.year+" "+this.license);
}
    
}


public class ArrayListExperiment {
    public static void main(String[] args) {
        
    }
    
    
		CarArray[] car = new CarArray[5];

		Scanner fin = new Scanner(System.in);

//		for(int i=0; i<5; i++ ){
//			car[i] = new car();
//			car[i].street = fin.nextLine();
//			car[i].city   = fin.nextLine();
//			car[i].state  = fin.next();
//			car[i].zip    = fin.nextInt();
//			fin.skip("\n");
		}  

    
//}
