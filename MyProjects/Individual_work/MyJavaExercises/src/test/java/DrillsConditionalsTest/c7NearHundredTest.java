/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c7NearHundred;
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
public class c7NearHundredTest {

    c7NearHundred testObj = new c7NearHundred();

    public c7NearHundredTest() {
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
    public void trueNear() {
        int x = 101;
        boolean result = testObj.nearHundred(x);
        Assert.assertTrue(result);
    }

    @Test
    public void simpleFalse() {
        int x = 4;
        boolean result = testObj.nearHundred(x);
        Assert.assertTrue(result);
    }

    @Test
    public void negative() {
        int x = -3;
        boolean result = testObj.nearHundred(x);
        Assert.assertTrue(result);
    }
}
