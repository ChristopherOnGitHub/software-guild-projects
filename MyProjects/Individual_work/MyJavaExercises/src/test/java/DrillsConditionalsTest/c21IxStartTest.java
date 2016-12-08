/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c21IxStart;
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
public class c21IxStartTest {

    c21IxStart testObj = new c21IxStart();

    public c21IxStartTest() {
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
        String testy = "pix";
        boolean result = testObj.ixStart(testy);
        Assert.assertTrue(result);
    }

    @Test
    public void shorty() {
        String testy = "ix";
        boolean result = testObj.ixStart(testy);
        Assert.assertFalse(result);
    }

    @Test
    public void space() {
        String testy = " ix";
        boolean result = testObj.ixStart(testy);
        Assert.assertTrue(result);
    }

    @Test
    public void simpleFlase() {
        String testy = "not even close bruh";
        boolean result = testObj.ixStart(testy);
        Assert.assertFalse(result);
    }

    @Test
    public void number(){
        String testy = "9ix";
        boolean result = testObj.ixStart(testy);
        Assert.assertTrue(result);
    }

    @Test
    public void empty() {
        String testy = "";
        boolean result = testObj.ixStart(testy);
        Assert.assertFalse(result);
    }
}
