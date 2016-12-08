/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.basics;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Scanner;

/**
 *
 * @author ahill
 */
public class Inputs {

    public static void main(String[] args) {

        Scanner ui = new Scanner(System.in);

//        System.out.println("Give me a number: ");
        String input = ui.nextLine();
        
        do{
            System.out.println("Give me a number: ");
            
            
        }while(!ui.hasNextInt());

        int x = ui.nextInt();

    }

}
