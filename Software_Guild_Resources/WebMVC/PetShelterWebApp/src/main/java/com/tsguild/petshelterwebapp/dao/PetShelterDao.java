/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapp.dao;

import com.tsguild.petshelterwebapp.dto.Pet;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 *
 * @author ahill
 */
public interface PetShelterDao {
    
    // We're gonna crud, like we've never (or actually, always) crudded before...
    
    // CREATE
    public Pet addPet(Pet pet);
    
    // READ
    public Pet getPetById(int petId);
    public List<Pet> getAllPets();
    
    // UPDATE
    public void updatePet(Pet pet);
    
    // DELETE
    public void removePet(int petId);
    
    // SEARCH
    public List<Pet> searchPets(Map<SearchTerm, String> criteria);
    public List<Pet> searchPets(Predicate<Pet> filter); 
    
    
}
