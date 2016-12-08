/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c22StartOz;
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
public class c22StartOzTest {

    c22StartOz testObj = new c22StartOz();

    public c22StartOzTest() {
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
    public void happyPath() {
        String str = "ozyYeah!";
        String result = testObj.startOz(str);
        String expect = "oz";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void justO() {
        String str = "oH!";
        String result = testObj.startOz(str);
        String expect = "o";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void capiatalsNeedsClarification() {
        String str = "OZyYeah!";
        String result = testObj.startOz(str);
        String expect = "";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void justZ() {
        String str = "Izzy";
        String result = testObj.startOz(str);
        String expect = "z";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void backurds() {
        String str = "zoology";
        String result = testObj.startOz(str);
        String expect = "";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void derp() {
        String str = "derp";
        String result = testObj.startOz(str);
        String expect = "";
        Assert.assertEquals(expect, result);
    }
}
