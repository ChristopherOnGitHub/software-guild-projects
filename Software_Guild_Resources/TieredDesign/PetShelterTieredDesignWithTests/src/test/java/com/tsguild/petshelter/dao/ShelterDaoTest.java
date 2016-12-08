package com.tsguild.petshelter.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.tsguild.petshelter.dto.Pet;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ahill
 */
public class ShelterDaoTest {

    ShelterDao testDao;
    Pet[] petsForTesting = {
        new Pet(234, "Fido", "Fuzzy", "horse", 1),
        new Pet(123, "Perky", "Fuzzy", "cat", 4),
        new Pet(345, "Slick", "Sick", "dog", 80),
        new Pet(456, "Boo", "Rabies", "dog", 12),
        new Pet(567, "Dork", "Rabies", "chicken", 6),
        new Pet(678, "Lambda", "Fuzzy And Cute", "dog", 12),
        new Pet(789, "Dalia", "Stinky", "dog", 22),
        new Pet(890, "Frank", "Fuzzy And Cute", "rooster", 6),
        new Pet(990, "Fink", "Adorable", "dog", 3),
        new Pet(109, "Wren", "Sick", "horse", 22),
        new Pet(233, "Wox", "Stinky", "gerbil", 8),
        new Pet(444, "Pez", "Stinky", "cat", 22),
        new Pet(334, "Batman", "Sick", "cat", 3),
        new Pet(667, "Dr. Who", "Fuzzy And Cute", "rooster", 2),
        new Pet(324, "Ebenezer", "Rabies", "dog", 8),
        new Pet(223, "Quix", "Sick", "cat", 2)
    };
    
    Pet[] duplicateIdPets = {
        new Pet(234, "Granger", "Fuzzy", "gerbil", 11),
        new Pet(123, "Nemo", "Fuzzy", "cat", 42),
        new Pet(345, "Doof", "Sick", "chicken", 30),
        new Pet(456, "Wock", "Rabies", "pig", 2),
        new Pet(567, "Duck", "Rabies", "dog", 16),
        new Pet(678, "Benji", "Fuzzy And Cute", "dog", 1),
        new Pet(789, "Flip", "Stinky", "dog", 2),
        new Pet(890, "Flop", "Fuzzy And Cute", "dog", 62),
        new Pet(990, "Dang", "Adorable", "dog", 31),
        new Pet(109, "Box", "Sick", "horse", 2),
        new Pet(233, "Silly", "Stinky", "gerbil", 18),
        new Pet(444, "Slappy", "Stinky", "dog", 2),
        new Pet(334, "Senior", "Sick", "rooster", 31),
        new Pet(667, "Dr. What", "Fuzzy And Cute", "gerbil", 22),
        new Pet(324, "Scrooge", "Rabies", "dog", 81),
        new Pet(223, "Abby", "Sick", "chicken", 12)
    };
    
    Pet[] similarPetsDifferentIds = {
        new Pet(231, "Fido", "Fuzzy", "horse", 1),
        new Pet(125, "Perky", "Fuzzy", "cat", 4),
        new Pet(3451, "Slick", "Sick", "dog", 80),
        new Pet(-456, "Boo", "Rabies", "dog", 12),
        new Pet(5677, "Dork", "Rabies", "chicken", 6),
        new Pet(6128, "Lambda", "Fuzzy And Cute", "dog", 12),
        new Pet(7119, "Dalia", "Stinky", "dog", 22),
        new Pet(8701, "Frank", "Fuzzy And Cute", "rooster", 6),
        new Pet(9180, "Fink", "Adorable", "dog", 3),
        new Pet(1991, "Wren", "Sick", "horse", 22),
        new Pet(23, "Wox", "Stinky", "gerbil", 8),
        new Pet(144, "Pez", "Stinky", "cat", 22),
        new Pet(4, "Batman", "Sick", "cat", 3),
        new Pet(-667, "Dr. Who", "Fuzzy And Cute", "rooster", 2),
        new Pet(3344, "Ebenezer", "Rabies", "dog", 8),
        new Pet(2233, "Quix", "Sick", "cat", 2)
    };

    public ShelterDaoTest() {
    }

    @Before
    public void setUp() {
        // Make a new BLANK DAO canvas to paint on!!!
        // Testing! So exciting! So artistic! So magical!
        // Doge approved!!!
        testDao = new ShelterDao();

    }

