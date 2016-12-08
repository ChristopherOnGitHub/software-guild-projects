/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c12Front3;
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
public class c12Front3Test {

    c12Front3 testObj = new c12Front3();

    public c12Front3Test() {
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
        String str = "hello";
        String actual = testObj.front3(str);
        String expect = "helhelhel";
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void twoLetters() {
        String str = "ab";
        String actual = testObj.front3(str);
        String expect = "ababab";
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void oneLetters() {
        String str = "x";
        String actual = testObj.front3(str);
        String expect = "xxx";
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void noLetters() {
        String str = "";
        String actual = testObj.front3(str);
        String expect = "";
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void numbers() {
        String str = "1234";
        String actual = testObj.front3(str);
        String expect = "123123123";
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void derp() {
        String str = "derp";
        String actual = testObj.front3(str);
        String expect = "derderder";
        Assert.assertEquals(expect, actual);
    }
}
