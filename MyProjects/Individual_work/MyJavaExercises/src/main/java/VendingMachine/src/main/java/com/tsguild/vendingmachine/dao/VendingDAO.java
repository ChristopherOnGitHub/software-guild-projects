/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vendingmachine.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class VendingDAO {

    private final String NAME_FILE = "VendingStock";
    private final String DELIMITER = "::";
    ArrayList<ItemDTO> ItemsAL = new ArrayList<>();

    public ArrayList<ItemDTO> loadStock() throws IOException {

        try {
            Scanner scanRead = new Scanner(new BufferedReader(new FileReader(NAME_FILE)));
            String chipsRead = scanRead.nextLine();

            String[] chipsLine = chipsRead.split(DELIMITER);
            int idChips = Integer.parseInt(chipsLine[0]);
            String nameChips = chipsLine[1];
            double priceChips = Double.parseDouble(chipsLine[2]);
            int stockChips = Integer.parseInt(chipsLine[3]);

            String gumRead = scanRead.nextLine();

            String[] gumLine = gumRead.split(DELIMITER);
            int idGum = Integer.parseInt(gumLine[0]);
            String nameGum = gumLine[1];
            double priceGum = Double.parseDouble(gumLine[2]);
            int stockGum = Integer.parseInt(gumLine[3]);

            String mintsRead = scanRead.nextLine();

            String[] mintsLine = mintsRead.split(DELIMITER);
            int idMints = Integer.parseInt(mintsLine[0]);
            String nameMints = mintsLine[1];
            double priceMints = Double.parseDouble(mintsLine[2]);
            int stockMints = Integer.parseInt(mintsLine[3]);

            String chocRead = scanRead.nextLine();

            String[] chocLine = chocRead.split(DELIMITER);
            int idChoc = Integer.parseInt(chocLine[0]);
            String nameChoc = chocLine[1];
            double priceChoc = Double.parseDouble(chocLine[2]);
            int stockChocBar = Integer.parseInt(chocLine[3]);

            String crackersRead = scanRead.nextLine();

            String[] crackersLine = crackersRead.split(DELIMITER);
            int idCrack = Integer.parseInt(crackersLine[0]);
            String nameCrack = crackersLine[1];
            double priceCrack = Double.parseDouble(crackersLine[2]);
            int stockCrackers = Integer.parseInt(crackersLine[3]);

            String ribeyeRead = scanRead.nextLine();

            String[] ribeyeLine = ribeyeRead.split(DELIMITER);
            int idRibeye = Integer.parseInt(ribeyeLine[0]);
            String nameRibeye = ribeyeLine[1];
            double priceRibeye = Double.parseDouble(ribeyeLine[2]);
            int stockRibeye = Integer.parseInt(ribeyeLine[3]);

            ItemDTO chips = new ItemDTO(idChips, nameChips, priceChips, stockChips);
            ItemDTO gum = new ItemDTO(idGum, nameGum, priceGum, stockGum);
            ItemDTO mints = new ItemDTO(idMints, nameMints, priceMints, stockMints);
            ItemDTO chocBar = new ItemDTO(idChoc, nameChoc, priceChoc, stockChocBar);
            ItemDTO crackers = new ItemDTO(idCrack, nameCrack, priceCrack, stockCrackers);
            ItemDTO ribeyeSteak = new ItemDTO(idRibeye, nameRibeye, priceRibeye, stockRibeye);

            ItemsAL.add(chips);
            ItemsAL.add(gum);
            ItemsAL.add(mints);
            ItemsAL.add(chocBar);
            ItemsAL.add(crackers);
            ItemsAL.add(ribeyeSteak);

        } catch (FileNotFoundException e) {
            new FileWriter(NAME_FILE);
        }
        return ItemsAL;
    }

    public void writeStock() throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter(NAME_FILE));

        for (int i = 0; i < 6; i++) {
            ItemDTO x = ItemsAL.get(i);
            
            writer.println(x.getID() + DELIMITER
                    + x.getNameItem() + DELIMITER
                    + x.getPrice() + DELIMITER
                    + (x.getStock()) + DELIMITER);

        }

        writer.flush();
        writer.close();

    }

}
