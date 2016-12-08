/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.collections;

/**
 *
 * @author ahill
 */
public class Llama {
    private String name;
    private int age;
    private String woolType;
    
    public Llama(String name, 
                    int age, 
                    String woolType){
        
        this.name = name;
        this.age = age;
        this.woolType = woolType;
        
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getWoolType(){
        return woolType;
    }
    
}
