/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drillz.arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ahill
 */
public class FirstLastSixTest {
    
    public FirstLastSixTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of firstLast6 method, of class FirstLastSix.
     */
    @Test
    public void testFirstLast6() {
        System.out.println("firstLast6");
        int[] numbers = null;
        FirstLastSix instance = new FirstLastSix();
        boolean expResult = false;
        boolean result = instance.firstLast6(numbers);
        assertEquals(false, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
