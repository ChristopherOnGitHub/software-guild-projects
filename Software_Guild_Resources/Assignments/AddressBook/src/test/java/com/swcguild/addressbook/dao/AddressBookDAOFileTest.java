/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook.dao;

import java.io.FileWriter;
import java.io.IOException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author ahill
 */
public class AddressBookDAOFileTest {

    AddressBookDAO testDAO;

    public AddressBookDAOFileTest() {
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
        }
    }
    
    /**
     * Test Spec Rundown
     *
     * Add Address: 
     * - Make sure that adding
     *
     * Remove Address - remove existing address - remove non-existent address -
     * remove 'similar' address - remove existing address twice
     *
     * Address Count - count on empty is 0 - count after add new is +1 - count
     * after 'replace' is same - count after add similar is +1 - count after
     * remove existing is -1 - count after remove non-existent is same - count
     * after remove similar is -1 - count after remove existing twice is -1
     *
     * */
}
