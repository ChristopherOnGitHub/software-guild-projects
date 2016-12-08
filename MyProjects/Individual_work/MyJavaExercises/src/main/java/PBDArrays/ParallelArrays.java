/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDArrays;

import java.util.Scanner;


public class ParallelArrays {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        int[] idNumber = {123456, 813225, 823669, 307760, 827131};
        String[] studentNames = {"Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks"};
        double[] studentGrade = {99.5, 78.5, 95.6, 96.8, 82.7};
        
            for(int i=0; i<idNumber.length; i++){
                System.out.print(studentNames[i]+"    ");
                System.out.print(idNumber[i]+"  ");
                System.out.println(studentGrade[i]);
                }
            
            System.out.println("  ");
            System.out.println("ID number to find: ");
            int enteredID = userInput.nextInt();
            
            switch(enteredID){
                case 123456:
                    System.out.println(studentNames[0]+"'s grade is: "+studentGrade[0]);
                    break;
                case 813225:
                    System.out.println(studentNames[1]+"'s grade is: "+studentGrade[1]);
                    break;                    
                case 823225:
                    System.out.println(studentNames[2]+"'s grade is: "+studentGrade[2]);
                    break;
                case 307760:
                    System.out.println(studentNames[3]+"'s grade is: "+studentGrade[3]);
                    break;                    
                case 827131:
                    System.out.println(studentNames[4]+"'s grade is: "+studentGrade[4]);
                    break; 
                default:
                    System.out.println("YOU HAVE ENTERED AN INCORRECT ID AND HAVE"
                            + "BEEN PERMANENTLY BANNED. GOOD DAY SIR!");
            }
                    
            
    }
}
