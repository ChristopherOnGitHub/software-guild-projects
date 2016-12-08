/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L5SkipSum;
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
public class L5SkipSumTest {

    L5SkipSum testObj = new L5SkipSum();

    public L5SkipSumTest() {
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
    public void simpleTest() {
        int a = 13;
        int b = 14;
        int result = testObj.skipSum(a, b);
        Assert.assertEquals(27, result);
    }

    @Test
    public void negative() {
        int a = -13;
        int b = -14;
        int result = testObj.skipSum(a, b);
        Assert.assertEquals(-27, result);
    }

    @Test
    public void zeroes() {
        int a = 0;
        int b = 0;
        int result = testObj.skipSum(a, b);
        Assert.assertEquals(0, result);
    }

    @Test
    public void toChangeRange() {
        int a = 3;
        int b = 14;
        int result = testObj.skipSum(a, b);
        Assert.assertEquals(20, result);
    }

    @Test
    public void toChangeNegative() {
        int a = -3;
        int b = 14;
        int result = testObj.skipSum(a, b);
        Assert.assertEquals(20, result);
    }

    @Test
    public void negativeRange() {
        int a = -13;
        int b = -4;
        int result = testObj.skipSum(a, b);
        Assert.assertEquals(-17, result);
    }
}
