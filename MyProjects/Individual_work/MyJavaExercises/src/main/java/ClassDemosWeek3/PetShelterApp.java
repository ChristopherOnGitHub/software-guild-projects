/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDemosWeek3;

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
 * @author apprentice
 */
public class PetShelterApp {

    static Scanner sc = new Scanner(System.in);
    static String FILE_NAME = "ShelterInto/AllDaShelterPets.txt";
    final static String DELIMITER = "::";

    public static void main(String[] args) throws IOException {

        HashMap<Integer, Pet> petShelter = loadPetsFromFile();

        boolean keepRunning = true;

        while (keepRunning) {

            printMenu();
            int userChoice = getNum("Please make a selection");

            switch (userChoice) {
                case 1:
                    Pet newPet = addNewPet();
                    petShelter.put(newPet.getId(), newPet);
                    break;
                case 2:
                    System.out.println("*_*Pets currently in shelter*_*");
                    for (Pet p : petShelter.values()) {
                        System.out.println(p.getId());
                        System.out.println(" ");
                        System.out.println(p.getName());
                    }
                    break;
                case 3:
                case 4:
                    PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));
                    for (Pet p : petShelter.values()) {
                        writer.print(p.getId());
                        writer.print(DELIMITER);
                        writer.print(p.getName());
                        writer.print(DELIMITER);
                        writer.print(p.getCondition());
                        writer.print(DELIMITER);
                        writer.println(p.getSpecies());
                    }
                    writer.flush();
                    writer.close();
                    break;
                default:

            }

        }

    }

    public static void printMenu() {
        System.out.println("1: Enter a new pet");
        System.out.println("2: List all pets in shelter");
        System.out.println("3: Find pet into by ID");
        System.out.println("4: Save and exit");
    }

    public static Pet addNewPet() {
        System.out.println("What is your pet's name?");
        String petName = sc.nextLine();
        System.out.println("What is your pet's condition?");
        String petCondition = sc.nextLine();
        System.out.println("What is your pet's species?");
        String petSpecies = sc.nextLine();
        int petId = getNum("What is your pet's id?");

        Pet newPet = new Pet(petId, petName, petCondition, petSpecies);
        return newPet;

    }

    public static int getNum(String prompt) {
        String userInput;
        boolean invalidInput = true;
        int num = -1;

        do {
            System.out.println(prompt);
            userInput = sc.nextLine();
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

        HashMap<Integer, Pet> tempPetShelter = new HashMap<>();

        try {
            Scanner reader = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

            while (reader.hasNextLine()) {
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
            }

        } catch (FileNotFoundException e) {
            FileWriter fw = new FileWriter(FILE_NAME);
            fw.close();
        }
        return tempPetShelter;

    }

    public static boolean isInt(String maybeInt) {
        try {
            Integer.parseInt(maybeInt);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
