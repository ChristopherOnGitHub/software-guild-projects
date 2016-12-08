/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L8InRange;
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
public class L8InRangeTest {

    L8InRange testObj = new L8InRange();

    public L8InRangeTest() {
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
    public void simpleInRange() {
        int n = 5;
        boolean outsideMode = false;
        boolean result = testObj.inRange(n, outsideMode);
        Assert.assertTrue(result);
    }

    @Test
    public void simpleOutside() {
        int n = 35;
        boolean outsideMode = true;
        boolean result = testObj.inRange(n, outsideMode);
        Assert.assertTrue(result);
    }

    @Test
    public void simpleRangeFalse() {
        int n = 89;
        boolean outsideMode = false;
        boolean result = testObj.inRange(n, outsideMode);
        Assert.assertFalse(result);
    }

    @Test
    public void simpleOutsideFalse() {
        int n = 5;
        boolean outsideMode = true;
        boolean result = testObj.inRange(n, outsideMode);
        Assert.assertFalse(result);
    }

    @Test
    public void negativeOutside() {
        int n = -5;
        boolean outsideMode = true;
        boolean result = testObj.inRange(n, outsideMode);
        Assert.assertTrue(result);
    }

    @Test
    public void cutoffInRange() {
        int n = 10;
        boolean outsideMode = false;
        boolean result = testObj.inRange(n, outsideMode);
        Assert.assertTrue(result);
    }
}
