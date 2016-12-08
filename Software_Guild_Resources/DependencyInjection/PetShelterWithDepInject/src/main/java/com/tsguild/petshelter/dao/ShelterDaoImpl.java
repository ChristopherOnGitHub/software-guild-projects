/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelter.dao;

import com.tsguild.petshelter.dto.Pet;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahill
 */
public class ShelterDaoImpl implements ShelterDao {

    private final String FILE_NAME;
    private HashMap<Integer, Pet> shelterPets;
    private final String DELIMITER = "::";

    public ShelterDaoImpl() {
        FILE_NAME = "ShelterPets.txt";
        shelterPets = new HashMap<>();
    }

    @Override
    public void addPet(Pet aPet) {
        shelterPets.put(aPet.getId(), aPet);
    }

    @Override
    public Collection<Pet> getAllPets() {
        return shelterPets.values();
    }

    @Override
    public Pet getPet(int petId) {
        return shelterPets.get(petId);
    }

    @Override
    public void updatePet(Pet petToUpdate) {
        shelterPets.put(petToUpdate.getId(), petToUpdate);
    }

    @Override
    public Pet removePet(int petId) {
        return shelterPets.remove(petId);
    }

    @Override
    public void loadFromFile() throws IOException {

        try {
            Scanner catScanner = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

            // While there are still lines in the file to read - keep reading them!
            while (catScanner.hasNextLine()) {
                String petLine = catScanner.nextLine();

                String[] petProperties = petLine.split(DELIMITER);

                if (petProperties.length != 5) {
                    continue;
                }

                Pet aPet = new Pet();

                aPet.setName(petProperties[1]);
                aPet.setSpecies(petProperties[2]);
                aPet.setCondition(petProperties[3]);

                try {
                    int petId = Integer.parseInt(petProperties[0]);
                    int petAge = Integer.parseInt(petProperties[4]);

                    // If I get here, I know the previous two lines haven't exploded.
                    aPet.setId(petId);
                    aPet.setAge(petAge);

                } catch (NumberFormatException e) {
                    continue;
                }

                shelterPets.put(aPet.getId(), aPet);

            }

            catScanner.close();

        } catch (FileNotFoundException ex) {
            new FileWriter(FILE_NAME);
        }

    }

    @Override
    public void saveToFile() throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));

        for (Pet p : shelterPets.values()) {
            writer.println(p.getId() + DELIMITER
                    + p.getName() + DELIMITER
                    + p.getSpecies() + DELIMITER
                    + p.getCondition() + DELIMITER
                    + p.getAge());
        }

        writer.flush();
        writer.close();
    }
}
