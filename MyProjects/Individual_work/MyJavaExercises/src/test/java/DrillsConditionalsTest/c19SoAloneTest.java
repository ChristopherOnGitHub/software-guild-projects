/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c19SoAlone;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class c19SoAloneTest {

    c19SoAlone testObj = new c19SoAlone();

    public c19SoAloneTest() {
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
    @Test
    public void simpleTest() {
        int a = 15;
        int b = 78;
        boolean result = testObj.soAlone(a, b);
        Assert.assertTrue(result);
    }

    @Test
    public void bothInRange() {
        int a = 15;
        int b = 18;
        boolean result = testObj.soAlone(a, b);
        Assert.assertFalse(result);
    }

    @Test
    public void negs() {
        int a = -15;
        int b = -78;
        boolean result = testObj.soAlone(a, b);
        Assert.assertFalse(result);
    }

    @Test
    public void zeros() {
        int a = 0;
        int b = 0;
        boolean result = testObj.soAlone(a, b);
        Assert.assertFalse(result);
    }

    @Test
    public void boundaryTests() {
        int a = 19;
        int b = 20;
        boolean result = testObj.soAlone(a, b);
        Assert.assertTrue(result);
    }

    @Test
    public void lowerBoundaryTest() {
        int a = 13;
        int b = 12;
        boolean result = testObj.soAlone(a, b);
        Assert.assertTrue(result);
    }
}
