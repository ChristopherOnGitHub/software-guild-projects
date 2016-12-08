/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L7LoveSix;
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
public class L7LoveSixTest {

    L7LoveSix testObj = new L7LoveSix();

    public L7LoveSixTest() {
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
        int a = 6;
        int b = 3;
        boolean result = testObj.loveSix(a, b);
        Assert.assertTrue(result);
    }

    @Test
    public void bothSix() {
        int a = 6;
        int b = 6;
        boolean result = testObj.loveSix(a, b);
        Assert.assertTrue(result);
    }

    @Test
    public void negativeSix() {
        int a = -6;
        int b = 3;
        boolean result = testObj.loveSix(a, b);
        Assert.assertFalse(result);
    }

    @Test
    public void differenceSix() {
        int a = 8;
        int b = 2;
        boolean result = testObj.loveSix(a, b);
        Assert.assertTrue(result);
    }

    @Test
    public void sumSix() {
        int a = 4;
        int b = 2;
        boolean result = testObj.loveSix(a, b);
        Assert.assertTrue(result);
    }

    @Test
    public void sumWithNegative() {
        int a = 9;
        int b = -3;
        boolean result = testObj.loveSix(a, b);
        Assert.assertTrue(result);
    }
}
