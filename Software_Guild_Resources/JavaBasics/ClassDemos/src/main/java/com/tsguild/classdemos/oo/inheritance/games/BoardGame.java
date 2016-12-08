/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classdemos.oo.inheritance.games;

/**
 *
 * @author ahill
 */
public class BoardGame extends Game{

    @Override
    public void play() {
        System.out.println("I am playing a board game, yo.");
    }
    
}
