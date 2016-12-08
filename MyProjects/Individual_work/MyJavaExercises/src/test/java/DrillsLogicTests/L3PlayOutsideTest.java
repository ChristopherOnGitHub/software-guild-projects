/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L3PlayOutside;
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
public class L3PlayOutsideTest {

    L3PlayOutside testObj = new L3PlayOutside();

    public L3PlayOutsideTest() {
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
    public void beautifulDay() {
        int temp = 70;
        boolean isSummer = true;
        boolean result = testObj.playOutside(temp, isSummer);
        Assert.assertTrue(result);
    }

    @Test
    public void playingInSummer() {
        int temp = 100;
        boolean isSummer = true;
        boolean result = testObj.playOutside(temp, isSummer);
        Assert.assertTrue(result);
    }

    @Test
    public void negative() {
        int temp = -30;
        boolean isSummer = true;
        boolean result = testObj.playOutside(temp, isSummer);
        Assert.assertFalse(result);
    }

    @Test
    public void winterHeatWave() {
        int temp = 100;
        boolean isSummer = false;
        boolean result = testObj.playOutside(temp, isSummer);
        Assert.assertFalse(result);
    }

    @Test
    public void lowerLimit() {
        int temp = 60;
        boolean isSummer = true;
        boolean result = testObj.playOutside(temp, isSummer);
        Assert.assertTrue(result);
    }

    @Test
    public void upperLimit() {
        int temp = 90;
        boolean isSummer = false;
        boolean result = testObj.playOutside(temp, isSummer);
        Assert.assertTrue(result);
    }
}
