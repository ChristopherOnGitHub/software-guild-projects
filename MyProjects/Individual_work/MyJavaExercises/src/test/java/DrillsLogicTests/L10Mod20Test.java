/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L10Mod20;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class L10Mod20Test {

    L10Mod20 testObj = new L10Mod20();

    public L10Mod20Test() {
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
        int x = 21;
        boolean result = testObj.mod20(x);
        Assert.assertTrue(result);
    }

    @Test
    public void twoAboveTrue() {
        int x = 22;
        boolean result = testObj.mod20(x);
        Assert.assertTrue(result);
    }

    @Test
    public void negative() {
        int x = -41;
        boolean result = testObj.mod20(x);
        Assert.assertFalse(result);
    }

    @Test
    public void simpleFalse() {
        int x = 13;
        boolean result = testObj.mod20(x);
        Assert.assertFalse(result);
    }

    @Test
    public void zero() {
        int x = 1;
        boolean result = testObj.mod20(x);
        Assert.assertTrue(result);
    }

}
