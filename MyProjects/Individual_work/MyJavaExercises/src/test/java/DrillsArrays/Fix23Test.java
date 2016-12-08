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
public class Fix23Test {

    Fix23 testObj = new Fix23();

    public Fix23Test() {
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
    //
    @Test
    public void simpleTest() {
        int[] x = {1, 2, 3};
        int[] expected = {1, 2, 0};
        int[] result = testObj.fix23(x);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void emptyTest() {
        int[] x = {};
        int[] expected = {};
        int[] result = testObj.fix23(x);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void simpleFail() {
        int[] x = {1, 2, 4};
        int[] expected = {1, 2, 4};
        int[] result = testObj.fix23(x);
        Assert.assertArrayEquals(expected, result);
    }
}
