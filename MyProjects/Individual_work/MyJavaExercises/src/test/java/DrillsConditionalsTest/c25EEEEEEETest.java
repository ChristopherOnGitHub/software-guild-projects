/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c25EEEEEEE;
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
public class c25EEEEEEETest {

    c25EEEEEEE testObj = new c25EEEEEEE();

    public c25EEEEEEETest() {
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
        String str = "to";
        boolean result = testObj.gotE(str);
        Assert.assertTrue(result);
    }

    @Test
    public void oneLetter() {
        String str = "x";
        boolean result = testObj.gotE(str);
        Assert.assertTrue(result);
    }

    @Test
    public void threeLetters() {
        String str = "aye";
        boolean result = testObj.gotE(str);
        Assert.assertTrue(result);
    }

    @Test
    public void simpleFalse() {
        String str = "Christopher Floyd";
        boolean result = testObj.gotE(str);
        Assert.assertFalse(result);
    }

    @Test
    public void empty() {
        String str = "";
        boolean result = testObj.gotE(str);
        Assert.assertFalse(result);
    }

    @Test
    public void numbers() {
        String str = "12";
        boolean result = testObj.gotE(str);
        Assert.assertTrue(result);
    }

}
