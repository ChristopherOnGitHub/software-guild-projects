/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c9NotString;
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
public class c9NotStringTest {

    c9NotString testObj = new c9NotString();

    public c9NotStringTest() {
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
    public void simple() {
        String s = "bad";
        String result = testObj.notString(s);
        String expect = "not bad";
        Assert.assertEquals(result, expect);
    }

    @Test
    public void simpleLonger() {
        String s = "a perfect square";
        String result = testObj.notString(s);
        String expect = "not a perfect square";
        Assert.assertEquals(result, expect);
    }

    @Test
    public void hasNot() {
        String s = "not really sure";
        String result = testObj.notString(s);
        String expect = "not really sure";
        Assert.assertEquals(result, expect);
    }

}
