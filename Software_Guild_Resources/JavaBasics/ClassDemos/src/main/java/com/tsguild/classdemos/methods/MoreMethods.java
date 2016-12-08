/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.methods;

/**
 *
 * @author apprentice
 */
public class MoreMethods {
    
    public static int addInts(int numOne, int numTwo){
        return numOne + numTwo;
    }
    
    public static String aminalNames(int x){
        String aminalName = "";
        
        switch(x){
            case 1:
            aminalName = "Bonobo";
            break;
            
            case 3:
                aminalName = "Llama";
                break;
            
            case 5:
                aminalName = "Squirrel";
                break;
        }
        
        return aminalName;
    }
    
    public static String greeting(String name){
        if(!name.isEmpty()){
            return "Hello " + name;
        } else{
            return "Hey, who are you?!?!";
        }
    }
    
    public boolean and(boolean a, boolean b){
        return a && b;
    }
    
    public boolean and(boolean a, boolean b, boolean c){
        return and(a, b) && c;
    }
    
}
