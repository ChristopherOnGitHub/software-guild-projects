/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.methods;

/**
 * Ï
 *
 * @author ahill
 */
public class UsingMoreMethods {

    public static void main(String[] args) {

        // Static methods in a different class reference a method by
        // ClassName.methodName(params)
        int added = MoreMethods.addInts(0, 0); // Return values need to be stored or they are lost.
        System.out.println(MoreMethods.addInts(120, 45)); // But you can also work with them directly.
        System.out.println(added);

        added = MoreMethods.addInts(4, 90);
        System.out.println(added);

        // To use non static methods in a static method
        // the class that encloses it has to be instantiated first.
        MoreMethods bob = new MoreMethods(); // Objects of the same class
        MoreMethods sue = new MoreMethods(); // have access to the same methods.

        System.out.println(bob.and(true, true));
        System.out.println(sue.and(true, false, true));

    }
}
