/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vendingmachine.dao;

/**
 *
 * @author apprentice
 */
public class ItemDTO {
    
    private int ID;
    private String nameItem;
    private double price;
    private int stock;

    public ItemDTO(int ID, String nameItem, double price, int stock) {
        this.ID = ID;
        this.nameItem = nameItem;
        this.price = price;
        this.stock = stock;
    }

    public String getNameItem() {
        return nameItem;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getID() {
        return ID;
    }
    
    

}
