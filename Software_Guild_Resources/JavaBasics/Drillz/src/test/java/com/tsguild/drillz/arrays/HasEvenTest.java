/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drillz.arrays;

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
public class HasEvenTest {

    private HasEven testObj;

    public HasEvenTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        testObj = new HasEven();

    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //    HasEven({4, 3}) -> true
    @Test
    public void definitionTestA() {

        int[] testArray = {4, 3};
        boolean result = testObj.hasEven(testArray);

        // First parameter - is a message to yourself IF things explode
        // Second parameter - is the "expected" value that was calculated
        // Third parameter - is the calculated value. The one you're checking.
        Assert.assertEquals("Input {4,3} not true as expected",
                true, result);

        // Or if you use "assertTrue" it will 
        Assert.assertTrue("Input {4,3} not true as expected",
                result);

    }

//    HasEven({2, 5}) -> true
    @Test
    public void definitionTestB() {
        int[] testArray = {2, 5};
        boolean result = testObj.hasEven(testArray);
        Assert.assertTrue("Input {2,5} not true as expected", result);
    }
//    HasEven({7, 5}) -> false

    @Test
    public void definitionTestC() {
        int[] testArray = {7, 5};
        boolean result = testObj.hasEven(testArray);
        Assert.assertFalse("Input {7,5} not false as expected", result);
    }
    
    @Test
    public void testHasEvenWithBigArray(){
        int[] testArray = {7, 5, 81, 1001, 11, 669, 33, -1, 9485, 221, 1, -1, -9, 222222};
        boolean result = testObj.hasEven(testArray);
        Assert.assertTrue("Input of large array w/ even number at end not true as expected", result);
    }
    
    @Test
    public void testHasEvenWithSmallArray(){
        int[] testArray = {-7};
        boolean result = testObj.hasEven(testArray);
        Assert.assertTrue("Input {-7} not false as expected", result);
    }
}
