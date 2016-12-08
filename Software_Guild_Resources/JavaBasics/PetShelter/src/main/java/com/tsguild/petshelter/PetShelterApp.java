/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ahill
 */
public class PetShelterApp {

    static Scanner sc = new Scanner(System.in);
    final static String FILE_NAME = "ShelterInfo/AllDaShelterPets.txt";
    final static String DELIMITER = "::";

    public static void main(String[] args) throws IOException {

        HashMap<Integer, Pet> petShelter = loadPetsFromFile();

        boolean keepRunning = true;

        while (keepRunning) {

            PetShelterApp.printMenu();
            int userChoice = getNum("Please make a selection:");

            switch (userChoice) {
                case 1: // New Pet
                    Pet newPet = addNewPet();
                    petShelter.put(newPet.getId(), newPet);
                    break;
                case 2: // List Pets
                    System.out.println("***** CURRENT PETS IN SHELTER *****");
                    int counter = 0;
                    for (Pet p : petShelter.values()) {
                        System.out.print(p.getId());
                        System.out.print(" : ");
                        System.out.println(p.getName());

                        if (counter > 20) {
                            counter = 0;
                            System.out.println("Press enter to continue ...");
                            sc.nextLine();
                        }

                        counter++;
                    }
                    break;
                case 3: // Find Pet
                    int petId = getNum("Please enter the Pet Id:");
                    Pet foundPet = petShelter.get(petId);
                    if(foundPet == null){
                        System.out.println("I am sorry. There is no record associated w/ that ID.");
                    } else{
                        System.out.println("PET ID#" + foundPet.getId());
                        System.out.println("Name: " + foundPet.getName());
                        System.out.println("Species: " + foundPet.getSpecies());
                        System.out.println("Current Condition: " + foundPet.getCondition());
                    }
                    
                    System.out.println("Press enter to continue ...");
                    sc.nextLine();
                    break;
                case 4: // Save & Exit
                    PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));

                    for (Pet p : petShelter.values()) {

                        // Write out all of the information in the way that we had decided on
                        // id :: name :: condition :: species
                        // with a line for EACH pet
                        writer.print(p.getId());
                        writer.print(DELIMITER);
                        writer.print(p.getName());
                        writer.print(DELIMITER);
                        writer.print(p.getCondition());
                        writer.print(DELIMITER);
                        writer.print(p.getSpecies());
                        writer.println("");

                        // I can also do it all in one statement like this: 
//                        writer.println(p.getId() + DELIMITER
//                                        + p.getName() + DELIMITER
//                                        + p.getCondition() + DELIMITER
//                                        + p.getSpecies());
                    }

                    writer.flush();
                    writer.close();
                    keepRunning = false;
                    break;
                default: // Invalid
            }
            System.out.println("");
        }

    }

    public static void printMenu() {
        System.out.println("1: Enter a new Pet");
        System.out.println("2: List All Pets In Shelter");
        System.out.println("3: Find Pet Info By Id");
        System.out.println("4: Save & Exit Program");
    }

    public static Pet addNewPet() {
        System.out.println("What is your pet's name?");
        String petName = sc.nextLine();
        System.out.println("What is your pet's condition?");
        String petCondition = sc.nextLine();
        System.out.println("What is your pet's species?");
        String petSpecies = sc.nextLine();
        int petId = getNum("What is your pet's id?");

        // public Pet(int id, String name, String condition, String species){
        // I can make a new pet via the all args constructor if I feed everything in
        // IN THE RIGHT ORDER ('cause that matters or else your pet might be named Rabies!)
//        Pet newPet = new Pet(petId, petName, petCondition, petSpecies);
        // I can also make a new pet via no args constructor w/ setters!
        Pet newPet = new Pet();
        newPet.setId(petId);
        newPet.setName(petName);
        newPet.setSpecies(petSpecies);
        newPet.setCondition(petCondition);

        return newPet;
    }

    public static int getNum(String prompt) {

        boolean invalidInput = true;
        int num = -1;

        do {

            System.out.println(prompt);
            String userInput = sc.nextLine();
            try {
                num = Integer.parseInt(userInput);
                invalidInput = false;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input. Please try again.");
            }

        } while (invalidInput);

        return num;
    }

    public static HashMap<Integer, Pet> loadPetsFromFile() throws IOException {

//        FileReader fReader = new FileReader(FILE_NAME); // the librarian
//        BufferedReader bReader = new BufferedReader(fReader); // the translator
//        Scanner sReader = new Scanner(bReader); // the prompter
        HashMap<Integer, Pet> tempPetShelter = new HashMap<>();

        try {
            Scanner reader = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

            while (reader.hasNextLine()) { // While there is still lines to be read.. do this!
                String petLine = reader.nextLine();
                String[] splitUpPet = petLine.split(DELIMITER);

                if (splitUpPet.length != 4) {
                    continue;
                } else if(!isInt(splitUpPet[0])){
                    continue;
                }

                String petId = splitUpPet[0];
                String petName = splitUpPet[1];
                String petCondition = splitUpPet[2];
                String petSpecies = splitUpPet[3];

                int petIdReally = Integer.parseInt(petId);
                Pet tempPet = new Pet(petIdReally, petName, petCondition, petSpecies);
                tempPetShelter.put(petIdReally, tempPet);

//                Pet newPet = new Pet();
//                newPet.setId(Integer.parseInt(splitUpPet[0]));
//                newPet.setName(splitUpPet[1]);
//                newPet.setCondition(splitUpPet[1]);
//                newPet.setSpecies(splitUpPet[1]);
            }

        } catch (FileNotFoundException fnf) {
            // If we can't find the file. Let's make it!!
            FileWriter fw = new FileWriter(FILE_NAME);
            fw.close();
        }

        return tempPetShelter;
//        return new HashMap<Integer, Pet>();
    }

    public static boolean isInt(String maybeInt) {
        try {
            Integer.parseInt(maybeInt);
        } catch(NumberFormatException e){
            return false;
        }
        
        return true;
    }

}
