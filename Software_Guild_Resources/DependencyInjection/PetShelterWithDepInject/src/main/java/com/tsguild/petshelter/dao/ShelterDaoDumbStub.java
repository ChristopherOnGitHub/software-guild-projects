/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelter.dao;

import com.tsguild.petshelter.dto.Pet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author ahill
 */
public class ShelterDaoDumbStub implements ShelterDao{

    Pet p;
    
    @Override
    public void addPet(Pet aPet) {
        p = aPet;
    }

    @Override
    public Collection<Pet> getAllPets() {
        List<Pet> pets = new ArrayList<>();
        if(p != null){
            pets.add(p);
        }
        return pets;
    }

    @Override
    public Pet getPet(int petId) {
        return p;
    }

    @Override
    public void loadFromFile() throws IOException {
        
    }

    @Override
    public Pet removePet(int petId) {
        Pet x = p;
        p = null;
        return x;
    }

    @Override
    public void saveToFile() throws IOException {
        
    }

    @Override
    public void updatePet(Pet petToUpdate) {
        p = petToUpdate;
    }
    
}
