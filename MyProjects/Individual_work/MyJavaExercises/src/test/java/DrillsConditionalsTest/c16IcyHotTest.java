/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c16IcyHot;
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
public class c16IcyHotTest {

    c16IcyHot testObj = new c16IcyHot();

    public c16IcyHotTest() {
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
    public void simpleTrue() {
        int x1 = 111;
        int x2 = -4;
        boolean result = testObj.icyHot(x1, x2);
        Assert.assertTrue(result);
    }

    @Test
    public void extremes() {
        int x1 = 11111111;
        int x2 = -41111111;
        boolean result = testObj.icyHot(x1, x2);
        Assert.assertTrue(result);
    }

    @Test
    public void simpleFalse() {
        int x1 = 1;
        int x2 = 1;
        boolean result = testObj.icyHot(x1, x2);
        Assert.assertFalse(result);
    }

    @Test
    public void bothNeg() {
        int x1 = -111;
        int x2 = -4;
        boolean result = testObj.icyHot(x1, x2);
        Assert.assertFalse(result);
    }

    @Test
    public void bothPos() {
        int x1 = 111;
        int x2 = 4;
        boolean result = testObj.icyHot(x1, x2);
        Assert.assertFalse(result);
    }

    @Test
    public void zeros() {
        int x1 = 0;
        int x2 = 0;
        boolean result = testObj.icyHot(x1, x2);
        Assert.assertFalse(result);
    }
}
