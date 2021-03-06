/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapplication.dao;

import com.tsguild.petshelterwebapplication.dto.Pet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class PetShelterDAOImpl implements PetShelterDao {

    private Map<Integer, Pet> petMap = new HashMap<>();
    private static int petIdCounter = 0;

    @Override
    public Pet addPet(Pet pet) {
        pet.setId(petIdCounter);
        petMap.put(petIdCounter, pet);
        petIdCounter++;
        return pet;

    }

    @Override
    public Pet getPetById(int petId) {
        return petMap.get(petId);
    }

    @Override
    public List<Pet> getAllPets() {
        return petMap.values().stream().collect(Collectors.toList());
    }

    @Override
    public void updatePet(Pet pet) {
        petMap.put(petIdCounter, pet);
    }

    @Override
    public void removePet(int petId) {
        petMap.remove(petId);
    }

    @Override
    public List<Pet> searchPets(Map<SearchTerm, String> criteria) {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }

    @Override
    public List<Pet> searchPets(Predicate<Pet> filter) {
        return petMap.values().stream()
                .filter(filter).collect(Collectors.toList());
    }

}
