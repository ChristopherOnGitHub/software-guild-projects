/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.tsguild.petshelterwebapp.dao.PetShelterDao;
import com.tsguild.petshelterwebapp.dto.Pet;
import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 *
 * @author ahill
 */

@Controller
public class HomeController {
    
    private PetShelterDao dao;
    
    @Inject
    public HomeController(PetShelterDao dao){
        this.dao = dao;
    }
    
    @RequestMapping(value={"/", "/home"}, method=RequestMethod.GET)
    public String displayHomePage(){
        return "home";
    }
    
    
    // CREATE A PET (/pet , POST)
    // Incoming - PET via RequestBody
    // Outgoing - PET via ResponseBody
    // Status - CREATE
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value="/pet", method=RequestMethod.POST)
    public Pet createPet(@Valid @RequestBody Pet incomingPet){
        dao.addPet(incomingPet);
        return incomingPet;
    }

    // GET ALL PETS (/pets , GET)
    // Incoming - Nothing extra
    // Outgoing - LIST of ALL PETs via ResponseBody
    // Status - OK
    @ResponseBody
    @RequestMapping(value="/pets", method=RequestMethod.GET)
    public List<Pet> getAllPets(){
        return dao.getAllPets();
    }
    
    // GET PET BY ID (/pet/{id}, GET)
    // Incoming - PETID via PathVariable
    // Outgoing - PET via ResponseBody
    // Status - OK
    @ResponseBody
    @RequestMapping(value="/pet/{id}", method=RequestMethod.GET)
    public Pet getPetById(@PathVariable("id")int petId){
        return dao.getPetById(petId);
    }
    
    // UPDATE PET (/pet/{id}, PUT)
    // Incoming - PETID via PathVariable & PET via RequestBody
    // Outgoing - nada
    // Status - NO_CONTENT
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value="/pet/{petId}", method=RequestMethod.PUT)
    public void updatePet(@PathVariable int petId, @RequestBody Pet updatedPet){
        updatedPet.setId(petId);
        dao.updatePet(updatedPet);
    }
    
    // ADOPT PET (/pet/{id}, DELETE)
    // Incoming - PETID via PathVariable
    // Outgoing - Nada
    // Status - NO_CONTENT
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value="/pet/{id}", method=RequestMethod.DELETE)
    public void adoptPet(@PathVariable int id){
        dao.removePet(id);
    }
}