    /**
     * Test Spec Rundown
     *
     * Add Pet: - add new pet - add/'replace' pet - add similar pet - add several pets
     *
     * Remove Pet: - remove existing pet - remove non-existent pet - remove 'similar' pet - remove existing pet twice
     *
     * Pet Count: - count on empty is 0 - count after add new is +1 - count after 'replace' is same - count after add similar is +1 - count after remove existing is -1 - count after remove non-existent is same - count after remove similar is -1 - count after remove existing twice is -1
     *
     * Get All Pets - never null - empty list on empty - list after add new matches size count + 1, and contains added pet - list after 'replace' matches previous size count and contains replaced pet, not original - list after add similar, matches prev size + 1, and contains both 'similar' - list after remove 1 is decremented in size and does not contain removed - list after remove nonexisting does not change - list after remove twice only removes the one pet
     *
     * Get Pet - get on non-existent returns null - get after add new returns new pet - get after pet replaced returns replaced pet - get after add similar returns similar, not original - get after a pet remove returns null - get after a similar pet removed similar returns original - get after a pet removed twice returns null
     */
    @Test
    public void addOneToEmptyDaoTest() {
        // Step1: Make a Pet
        Pet fido = new Pet(234, "fido", "fuzzy", "dog", 22);

        // Step2: Add pet to dao
        testDao.addPet(fido);

        // Step3: get pet out of dao by id
        Pet hopefullyFido = testDao.getPet(fido.getId());

        // Step4: Make sure the pet added looks like the pet retrieved
        // We can only use assertEquals here because we overrode the .equals method in Pet
        Assert.assertEquals("Dog stored, vs. dog retrieved does not match",
                fido, hopefullyFido);
        //        Assert.assertEquals("Added/GetByID pet id did not match.", fido.getId(), hopefullyFido.getId());
        //        Assert.assertEquals("Added/GetByID pet name did not match 'fido' as expected", "fido", hopefullyFido.getId());
    }

    @Test
    public void testAgainstEmptyDAO() {
        Assert.assertEquals("Expected pet count does not match after adding one pet.", 0, testDao.getAllPets().size());
        Assert.assertNull("Asking for a non existant pet should return null.", testDao.getPet(445));
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' is nonzero with empty DAO.", 0, testDao.getAllPets().size());
    }

    @Test
    public void testAddOnePet() {
        Pet petToAdd = petsForTesting[0];
        testDao.addPet(petToAdd);
        Assert.assertEquals("Expected pet count does not match after adding one pet.", 1, testDao.getAllPets().size());
        Assert.assertEquals("Returned pet does not match expected.", petToAdd, testDao.getPet(petToAdd.getId()));
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after adding one pet.", 1, testDao.getAllPets().size());
        Assert.assertTrue("Returned pet in getAllPets does not match expected.", testDao.getAllPets().contains(petToAdd));

    }

    @Test
    public void testReplaceOnePet() {
        testDao.addPet(petsForTesting[0]);
        testDao.addPet(duplicateIdPets[0]);
        Assert.assertEquals("Expected pet count does not match after replacing one pet.", 1, testDao.getAllPets().size());
        Assert.assertEquals("Replaced pet get does not match expected.", duplicateIdPets[0], testDao.getPet(duplicateIdPets[0].getId()));
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after replacing one pet.", 1, testDao.getAllPets().size());
        Assert.assertTrue("Returned pet in getAllPets does not match expected.", testDao.getAllPets().contains(duplicateIdPets[0]));
    }

    @Test
    public void testAddOneSimilarPet() {
        testDao.addPet(petsForTesting[0]);
        testDao.addPet(duplicateIdPets[0]);
        Assert.assertEquals("Expected pet count does not match after replacing one pet.", 1, testDao.getAllPets().size());
        Assert.assertEquals("Replaced pet get does not match expected.", duplicateIdPets[0], testDao.getPet(duplicateIdPets[0].getId()));
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after replacing one pet.", 1, testDao.getAllPets().size());
    }

    @Test
    public void testAddMultiplePets() {
        for (Pet pet : petsForTesting) {
            testDao.addPet(pet);
        }

        Assert.assertEquals("Expected pet count does not match after adding multiple pets.",
                petsForTesting.length, testDao.getAllPets().size());
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after adding several pets.",
                petsForTesting.length, testDao.getAllPets().size());

