/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsArrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class unlucky1Test {

    Unlucky1 testObj = new Unlucky1();

    public unlucky1Test() {
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
    public void simplePass() {
        int[] x = {1, 3, 3, 3, 3};
        boolean result = testObj.unlucky1(x);
        Assert.assertTrue(result);
    }

    @Test
    public void simpleFail() {
        int[] x = {1, 2, 3, 4, 5};
        boolean actual = testObj.unlucky1(x);
        Assert.assertFalse(actual);
    }

    @Test
    public void unluckyInMiddle() {
        int[] x = {2, 2, 2, 2, 2, 1, 3, 2, 2, 2, 2};
        boolean result = testObj.unlucky1(x);
        Assert.assertFalse(result);
    }

    @Test
    public void empty() {
        int[] x = {};
        boolean result = testObj.unlucky1(x);
        Assert.assertFalse(result);
    }
}
