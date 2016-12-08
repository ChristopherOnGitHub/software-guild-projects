/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c11FrontBack;
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
public class c11FrontBackTest {

    c11FrontBack testObj = new c11FrontBack();

    public c11FrontBackTest() {
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
        String str = "cat";
        String expect = "tac";
        String result = testObj.frontBack(str);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void oneLetter() {
        String str = "c";
        String expect = "c";
        String result = testObj.frontBack(str);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void capitals() {
        String str = "CAT";
        String expect = "TAC";
        String result = testObj.frontBack(str);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void sameLetters() {
        String str = "cccccc";
        String expect = "cccccc";
        String result = testObj.frontBack(str);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void numbers() {
        String str = "1234";
        String expect = "4231";
        String result = testObj.frontBack(str);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void derp() {
        String str = "derp";
        String expect = "perd";
        String result = testObj.frontBack(str);
        Assert.assertEquals(expect, result);
    }
}
