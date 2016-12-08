/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapp.controller;

import com.tsguild.petshelterwebapp.dao.PetShelterDao;
import com.tsguild.petshelterwebapp.dto.Pet;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ahill
 */
@Controller
//@RequestMapping(value="/ajaxFree")
public class HomeControllerNoAjax {

    private PetShelterDao dao;

    @Inject
    public HomeControllerNoAjax(PetShelterDao dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/ajaxFree/editWithSpringValidated", method = RequestMethod.POST)
    public String processEditFormWithSpring(@Valid @ModelAttribute("editThisPet") Pet editedPet,
            BindingResult thingsThatGoWrongWhenMakingPet) {

        if (thingsThatGoWrongWhenMakingPet.hasErrors()) {
            return "noAjax/editPetSpringFormValidation";
        }

        dao.updatePet(editedPet);
        return "redirect:/ajaxFree/home";
    }

    @RequestMapping(value = "/ajaxFree/editWithSpring", method = RequestMethod.POST)
    public String processEditFormWithSpring(@ModelAttribute("editThisPet") Pet editedPet) {
        dao.updatePet(editedPet);
        return "redirect:/ajaxFree/home";
    }

    @RequestMapping(value = "/ajaxFree/edit", method = RequestMethod.GET)
    public String displayPetEditNoAjax(Model model, HttpServletRequest request) {
        String petToEditId = request.getParameter("petId");
        try {
            // get out the id and try to parse it
            int petId = Integer.parseInt(petToEditId);
            // if it parses correctly - then this block continues as per normal!
            Pet p = dao.getPetById(petId);
            model.addAttribute("editThisPet", p);
            return "noAjax/editPetSpringFormValidation";
        } catch (NumberFormatException e) {
            // if explodes, go back to home - data is bad
            return "redirect:/ajaxFree/home";
        }
    }

    @RequestMapping(value = "/ajaxFree/adopt", method = RequestMethod.GET)
    public String adoptPetOut(HttpServletRequest request) {
        String petIdString = request.getParameter("petId");
        int id = Integer.parseInt(petIdString);
        dao.removePet(id);
        return "redirect:/ajaxFree/home";
    }

    @RequestMapping(value = "/ajaxFree/home", method = RequestMethod.GET)
    public String displayPetShelterNoAjax(Model model) {
        model.addAttribute("petList", dao.getAllPets());
        return "noAjax/main";
    }

    @RequestMapping(value = "/ajaxFree/add", method = RequestMethod.GET)
    public String displayNoAjaxAddForm() {
        return "noAjax/addPet";
    }

    @RequestMapping(value = "/ajaxFree/edit", method = RequestMethod.POST)
    public String processEditFormOldSchool(HttpServletRequest request) {
        String idString = request.getParameter("petId");
        String nameString = request.getParameter("petName");
        String breedString = request.getParameter("petBreed");
        String dispString = request.getParameter("petDisp");
        String vaccString = request.getParameter("petVacc");

        int id = Integer.parseInt(idString);
        boolean vaccinated = "si".equals(vaccString);

        Pet editedPet = new Pet(id, nameString, breedString, dispString, vaccinated);
        dao.updatePet(editedPet);

        return "redirect:/ajaxFree/home";
    }

    @RequestMapping(value = "/ajaxFree/add", method = RequestMethod.POST)
    public String processNoAjaxAddForm(HttpServletRequest request) {
        String name = request.getParameter("petName");
        String breed = request.getParameter("petBreed");
        String disposition = request.getParameter("petDisp");
        String isVaccinated = request.getParameter("vaccinated");

        if (name != null && !name.isEmpty()
                && breed != null && !breed.isEmpty()
                && disposition != null && !disposition.isEmpty()
                && isVaccinated != null && !isVaccinated.isEmpty()) {

            Pet newPet;
            if (isVaccinated.equals("si")) {
                newPet = new Pet(-1, name, breed, disposition, true);
            } else {
                newPet = new Pet(-1, name, breed, disposition, false);
            }

            dao.addPet(newPet);
            return "redirect:/ajaxFree/home";

        }

        return "noAjax/addPet";
    }

    @RequestMapping(value = "/addPets", method = RequestMethod.GET)
    public String addRandomPets(Model model) {
        Pet fido = new Pet();
        fido.setName("Fido");
        fido.setBreed("Puppy");
        fido.setDisposition("Extra friendly.");
        fido.setVaccinated(true);
        dao.addPet(fido);
        model.addAttribute("petList", dao.getAllPets());
        return "noAjax/main";
    }

}
