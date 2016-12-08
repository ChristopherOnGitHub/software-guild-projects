/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelter.ops;

import com.tsguild.petshelter.dao.ShelterDao;
import com.tsguild.petshelter.dto.Pet;
import com.tsguild.petshelter.ui.ConsoleIO;
import java.io.IOException;
import java.util.Collection;

/**
 *
 * @author ahill
 */
public class ShelterController {

    private ConsoleIO console;
    private ShelterDao dao;

    public void run() {
        console = new ConsoleIO();
        dao = new ShelterDao();

        console.print("****** WELCOME TO THE PET SHELTER APP ******");
        try {
            dao.loadFromFile();
        } catch (IOException ex) {
            console.print("Unable to access file needed for records.");
            console.print("Please contact your system adminstrator.");
            return;
        }

        boolean keepRunning = true;
        while (keepRunning) {

            printMenu();
            int userChoice = console.readInt("Please enter a menu choice.", 1, 7);

            switch (userChoice) {

                case 1: // Add new
                    this.addNewPet();
                    break;
                case 2: // List all
                    this.listAllPets();
                    break;
                case 3: // Find by ID
                    this.findPetById();
                    break;
                case 4: // Find by Name
                    this.findPetByName();
                    break;
                case 5: // Delete
                    this.deletePet();
                    break;
                case 6: // Update
                    this.updatePet();
                    break;
                case 7:// Save & Quit
                    try {
                        dao.saveToFile();
                        keepRunning = false;
                    } catch (IOException ex) {
                        console.print("Unable to save to file.");
                        String ans = console.readString("Are you sure you want to quit?(y/n)");
                        if (ans.equalsIgnoreCase("y")) {
                            keepRunning = false;
                        }
                    }

                    break;
                default: // Error Will Robinson

            }

        }

    }

    private void printMenu() {
        console.print("****** SHELTER APP MENU ******");
        console.print("1. Add new pet");
        console.print("2. List all pets in shelter");
        console.print("3. Find pet by ID");
        console.print("4. Find pet by Name");
        console.print("5. Remove pet from shelter");
        console.print("6. Update pet's records");
        console.print("7. Save & Quit program");
    }

    private void addNewPet() {
        console.print("**** ADD NEW PET ****");
        Pet aPet = new Pet();
        int petId = console.readInt("Pet Id: ");

        while (dao.getPet(petId) != null) {
            console.print("A pet by that id already exists in records. Please select new Id.");
            petId = console.readInt("Pet Id: ");
        }

        String petName = console.readString("Pet Name: ");
        String petSpec = console.readString("Pet Species: ");
        String petCond = console.readString("Pet Condition: ");
        int petAge = console.readInt("Pet Age: ");

        aPet.setId(petId);
        aPet.setAge(petAge);
        aPet.setName(petName);
        aPet.setSpecies(petSpec);
        aPet.setCondition(petCond);

        dao.addPet(aPet);
        console.print("Your pet has been successfully added to the program.");

    }

    private void listAllPets() {
        console.print("**** CURRENT PETS IN SHELTER ****");

        Collection<Pet> pets = dao.getAllPets();
        if(pets.size() < 1)
            console.print("**** NO PETS CURRENTLY IN RECORDS ****");

        for (Pet p : pets) {
            console.print(p.getId() + ":" + p.getName());
        }

    }

    private void findPetById() {
        console.print("**** FIND PET BY ID ****");
        int petId = console.readInt("Pet Id: ");
        Pet foundPet = dao.getPet(petId);

        if (foundPet == null) {
            console.print("**** NO PETS BY THAT ID EXIST IN RECORDS ****");
        } else {
            console.print("**** PET RECORD FOR ID " + foundPet.getId() + " ****");
            console.print("NAME:      " + foundPet.getName());
            console.print("AGE:       " + foundPet.getAge());
            console.print("SPECIES:   " + foundPet.getSpecies());
            console.print("CONDITION: " + foundPet.getCondition());
        }
    }

    private void findPetByName() {
        console.print("**** FIND PET BY NAME ****");
        String petName = console.readString("Pet Name: ");
        Collection<Pet> pets = dao.getAllPets();

        int foundPets = 0;
        for (Pet p : pets) {
            if (p.getName().equalsIgnoreCase(petName)) {
                foundPets++;
                console.print("**** FOUND PET ****");
                console.print(p.getId() + " : " + p.getName());
                console.print(p.getSpecies() + ", and is " + p.getCondition());
                console.print(p.getAge() + "yrs old");
            }
        }

        if (foundPets == 0) {
            console.print("**** NO PETS BY THAT NAME EXIST IN RECORDS ****");
        } else {
            console.print("**** " + foundPets + " PETS FOUND ****");
        }

    }

    private void deletePet() {
        console.print("**** ADOPT OUT PET ****");
        int petId = console.readInt("Adopted Pet ID: ");

        Pet adoptedPet = dao.removePet(petId);

        if (adoptedPet == null) {
            console.print("**** NO PETS BY THAT ID EXIST IN RECORDS ****");
        } else {
            console.print(adoptedPet.getName() + " has been adopted! Awesome!");
            console.print("**** " + adoptedPet.getId() + " removed from available pets! ****");
        }
    }

    private void updatePet() {
        console.print("**** UPDATE PET RECORD ****");
        int petId = console.readInt("Pet ID: ");
        Pet pet = dao.getPet(petId);

        if (pet == null) {
            console.print("**** NO PETS BY THAT ID EXIST IN RECORDS ****");
            return;
        }
        
        console.print("Press Enter to keep existing info...");
        String name = console.readString("PET NAME (" + pet.getName() + "):");
        String condition = console.readString("PET CONDITION (" + pet.getCondition() + "):");
        String species = console.readString("PET SPECIES (" + pet.getSpecies() + "):");
        String ageString = console.readString("PET AGE (" + pet.getAge() + "):");

        if (!name.isEmpty()) {
            pet.setName(name);
        }
        if (!condition.isEmpty()) {
            pet.setCondition(condition);
        }
        if (!species.isEmpty()) {
            pet.setSpecies(species);
        }
        if (!ageString.isEmpty()) {
            try {
                int age = Integer.parseInt(ageString);
            } catch (NumberFormatException e) {
                console.print("Please enter a valid number for the age, or a -# to keep current age.");
                int age = console.readInt("PET AGE (" + pet.getAge() + "):");
                if (age > 0) {
                    pet.setAge(age);
                }
            }
        }

        
        dao.updatePet(pet);

    }
    
    private void printPet(Pet pet){
            console.print("**** PET RECORD FOR ID " + pet.getId() + " ****");
            console.print("NAME:      " + pet.getName());
            console.print("AGE:       " + pet.getAge());
            console.print("SPECIES:   " + pet.getSpecies());
            console.print("CONDITION: " + pet.getCondition());
    }

}