        for (int i = 0; i < petsForTesting.length; i++) {
            Assert.assertEquals("Returned pet does not match expected.", petsForTesting[i], testDao.getPet(petsForTesting[i].getId()));
        }

    }

    @Test
    public void testAddDuplcatePets() {
        for (Pet pet : petsForTesting) {
            testDao.addPet(pet);
        }

        for (Pet pet : duplicateIdPets) {
            testDao.addPet(pet);
        }

        Assert.assertEquals("Expected pet count does not match after replacing multiple pets.",
                petsForTesting.length, testDao.getAllPets().size());
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after replacing several pets.",
                petsForTesting.length, testDao.getAllPets().size());

        for (int i = 0; i < duplicateIdPets.length; i++) {
            Assert.assertEquals("Get pet does not match expected return on replace.", duplicateIdPets[i],
                    testDao.getPet(duplicateIdPets[i].getId()));
        }

    }

    @Test
    public void testAddSimilarPets() {
        for (Pet pet : petsForTesting) {
            testDao.addPet(pet);
        }

        for (Pet pet : similarPetsDifferentIds) {
            testDao.addPet(pet);
        }

        Assert.assertEquals("Expected pet count does not match after adding several similar pets.",
                petsForTesting.length + similarPetsDifferentIds.length, testDao.getAllPets().size());
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after adding several similar pets.",
                petsForTesting.length + similarPetsDifferentIds.length, testDao.getAllPets().size());

        for (int i = 0; i < similarPetsDifferentIds.length; i++) {
            Assert.assertEquals("Get pet does not match expected return on addition of similar pet.", similarPetsDifferentIds[i],
                    testDao.getPet(similarPetsDifferentIds[i].getId()));
        }

        for (int i = 0; i < petsForTesting.length; i++) {
            Assert.assertEquals("Get pet does not match expected return on addition of similar pet.", petsForTesting[i],
                    testDao.getPet(petsForTesting[i].getId()));
        }

    }

    @Test
    public void testAddAndRemoveOnePet() {
        testDao.addPet(petsForTesting[0]);
        Pet removed = testDao.removePet(petsForTesting[0].getId());

        Assert.assertNotNull("Pet should be returned on removal.", removed);
        Assert.assertEquals("Pet should be returned on removal.", petsForTesting[0], removed);
        Assert.assertEquals("Expected 0 pets after adding/removing one pet.", 0, testDao.getAllPets().size());
        Assert.assertNull("Pet should return null after being removed.", testDao.getPet(petsForTesting[0].getId()));
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' should be zero when adding/removing a single pet.", 0, testDao.getAllPets().size());
    }

    @Test
    public void testAddAndRemovePetTwice() {
        testDao.addPet(petsForTesting[0]);
        testDao.removePet(petsForTesting[0].getId());
        Pet removed = testDao.removePet(petsForTesting[0].getId());

        Assert.assertNull("Pet should be removed first time, and act as nonexistant pet on second removal (returning null)", removed);
        Assert.assertEquals("Expected 0 pets after adding/removing same pet twice.", 0, testDao.getAllPets().size());
        Assert.assertNull("Pet should return null after being removed.", testDao.getPet(petsForTesting[0].getId()));
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' should be zero when adding/removing a single pet twice.", 0, testDao.getAllPets().size());
    }

    @Test
    public void testAddAndRemoveMultiplePets() {

        for (Pet pet : petsForTesting) {
            testDao.addPet(pet);
        }

        int petsAdded = petsForTesting.length;
        for (int i = 0; i < petsForTesting.length; i += 2) {
            Pet removed = testDao.removePet(petsForTesting[i].getId());
            Assert.assertNotNull("Pet should be returned on removal.", removed);
            Assert.assertEquals("Pet should be returned on removal.", petsForTesting[i], removed);
            petsAdded--;
        }

        Assert.assertEquals("Expected pet count does not match after adding two pets.", petsAdded, testDao.getAllPets().size());
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after adding & removing several pets.",
                petsAdded, testDao.getAllPets().size());

        for (int i = 0; i < petsForTesting.length; i++) {
            if (i % 2 == 1) {
                Assert.assertEquals("Returned pet does not match expected.", petsForTesting[i], testDao.getPet(petsForTesting[i].getId()));
            } else {
                Assert.assertNull("Pet should be removed and return null.", testDao.getPet(petsForTesting[i].getId()));
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

        Assert.assertEquals("Expected " + petsForTesting.length + " pets after re-adding all pets.",
                petsForTesting.length, testDao.getAllPets().size());
        Assert.assertEquals("Pet should return after being re-added.",
                petsForTesting[0], testDao.getPet(petsForTesting[0].getId()));
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
        Assert.assertEquals("Expected pet count of 'all pets' should be zero when adding/removing a all pets.",
                petsForTesting.length, testDao.getAllPets().size());

        for (Pet pet : petsForTesting) {
            testDao.removePet(pet.getId());
            testDao.addPet(pet);
            testDao.removePet(pet.getId());
        }

        Assert.assertEquals("Expected 0 pets after adding/removing all pets.", 0, testDao.getAllPets().size());
        Assert.assertNull("Pet should return null after being removed.", testDao.getPet(petsForTesting[0].getId()));
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
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
    public void testPetCountAfterRemovalOfNonExistent() {

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

    @Test
    public void testPetCountOnReplaceExisting() {

        // Add all pets
        for (int i = 0; i < petsForTesting.length; i++) {
            testDao.addPet(petsForTesting[i]);
        }

        // ReAdd all pets and test the count stays the same.
        for (int i = 0; i < petsForTesting.length; i++) {
            testDao.addPet(petsForTesting[i]);
            Assert.assertEquals("Expected " + petsForTesting.length + " pets after adding & replacing pets.",
                    petsForTesting.length, testDao.getAllPets().size());
        }

    }

}
