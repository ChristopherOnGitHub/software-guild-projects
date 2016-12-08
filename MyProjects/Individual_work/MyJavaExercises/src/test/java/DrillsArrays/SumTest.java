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
public class SumTest {

    public SumTest() {
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

    @Test
    public void testSum1() {

        int[] test = {1, 2, 3};
        Sum testObj = new Sum();
        int result = testObj.sum(test);
        Assert.assertEquals(6, result);
    }

    @Test
    public void testNegative() {
        int[] test = {-1, -18, -5};
        Sum testObj = new Sum();
        int result = testObj.sum(test);
        Assert.assertEquals(-24, result);
    }

    @Test
    public void testLargeNumbers() {
        int[] test2 = {10000, 20000, 10000};
        Sum testObj = new Sum();
        int result = testObj.sum(test2);
        Assert.assertEquals(40000, result);
    }

    @Test
    public void testZeros() {
        int[] test = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Sum testObj = new Sum();
        int ZEROOOO = testObj.sum(test);
        Assert.assertEquals(0, ZEROOOO);
    }

}
