/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.oo.interfaces.dogs;

/**
 *
 * @author ahill
 */
public class Dog extends Animal
        implements Huggable {

    private String name;

    @Override
    public void hug() {
        System.out.println("I love you puppy!! WOOF WOOF!");
    }
}
