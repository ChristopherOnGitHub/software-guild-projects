/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.drills;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ahill
 */
public class ArraysTest {

    Arrays testObj = new Arrays();

    public ArraysTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void HasEvenTestBase() {
        Arrays testObj = new Arrays();
        int[] testArgs = {2, 5};
        boolean result = testObj.HasEven(testArgs);
        Assert.assertTrue(result);
    }

    @Test
    public void HasEvenTestBase2() {
        Arrays testObj = new Arrays();
        int[] testArgs = {4, 3};
        Assert.assertTrue("Passed in an array of 4 & 3, did not return true",
                testObj.HasEven(testArgs));
    }

    @Test
    public void HasEvenTestBase3() {
        int[] testArgs = {7, 5};
        Assert.assertFalse(testObj.HasEven(testArgs));
    }

    @Test
    public void HasEvenTestLongArrayWithEvenAtEnd() {
        int[] testArgs = {7, 5, 1, 3, 7, 1, 9, 3,
                            5, 7, 1, -1, 1, -11, 111,
                            113, 171, 400};
        Assert.assertTrue(testObj.HasEven(testArgs));
    }
    
    @Test
    public void HasEvenTestWithEmptyArray() {
        int[] testArgs = {};
        Assert.assertFalse(testObj.HasEven(testArgs));
    }
    
    @Test
    public void HasEvenTestWithNullArray() {
        int[] testArgs = null;
        Assert.assertFalse(testObj.HasEven(testArgs));
    }
}
