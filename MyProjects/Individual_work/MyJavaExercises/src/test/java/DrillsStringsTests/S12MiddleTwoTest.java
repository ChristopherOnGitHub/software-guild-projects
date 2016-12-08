/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S12MiddleTwo;
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
public class S12MiddleTwoTest {

    S12MiddleTwo testObj = new S12MiddleTwo();

    public S12MiddleTwoTest() {
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
        String x = "help";
        String result = testObj.middleTwo(x);
        String expect = "el";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void longer() {
        String x = "thisislongthis";
        String result = testObj.middleTwo(x);
        String expect = "lo";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void numbers() {
        String x = "123456";
        String result = testObj.middleTwo(x);
        String expect = "34";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void capitals() {
        String x = "YeLlOw";
        String result = testObj.middleTwo(x);
        String expect = "Ll";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void spaces() {
        String x = "spa  ces";
        String result = testObj.middleTwo(x);
        String expect = "  ";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void idunnoMan() {
        String x = "derp";
        String result = testObj.middleTwo(x);
        String expect = "er";
        Assert.assertEquals(expect, result);
    }
}
