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
public class GameStore {
    public static void main(String[] args) {
        
        VideoGame skyrim = new VideoGame();
        BoardGame agricola = new BoardGame();
//        Game whatever = new Game();
        
        skyrim.play();
        agricola.play();
        
        
    }
}
