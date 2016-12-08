/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapplication.dao;

import com.tsguild.petshelterwebapplication.dto.Pet;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 *
 * @author apprentice
 */
public interface PetShelterDao {
    
    public Pet addPet(Pet pet);
    
    public Pet getPetById(int petId);
    public List<Pet> getAllPets();
    
    public void updatePet(Pet pet);
    
    public void removePet(int petId);
    
    public List<Pet> searchPets(Map<SearchTerm, String> criteria);
    public List<Pet> searchPets(Predicate<Pet> filter);
    
}
