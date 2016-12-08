/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapplication;

import com.tsguild.petshelterwebapplication.dao.PetShelterDao;
import com.tsguild.petshelterwebapplication.dto.Pet;
import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author apprentice
 */

@Controller
public class HomeController {
    
    private final PetShelterDao dao;
    
    @Inject
    public HomeController(PetShelterDao dao){
        this.dao = dao;
    }
 
    @RequestMapping(value={"/", "/home"}, method=RequestMethod.GET)
    public String displayHomePage(){
        return "home";
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value="/pet", method=RequestMethod.POST)
    public Pet createPet(@Valid @RequestBody Pet incomingPet){
        dao.addPet(incomingPet);
        return incomingPet;
    }
    
    @ResponseBody
    @RequestMapping(value="/pets", method=RequestMethod.GET)
    public List<Pet> getAllPets(){
        return dao.getAllPets();
    }
    
    @ResponseBody
    @RequestMapping(value="/pet/{id}", method=RequestMethod.GET)
    public Pet getPetById(@PathVariable("id")int petId){
        return dao.getPetById(petId);
    }
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value="/pet/{petId}", method=RequestMethod.PUT)
    public void updatePet(@PathVariable int petId, @RequestBody Pet updatedPet){
        updatedPet.setId(petId);
        dao.updatePet(updatedPet);
    }
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value="/pet/{petId}", method=RequestMethod.DELETE)
    public void adoptPet(@PathVariable int petId){
        dao.removePet(petId);
    }
            
}