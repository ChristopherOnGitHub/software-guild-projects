/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapp.dao;

import com.tsguild.petshelterwebapp.dto.Pet;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author ahill
 */
public class PetShelterDaoJdbcImplTest {

    PetShelterDao testDao;
    

    public PetShelterDaoJdbcImplTest() { }

    @Before
    public void setUp() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        testDao = factory.getBean("jdbcDao", PetShelterDao.class);
        JdbcTemplate cleaner = factory.getBean("jdbcTemplateBean", JdbcTemplate.class);
        cleaner.execute("DELETE FROM Pets WHERE 1=1");
        cleaner.execute("DELETE FROM Breeds WHERE 1=1");
    }

    Pet[] petsForTesting = {
        new Pet(-1, "Fido", "dog", "Stinky", true),
        new Pet(-1, "Perky", "horse", "Rabies", true),
        new Pet(-1, "Slick", "cat", "Rabies", true),
        new Pet(-1, "Boo", "rooster", "Sick", false),
        new Pet(-1, "Dork", "chicken", "Adorable", true),
        new Pet(-1, "Lambda", "rooster", "Stinky", true),
        new Pet(-1, "Dalia", "dog", "Stinky", false),
        new Pet(-1, "Frank", "cat", "Fuzzy", true),
        new Pet(-1, "Fink", "dog", "Adorable", false),
        new Pet(-1, "Wren", "Sick", "Fuzzy And Cute", true),
        new Pet(-1, "Wox", "horse", "Stinky", true),
        new Pet(-1, "Pez", "dog", "Cute", false),
        new Pet(-1, "Batman", "horse", "Fluffy", false),
        new Pet(-1, "Dr. Who", "hedgehog", "Fuzzy", true),
        new Pet(-1, "Ebenezer", "dog", "Stinky", true),
        new Pet(-1, "Quix", "dog", "Fuzzy", true)
    };

    Pet[] duplicatePets = {
        new Pet(-1, "Fido", "dog", "Stinky", true),
        new Pet(-1, "Perky", "horse", "Rabies", true),
        new Pet(-1, "Slick", "cat", "Rabies", true),
        new Pet(-1, "Boo", "rooster", "Sick", false),
        new Pet(-1, "Dork", "chicken", "Adorable", true),
        new Pet(-1, "Lambda", "rooster", "Stinky", true),
        new Pet(-1, "Dalia", "dog", "Stinky", false),
        new Pet(-1, "Frank", "cat", "Fuzzy", true),
        new Pet(-1, "Fink", "dog", "Adorable", false),
        new Pet(-1, "Wren", "Sick", "Fuzzy And Cute", true),
        new Pet(-1, "Wox", "horse", "Stinky", true),
        new Pet(-1, "Pez", "dog", "Cute", false),
        new Pet(-1, "Batman", "horse", "Fluffy", false),
        new Pet(-1, "Dr. Who", "hedgehog", "Fuzzy", true),
        new Pet(-1, "Ebenezer", "dog", "Stinky", true),
        new Pet(-1, "Quix", "dog", "Fuzzy", true)
    };

    Pet[] similarPets = {
        new Pet(-1, "Fiddo", "dog", "Stinky", true),
        new Pet(-1, "Perky", "cat", "Rabies", true),
        new Pet(-1, "Slick", "cat", "Sick", true),
        new Pet(-1, "Boo", "chicken", "Sick", false),
        new Pet(-1, "Dorrk", "chicken", "Adorable", true),
        new Pet(-1, "Lambda", "hedgehog", "Stinky", true),
        new Pet(-1, "Dalia", "dog", "Pokey", false),
        new Pet(-1, "Frank", "cat", "Adorable", true),
        new Pet(-1, "Fink", "dog", "Stinky", false),
        new Pet(-1, "Wren", "Sick", "Fuzzy And Angry", true),
        new Pet(-1, "Wox", "dog", "Stinky", true),
        new Pet(-1, "Pez", "horse", "Cute", false),
        new Pet(-1, "Batman", "horse", "Fluffy", false),
        new Pet(-1, "Dr. What", "hedgehog", "Fuzzy", true),
        new Pet(-1, "Scrooge", "dog", "Stinky", true),
        new Pet(-1, "Quack", "dog", "Fuzzy", true)
    };

    /**
     * Test Spec Rundown
     *
     * Add Pet: add new pet add/'replace' pet add similar pet add several pets
     *
     * Remove Pet: remove existing pet remove non-existent pet remove 'similar' pet remove existing pet twice
     *
     * Get All Pets
     *
     * never null empty list on empty list after add new matches size count + 1, and contains added pet list after 'replace' matches previous size count and contains replaced pet, not original list after add similar, matches prev size + 1, and contains both 'similar' list after remove 1 is decremented in size and does not contain removed list after remove nonexisting does not change list after remove twice only removes the one pet
     *
     * Get Pet get on non-existent returns null get after add new returns new pet get after pet replaced returns replaced pet get after add similar returns similar, not original get after a pet remove returns null get after a similar pet removed similar returns original get after a pet removed twice returns null
     *
     */
    @Test
    public void addOneToEmptyDaoTest() {
        // Step1: Make a Pet
        Pet fido = new Pet(234, "fido", "dog", "fuzzy", true);

        // Step2: Add pet to dao
        testDao.addPet(fido);

        // Step3: get pet out of dao by id
        Pet hopefullyFido = testDao.getPetById(fido.getId());

        // Step4: Make sure the pet added looks like the pet retrieved
        // We can only use assertEquals here because we overrode the .equals method in Pet
        Assert.assertEquals("Dog stored, vs. dog retrieved does not match",
                fido, hopefullyFido);
        //        Assert.assertEquals("Added/GetByID pet id did not match.", fido.getId(), hopefullyFido.getId());
        //        Assert.assertEquals("Added/GetByID pet name did not match 'fido' as expected", "fido", hopefullyFido.getId());
    }

    @Test
    public void testAgainstEmptyDAO() {

        Assert.assertNull("Asking for a non existant pet should return null.", testDao.getPetById(445));
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' is nonzero with empty DAO.", 0, testDao.getAllPets().size());
    }

    @Test
    public void testAddOnePet() {
        Pet petToAdd = petsForTesting[0];
        testDao.addPet(petToAdd);

        Assert.assertEquals("Returned pet does not match expected.", petToAdd, testDao.getPetById(petToAdd.getId()));
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after adding one pet.", 1, testDao.getAllPets().size());
        Assert.assertTrue("Returned pet in getAllPets does not match expected.", testDao.getAllPets().contains(petToAdd));

    }

    @Test
    public void testUpdatePet() {
        testDao.addPet(petsForTesting[0]);
        similarPets[0].setId(petsForTesting[0].getId());
        testDao.updatePet(similarPets[0]);

        Assert.assertEquals("Updated pet get does not match expected.", similarPets[0], testDao.getPetById(similarPets[0].getId()));
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after replacing one pet.", 1, testDao.getAllPets().size());
        Assert.assertTrue("Returned pet in getAllPets does not match expected.", testDao.getAllPets().contains(similarPets[0]));
    }

    @Test
    public void testAddMultiplePets() {
        for (Pet pet : petsForTesting) {
            testDao.addPet(pet);
        }

        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after adding several pets.",
                petsForTesting.length, testDao.getAllPets().size());

        for (int i = 0; i < petsForTesting.length; i++) {
            Assert.assertEquals("Returned pet does not match expected.", petsForTesting[i], testDao.getPetById(petsForTesting[i].getId()));
            Assert.assertTrue("Returned pet in getAllPets does not match expected.", testDao.getAllPets().contains(petsForTesting[i]));
        }

    }

    @Test
    public void testUpdateMultiplePets() {
        for (Pet pet : petsForTesting) {
            testDao.addPet(pet);
        }

        for (int i = 0; i < petsForTesting.length; i++) {
            similarPets[i].setId(petsForTesting[i].getId());
            testDao.updatePet(similarPets[i]);
        }

        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after replacing several pets.",
                petsForTesting.length, testDao.getAllPets().size());

        for (int i = 0; i < similarPets.length; i++) {
            Assert.assertEquals("Get pet does not match expected return on update.", similarPets[i], testDao.getPetById(similarPets[i].getId()));
            Assert.assertTrue("Returned pet in getAllPets does not match expected.", testDao.getAllPets().contains(similarPets[i]));
        }

    }

    @Test
    public void testAddSimilarPets() {
        for (Pet pet : petsForTesting) {
            testDao.addPet(pet);
        }

        for (Pet pet : similarPets) {
            testDao.addPet(pet);
        }

        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count does not match after adding several similar pets.",
                petsForTesting.length + similarPets.length, testDao.getAllPets().size());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after adding several similar pets.",
                petsForTesting.length + similarPets.length, testDao.getAllPets().size());

        for (int i = 0; i < similarPets.length; i++) {
            Assert.assertEquals("Get pet does not match expected return on addition of similar pet.", similarPets[i],
                    testDao.getPetById(similarPets[i].getId()));
            Assert.assertTrue("Returned pet in getAllPets does not match expected.", testDao.getAllPets().contains(similarPets[i]));
        }

        for (int i = 0; i < petsForTesting.length; i++) {
            Assert.assertEquals("Get pet does not match expected return on addition of similar pet.", petsForTesting[i],
                    testDao.getPetById(petsForTesting[i].getId()));
            Assert.assertTrue("Returned pet in getAllPets does not match expected.", testDao.getAllPets().contains(petsForTesting[i]));
        }

    }

    @Test
    public void testAddAndRemoveOnePet() {
        testDao.addPet(petsForTesting[0]);
        testDao.removePet(petsForTesting[0].getId());

        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertNull("Get pet should return null after being removed.", testDao.getPetById(petsForTesting[0].getId()));
        Assert.assertEquals("Expected pet count of 'all pets' should be zero when adding/removing a single pet.", 0, testDao.getAllPets().size());
    }

    @Test
    public void testAddAndRemovePetTwice() {
        testDao.addPet(petsForTesting[0]);
        testDao.removePet(petsForTesting[0].getId());
        testDao.removePet(petsForTesting[0].getId());

        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertNull("Pet should return null after being removed.", testDao.getPetById(petsForTesting[0].getId()));
        Assert.assertEquals("Expected pet count of 'all pets' should be zero when adding/removing a single pet twice.", 0, testDao.getAllPets().size());
    }

    @Test
    public void testAddAndRemoveMultiplePets() {

        for (Pet pet : petsForTesting) {
            testDao.addPet(pet);
        }

        int petsAdded = petsForTesting.length;
        for (int i = 0; i < petsForTesting.length; i += 2) {
            testDao.removePet(petsForTesting[i].getId());
            petsAdded--;
        }

        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after adding & removing several pets.",
                petsAdded, testDao.getAllPets().size());

        for (int i = 0; i < petsForTesting.length; i++) {
            if (i % 2 == 1) {
                Assert.assertEquals("Returned pet does not match expected.", petsForTesting[i], testDao.getPetById(petsForTesting[i].getId()));
            } else {
                Assert.assertNull("Pet should be removed and return null.", testDao.getPetById(petsForTesting[i].getId()));
            }
        }

    }

    @Test
    public void testAddAndRemovePetsMultipleTimes() {

        for (Pet pet : petsForTesting) {
            testDao.addPet(pet);
        }

        for (Pet pet : petsForTesting) {
            testDao.removePet(pet.getId());
        }

        for (Pet pet : petsForTesting) {
            testDao.addPet(pet);
        }

        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' should be zero when adding/removing a all pets.",
                petsForTesting.length, testDao.getAllPets().size());



        for (int i = 0; i < petsForTesting.length; i++) {
            Pet pet = petsForTesting[i];
            Assert.assertEquals("Pet should return after being re-added.", pet, testDao.getPetById(pet.getId()));
            testDao.removePet(pet.getId());
            Assert.assertNull("Pet should return null after being removed.", testDao.getPetById(pet.getId()));
        }

        Assert.assertEquals("Expected pet count of 'all pets' should be zero when adding/removing a all pets.", 0, testDao.getAllPets().size());

    }

    @Test
    public void testPetCountOnAddition() {

        // Add all pets and check that count increments appropriately
        for (int i = 0; i < petsForTesting.length; i++) {
            testDao.addPet(petsForTesting[i]);
            Assert.assertEquals("Expected " + (i + 1) + " pets after adding petses.",
                    i + 1, testDao.getAllPets().size());
        }

    }
    
    @Test
    public void testPetCountOnUpdate() {

        // Add all pets and check that count increments appropriately
        for (int i = 0; i < petsForTesting.length; i++) {
            testDao.addPet(petsForTesting[i]);
            similarPets[i].setId(petsForTesting[i].getId());
            testDao.updatePet(similarPets[i]);
            Assert.assertEquals("Expected " + (i + 1) + " pets after updating petses.",
                    i + 1, testDao.getAllPets().size());
        }

    }

    @Test
    public void testPetCountAfterRemoval() {

        // Add all pets
        for (int i = 0; i < petsForTesting.length; i++) {
            testDao.addPet(petsForTesting[i]);
        }

        // Remove pets one by one and test that count decrements properly
        for (int i = 0; i < petsForTesting.length; i++) {
            testDao.removePet(petsForTesting[i].getId());
            Assert.assertEquals("Expected " + (petsForTesting.length - i - 1) + " pets after removing petses.",
                    petsForTesting.length - i - 1, testDao.getAllPets().size());
        }
    }

    @Test
    public void testPetsAfterRemovalOfNonExistent() {

        // Add all pets
        for (int i = 0; i < petsForTesting.length; i++) {
            testDao.addPet(petsForTesting[i]);
        }

        testDao.removePet(100);
        Assert.assertEquals("Expected " + petsForTesting.length + " pets after removing petses.",
                petsForTesting.length, testDao.getAllPets().size());

    }

    @Test
    public void testPetCountAfterTwiceRemoved() {

        // Add all pets
        for (int i = 0; i < petsForTesting.length; i++) {
            testDao.addPet(petsForTesting[i]);
        }

        // Remove pets one by one and test that count decrements properly
        for (int i = 0; i < petsForTesting.length; i++) {
            testDao.removePet(petsForTesting[i].getId());
        }

        Assert.assertEquals("Expected " + 0 + " pets after removing petses.",
                0, testDao.getAllPets().size());

        // Remove pets one by one and test that count decrements properly
        for (int i = 0; i < petsForTesting.length; i++) {
            testDao.removePet(petsForTesting[i].getId());
        }

        Assert.assertEquals("Expected " + 0 + " pets after attempting to re-remove petses.",
                0, testDao.getAllPets().size());

    }

}
