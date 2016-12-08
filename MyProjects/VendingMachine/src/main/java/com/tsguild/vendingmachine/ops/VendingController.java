/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vendingmachine.ops;

import com.tsguild.vendingmachine.dao.ItemDTO;
import com.tsguild.vendingmachine.dao.VendingDAO;
import com.tsguild.vendingmachine.ui.ConsoleIO;
import java.io.IOException;
import java.util.ArrayList;

public class VendingController {

    private ConsoleIO console;
    private VendingDAO dao;

    public void run() throws IOException {

        dao = new VendingDAO();
        console = new ConsoleIO();
        int matches = 0;
        double change = -1;

        double userMoney = console.readDouble("How much money are you taking to the "
                + "machine?", 0.0, 20.00);

        System.out.println("Items in machine:");
        ArrayList<ItemDTO> storedItems = dao.loadStock();
        for (ItemDTO x : storedItems) {
            console.print(x.getNameItem() + ": $" + x.getPrice());
            console.print("In stock: " + x.getStock());
            console.print("Enter " + x.getID() + " for this item");
            console.print(" ");
        }

        do {
            int userSelection = getSelection();

            for (ItemDTO x : storedItems) {
                if (userSelection == 0) {
                    change = userMoney;
                }
                if (x.getID() == userSelection) {
                    matches = 1;
                    if (x.getStock() == 0) {
                        console.print("That item is SOLD OUT");
                    } else if (x.getPrice() > userMoney) {
                        console.print("Not enough funds");
                    } else {
                        x.setStock(x.getStock() - 1);
                        change = transaction(userMoney, x.getPrice());
                    }
                }
            }
            if (matches == 0) {
                System.out.println("error");
            }
        } while (change < 0);

        System.out.println("Your change is: $" + change);
        giveChange(change);
        dao.writeStock();

    }

    private int getSelection() {
        int userSelection = console.readInt("What Item would you like? 0 = Quit", 0, 6);
        return userSelection;
    }

    private double transaction(double userMoney, double price) {
        double change = userMoney - price;
        return change;
    }

    private void giveChange(double change) {
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        for (double i = change; i > .24; i = i - .25) {
            quarters++;
        }

        change = change - (.25 * quarters);
        for (double i = change; i > .09; i = i - .1) {
            dimes++;
        }

        change = change - (.1 * dimes);
        for (double i = change; i > .04; i = i - .05) {
            nickels++;
        }

        change = change - (.05 * nickels);
        for (double i = change; i > .001; i = i - .01) {
            pennies++;
        }
        console.print(quarters + " quarters are dispensed");
        console.print(dimes + " dimes are dispensed");
        console.print(nickels + " nickels are dispensed");
        console.print(pennies + " pennies are dispensed");

    }
}
