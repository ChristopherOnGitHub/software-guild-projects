/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c23Max;
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
public class c23MaxTest {

    c23Max testObj = new c23Max();

    public c23MaxTest() {
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
    public void aMax() {
        int a = 5;
        int b = 4;
        int c = 3;
        int result = testObj.max(a, b, c);
        Assert.assertEquals(5, result);
    }

    @Test
    public void bMax() {
        int a = 5;
        int b = 20;
        int c = 3;
        int result = testObj.max(a, b, c);
        Assert.assertEquals(20, result);
    }

    @Test
    public void cMax() {
        int a = 5;
        int b = 4;
        int c = 33;
        int result = testObj.max(a, b, c);
        Assert.assertEquals(33, result);
    }

    @Test
    public void negatives() {
        int a = -5;
        int b = -4;
        int c = -3;
        int result = testObj.max(a, b, c);
        Assert.assertEquals(-3, result);
    }

    @Test
    public void sames() {
        int a = 5;
        int b = 5;
        int c = 3;
        int result = testObj.max(a, b, c);
        Assert.assertEquals(5, result);
    }

    @Test
    public void samesMore() {
        int a = 5;
        int b = 6;
        int c = 6;
        int result = testObj.max(a, b, c);
        Assert.assertEquals(6, result);
    }
}
