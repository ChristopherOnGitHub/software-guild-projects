/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c20RemoveDel;
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
public class c20RemoveDelTest {

    c20RemoveDel testObj = new c20RemoveDel();

    public c20RemoveDelTest() {
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
        String str = "1delMe";
        String expect = "1Me";
        String result = testObj.removeDel(str);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void nodel() {
        String str = "1dlMe";
        String expect = "1dlMe";
        String result = testObj.removeDel(str);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void capitalD() {
        String str = "1DelMe";
        String expect = "1DelMe";
        String result = testObj.removeDel(str);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void shortWord() {
        String str = "Me";
        String expect = "Me";
        String result = testObj.removeDel(str);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void empty() {
        String str = "";
        String expect = "";
        String result = testObj.removeDel(str);
        Assert.assertEquals(expect, result);
    }
}
