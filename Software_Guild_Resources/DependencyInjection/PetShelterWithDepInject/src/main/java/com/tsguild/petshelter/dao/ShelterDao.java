/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelter.dao;

import com.tsguild.petshelter.dto.Pet;
import java.io.IOException;
import java.util.Collection;

/**
 *
 * @author ahill
 */
public interface ShelterDao {

    void addPet(Pet aPet);

    Collection<Pet> getAllPets();

    Pet getPet(int petId);

    void loadFromFile() throws IOException;

    Pet removePet(int petId);

    void saveToFile() throws IOException;

    void updatePet(Pet petToUpdate);
    
}
