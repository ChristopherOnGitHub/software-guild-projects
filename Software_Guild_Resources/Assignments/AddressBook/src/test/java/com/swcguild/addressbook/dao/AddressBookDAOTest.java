package com.swcguild.addressbook.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.swcguild.addressbook.model.Address;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ahill
 */
public class AddressBookDAOTest {

    AddressBookDAO testDAO;

    public AddressBookDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        FileWriter cleanFile;

        try {
            String fileName = "test_files/EmptyBook.txt";
            cleanFile = new FileWriter(fileName);
//            testDAO = new AddressBookDAOImpl(fileName);
            cleanFile.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @After
    public void tearDown() {
    }

    protected Address[] testAddresses = {
        new Address("Doctor", "Who", "123 Blue Tardis Dr.", "Gallifrey", "WA", "45283"),
        new Address("Marie", "Curie", "123 South Science St.", "Schnitzelville", "MA", "33043"),
        new Address("Quinoa", "Speltsburg", "333 Pumpkin Lane", "Llamaston", "TX", "12845"),
        new Address("Levar", "Burton", "450 Over Rainbow Dr.", "Reading", "OH", "99874"),
        new Address("Mayor", "Fifi", "123 Biscuit St.", "Woofsburg", "KY", "22667"),
        new Address("Kirk", "Spock", "33 Enterprise Dr.", "Federation", "CA", "22345"),
        new Address("Corki", "Fluffmeister", "123 Spotbutt Rd.", "Dosgville", "GA", "36474"),
        new Address("Apple", "Poppy", "22 East Fruit Salad Circle", "Catopolis", "TX", "12334"),
        new Address("Pinkie", "McPinkerton", "33 Brain Dr.", "West Burton", "VA", "09283"),
        new Address("Dirk", "Bratwurst", "123 Down Street St.", "Versailles", "ME", "47583")
    };

    protected Address[] duplicateNamesAddresses = {
        new Address("Doctor", "Who", "222 Blue Tardis Dr.", "Gallifrey", "WA", "45283"),
        new Address("Marie", "Curie", "222 South Science St.", "Schnitzelville", "MA", "33043"),
        new Address("Quinoa", "Speltsburg", "222 Pumpkin Lane", "Llamaston", "TX", "12845"),
        new Address("Levar", "Burton", "222 Over Rainbow Dr.", "Reading", "OH", "99874"),
        new Address("Mayor", "Fifi", "222 Biscuit St.", "Woofsburg", "KY", "22667"),
        new Address("Kirk", "Spock", "222 Enterprise Dr.", "Federation", "CA", "22345"),
        new Address("Corki", "Fluffmeister", "222 Spotbutt Rd.", "Dosgville", "GA", "36474"),
        new Address("Apple", "Poppy", "222 East Fruit Salad Circle", "Catopolis", "TX", "12334"),
        new Address("Pinkie", "McPinkerton", "222 Brain Dr.", "West Burton", "VA", "09283"),
        new Address("Dirk", "Bratwurst", "222 Down Street St.", "Versailles", "ME", "47583")
    };

    protected Address[] similarAddresses = {
        new Address("Doctor", "Whoo", "123 Blue Tardis Dr.", "Gallifrey", "WA", "45283"),
        new Address("Marie", "CURIE", "123 South Science St.", "Schnitzelville", "MA", "33043"),
        new Address("Quin", "Speltsburg", "333 Pumpkin Lane", "Llamaston", "TX", "12845"),
        new Address("LEVAR", "Burton", "450 Over Rainbow Dr.", "Reading", "OH", "99874"),
        new Address("Mayorr", "Fifi", "123 Biscuit St.", "Woofsburg", "KY", "22667"),
        new Address("kirk", "spock", "33 Enterprise Dr.", "Federation", "CA", "22345"),
        new Address("Korki", "Fluffmeister", "123 Spotbutt Rd.", "Dosgville", "GA", "36474"),
        new Address("App", "Poppy", "22 East Fruit Salad Circle", "Catopolis", "TX", "12334"),
        new Address("Magenta", "McPinkerton", "33 Brain Dr.", "West Burton", "VA", "09283"),
        new Address("Dirk", "Sausage", "123 Down Street St.", "Versailles", "ME", "47583")
    };

    /**
     * Test Spec Rundown
     *
     * Add Address: 
     * - add new address 
     * - add/'replace' address 
     * - add similar address 
     * - add several addresses
     *
     * Remove Address: 
     * - remove existing address 
     * - remove non-existent address
     * - remove 'similar' address 
     * - remove existing address twice
     *
     * Address Count: 
     * - count on empty is 0 
     * - count after add new is +1 - count
     * after 'replace' is same - count after add similar is +1 - count after
     * remove existing is -1 - count after remove non-existent is same - count
     * after remove similar is -1 - count after remove existing twice is -1
     *
     * Get All Addresses - never null - empty list on empty - list after add new
     * matches size count + 1, and contains new - list after 'replace' matches
     * previous size count and contains replace, and not replaced - list after
     * add similar, matches prev size + 1, and contains both 'similar' - list
     * after remove 1 is decremented in size and does not contain removed - list
     * after remove nonexisting does not change - list after remove twice only
     * removes the one
     *
     * Get Address - get on non-existent returns null - get after add new
     * returns new address - get after replace returns replaced address - get
     * after similar returns similar - get after remove returns null - get after
     * remove similar returns original - get after remove twice returns null
     *
     */
    @Test
    public void testAgainstEmptyDAO() {
        Assert.assertEquals("Expected address count does not match after adding one address.", 0, testDAO.addressCount());
        Assert.assertNull("Asking for a non existant address should return null.", testDAO.getAddress("Sir Moof III"));
        Assert.assertNotNull("List of all addresses should not be null.", testDAO.getAllAddresses());
        Assert.assertEquals("Expected address count of 'all addresses' is nonzero with empty DAO.", 0, testDAO.getAllAddresses().size());
    }

    @Test
    public void testAddOneAddress() {
        Address addressToAdd = testAddresses[0];
        testDAO.addAddress(addressToAdd);
        Assert.assertEquals("Expected address count does not match after adding one address.", 1, testDAO.addressCount());
        Assert.assertEquals("Returned address does not match expected.", addressToAdd, testDAO.getAddress(addressToAdd.getFullName()));
        Assert.assertNotNull("List of all addresses should not be null.", testDAO.getAllAddresses());
        Assert.assertEquals("Expected address count of 'all addresses' does not match after adding one address.", 1, testDAO.getAllAddresses().size());
        Assert.assertTrue("Returned address in getAllAddresses does not match expected.", testDAO.getAllAddresses().contains(addressToAdd));

    }

    @Test
    public void testReplaceOneAddress() {
        testDAO.addAddress(testAddresses[0]);
        testDAO.addAddress(duplicateNamesAddresses[0]);
        Assert.assertEquals("Expected address count does not match after replacing one address.", 1, testDAO.addressCount());
        Assert.assertEquals("Replaced address get does not match expected.", duplicateNamesAddresses[0], testDAO.getAddress(duplicateNamesAddresses[0].getFullName()));
        Assert.assertNotNull("List of all addresses should not be null.", testDAO.getAllAddresses());
        Assert.assertEquals("Expected address count of 'all addresses' does not match after replacing one address.", 1, testDAO.getAllAddresses().size());
        Assert.assertTrue("Returned address in getAllAddresses does not match expected.", testDAO.getAllAddresses().contains(duplicateNamesAddresses[0]));
    }

    @Test
    public void testAddOneSimilarAddress() {
        testDAO.addAddress(testAddresses[0]);
        testDAO.addAddress(duplicateNamesAddresses[0]);
        Assert.assertEquals("Expected address count does not match after replacing one address.", 1, testDAO.addressCount());
        Assert.assertEquals("Replaced address get does not match expected.", duplicateNamesAddresses[0], testDAO.getAddress(duplicateNamesAddresses[0].getFullName()));
        Assert.assertNotNull("List of all addresses should not be null.", testDAO.getAllAddresses());
        Assert.assertEquals("Expected address count of 'all addresses' does not match after replacing one address.", 1, testDAO.getAllAddresses().size());
    }

    @Test
    public void testAddMultipleAddresses() {
        for (Address address : testAddresses) {
            testDAO.addAddress(address);
        }

        Assert.assertEquals("Expected address count does not match after adding multiple addresses.",
                testAddresses.length, testDAO.addressCount());
        Assert.assertNotNull("List of all addresses should not be null.", testDAO.getAllAddresses());
        Assert.assertEquals("Expected address count of 'all addresses' does not match after adding several addresses.",
                testAddresses.length, testDAO.getAllAddresses().size());

        for (int i = 0; i < testAddresses.length; i++) {
            Assert.assertEquals("Returned address does not match expected.", testAddresses[i], testDAO.getAddress(testAddresses[i].getFullName()));
        }

    }

    @Test
    public void testAddDuplcateAddresses() {
        for (Address address : testAddresses) {
            testDAO.addAddress(address);
        }

        for (Address address : duplicateNamesAddresses) {
            testDAO.addAddress(address);
        }

        Assert.assertEquals("Expected address count does not match after replacing multiple addresses.",
                testAddresses.length, testDAO.addressCount());
        Assert.assertNotNull("List of all addresses should not be null.", testDAO.getAllAddresses());
        Assert.assertEquals("Expected address count of 'all addresses' does not match after replacing several addresses.",
                testAddresses.length, testDAO.getAllAddresses().size());

        for (int i = 0; i < duplicateNamesAddresses.length; i++) {
            Assert.assertEquals("Get address does not match expected return on replace.", duplicateNamesAddresses[i],
                    testDAO.getAddress(duplicateNamesAddresses[i].getFullName()));
        }

    }

    @Test
    public void testAddSimilarAddresses() {
        for (Address address : testAddresses) {
            testDAO.addAddress(address);
        }

        for (Address address : similarAddresses) {
            testDAO.addAddress(address);
        }

        Assert.assertEquals("Expected address count does not match after adding several similar addresses.",
                testAddresses.length + similarAddresses.length, testDAO.addressCount());
        Assert.assertNotNull("List of all addresses should not be null.", testDAO.getAllAddresses());
        Assert.assertEquals("Expected address count of 'all addresses' does not match after adding several similar addresses.",
                testAddresses.length + similarAddresses.length, testDAO.getAllAddresses().size());

        for (int i = 0; i < similarAddresses.length; i++) {
            Assert.assertEquals("Get address does not match expected return on addition of similar address.", similarAddresses[i],
                    testDAO.getAddress(similarAddresses[i].getFullName()));
        }

        for (int i = 0; i < testAddresses.length; i++) {
            Assert.assertEquals("Get address does not match expected return on addition of similar address.", testAddresses[i],
                    testDAO.getAddress(testAddresses[i].getFullName()));
        }

    }

    @Test
    public void testAddAndRemoveOneAddress() {
        testDAO.addAddress(testAddresses[0]);
        Address removed = testDAO.removeAddress(testAddresses[0].getFullName());

        Assert.assertNotNull("Address should be returned on removal.", removed);
        Assert.assertEquals("Address should be returned on removal.", testAddresses[0], removed);
        Assert.assertEquals("Expected 0 addresses after adding/removing one address.", 0, testDAO.addressCount());
        Assert.assertNull("Address should return null after being removed.", testDAO.getAddress(testAddresses[0].getFullName()));
        Assert.assertNotNull("List of all addresses should not be null.", testDAO.getAllAddresses());
        Assert.assertEquals("Expected address count of 'all addresses' should be zero when adding/removing a single address.", 0, testDAO.getAllAddresses().size());
    }

    @Test
    public void testAddAndRemoveAddressTwice() {
        testDAO.addAddress(testAddresses[0]);
        testDAO.removeAddress(testAddresses[0].getFullName());
        Address removed = testDAO.removeAddress(testAddresses[0].getFullName());

        Assert.assertNull("Address should be removed first time, and act as nonexistant address on second removal (returning null)", removed);
        Assert.assertEquals("Expected 0 addresses after adding/removing same address twice.", 0, testDAO.addressCount());
        Assert.assertNull("Address should return null after being removed.", testDAO.getAddress(testAddresses[0].getFullName()));
        Assert.assertNotNull("List of all addresses should not be null.", testDAO.getAllAddresses());
        Assert.assertEquals("Expected address count of 'all addresses' should be zero when adding/removing a single address twice.", 0, testDAO.getAllAddresses().size());
    }

    @Test
    public void testAddAndRemoveMultipleAddresses() {

        for (Address address : testAddresses) {
            testDAO.addAddress(address);
        }

        int addressesAdded = testAddresses.length;
        for (int i = 0; i < testAddresses.length; i += 2) {
            Address removed = testDAO.removeAddress(testAddresses[i].getFullName());
            Assert.assertNotNull("Address should be returned on removal.", removed);
            Assert.assertEquals("Address should be returned on removal.", testAddresses[i], removed);
            addressesAdded--;
        }

        Assert.assertEquals("Expected address count does not match after adding two addresses.", addressesAdded, testDAO.addressCount());
        Assert.assertNotNull("List of all addresses should not be null.", testDAO.getAllAddresses());
        Assert.assertEquals("Expected address count of 'all addresses' does not match after adding & removing several addresses.",
                addressesAdded, testDAO.getAllAddresses().size());

        for (int i = 0; i < testAddresses.length; i++) {
            if (i % 2 == 0) {
                Assert.assertEquals("Returned address does not match expected.", testAddresses[i], testDAO.getAddress(testAddresses[i].getFullName()));
            } else {
                Assert.assertNull("Address should be removed and return null.", testDAO.getAddress(testAddresses[i].getFullName()));
            }
        }

    }

    @Test
    public void testAddAndRemoveAddressesMultipleTimes() {

        for (Address address : testAddresses) {
            testDAO.addAddress(address);
        }

        for (Address address : testAddresses) {
            testDAO.removeAddress(address.getFullName());
        }

        for (Address address : testAddresses) {
            testDAO.addAddress(address);
        }

        Assert.assertEquals("Expected " + testAddresses.length + " addresses after re-adding all addresses.",
                testAddresses.length, testDAO.addressCount());
        Assert.assertEquals("Address should return after being re-added.",
                testAddresses[0], testDAO.getAddress(testAddresses[0].getFullName()));
        Assert.assertNotNull("List of all addresses should not be null.", testDAO.getAllAddresses());
        Assert.assertEquals("Expected address count of 'all addresses' should be zero when adding/removing a all addresses.",
                testAddresses.length, testDAO.getAllAddresses().size());

        for (Address address : testAddresses) {
            testDAO.removeAddress(address.getFullName());
            testDAO.addAddress(address);
            testDAO.removeAddress(address.getFullName());
        }

        Assert.assertEquals("Expected 0 addresses after adding/removing all addresses.", 0, testDAO.addressCount());
        Assert.assertNull("Address should return null after being removed.", testDAO.getAddress(testAddresses[0].getFullName()));
        Assert.assertNotNull("List of all addresses should not be null.", testDAO.getAllAddresses());
        Assert.assertEquals("Expected address count of 'all addresses' should be zero when adding/removing a all addresses.", 0, testDAO.getAllAddresses().size());

    }

    @Test
    public void testAddressCountOnAddition() {

        // Add all addresses and check that count increments appropriately
        for (int i = 0; i < testAddresses.length; i++) {
            testDAO.addAddress(testAddresses[i]);
            Assert.assertEquals("Expected " + (i + 1) + " addresses after adding addressses.",
                    i + 1, testDAO.addressCount());
        }

    }

    @Test
    public void testAddressCountAfterRemoval() {

        // Add all addresses
        for (int i = 0; i < testAddresses.length; i++) {
            testDAO.addAddress(testAddresses[i]);
        }

        // Remove addresses one by one and test that count decrements properly
        for (int i = 0; i < testAddresses.length; i++) {
            testDAO.removeAddress(testAddresses[i].getFullName());
            Assert.assertEquals("Expected " + (testAddresses.length - i - 1) + " addresses after removing addressses.",
                    testAddresses.length - i - 1, testDAO.addressCount());
        }
    }

    @Test
    public void testAddressCountAfterRemovalOfNonExistent() {

        // Add all addresses
        for (int i = 0; i < testAddresses.length; i++) {
            testDAO.addAddress(testAddresses[i]);
        }

        testDAO.removeAddress("Sir Moof III");
        Assert.assertEquals("Expected " + testAddresses.length + " addresses after removing addressses.",
                testAddresses.length, testDAO.addressCount());

    }

    @Test
    public void testAddressCountAfterTwiceRemoved() {

        // Add all addresses
        for (int i = 0; i < testAddresses.length; i++) {
            testDAO.addAddress(testAddresses[i]);
        }

        // Remove addresses one by one and test that count decrements properly
        for (int i = 0; i < testAddresses.length; i++) {
            testDAO.removeAddress(testAddresses[i].getFullName());
        }

        Assert.assertEquals("Expected " + 0 + " addresses after removing addressses.",
                0, testDAO.addressCount());

        // Remove addresses one by one and test that count decrements properly
        for (int i = 0; i < testAddresses.length; i++) {
            testDAO.removeAddress(testAddresses[i].getFullName());
        }

        Assert.assertEquals("Expected " + 0 + " addresses after attempting to re-remove addressses.",
                0, testDAO.addressCount());

    }

    @Test
    public void testAddressCountOnReplaceExisting() {

        // Add all addresses
        for (int i = 0; i < testAddresses.length; i++) {
            testDAO.addAddress(testAddresses[i]);
        }

        // ReAdd all addresses and test the count stays the same.
        for (int i = 0; i < testAddresses.length; i++) {
            testDAO.addAddress(testAddresses[i]);
            Assert.assertEquals("Expected " + testAddresses.length + " addresses after adding & replacing addresses.",
                    testAddresses.length, testDAO.addressCount());
        }

    }

}
