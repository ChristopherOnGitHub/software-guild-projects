/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L9SpecialEleven;
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
public class L9SpecialElevenTest {

    L9SpecialEleven testObj = new L9SpecialEleven();

    public L9SpecialElevenTest() {
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
    public void simpleFalse() {
        int x = 7;
        boolean result = testObj.specialEleven(x);
        Assert.assertFalse(result);
    }

    @Test
    public void simpleTrue() {
        int x = 33;
        boolean result = testObj.specialEleven(x);
        Assert.assertTrue(result);
    }

    @Test
    public void multiplePlusOne() {
        int x = 45;
        boolean result = testObj.specialEleven(x);
        Assert.assertTrue(result);
    }

    @Test
    public void negativeMultiple() {
        int x = -77;
        boolean result = testObj.specialEleven(x);
        Assert.assertFalse(result);
    }

    @Test
    public void oneLess() {
        int x = 21;
        boolean result = testObj.specialEleven(x);
        Assert.assertFalse(result);
    }

    @Test
    public void threeDigits() {
        int x = 110;
        boolean result = testObj.specialEleven(x);
        Assert.assertTrue(result);
    }
}
