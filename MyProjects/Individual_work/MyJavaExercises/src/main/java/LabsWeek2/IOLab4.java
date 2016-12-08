/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabsWeek2;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class IOLab4 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("PLEASE PROVIDE AN INTEGER");
        int y = x.nextInt();
        while (y < 0) {
            System.out.println("PLEASE PROVIDE AN INTEGER, REALLY");
            y = x.nextInt();
        }

        System.out.println("PLEASE PROVIDE A POSITIVE INTEGER");
        IOCalculator.getIntXInRange();

        System.out.println("PLEASE PROVIDE A STRING");
        IOCalculator.getStringX();

        System.out.println("PLEASE PROVIDE A FLOAT");
        IOCalculator.getFloatX();

        System.out.println("PLEASE PROVIDE A POSITIVE FLOAT");
        IOCalculator.getFloatXInRange();

        System.out.println("PLEASE PROVIDE A DOUBLE ");
        IOCalculator.getDoubleX();

        System.out.println("PLEASE PROVIDE A POSITIVE DOUBLE");
        IOCalculator.getDoubleXInRange();
    }

}
