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
public class GetMiddleTest {

    public GetMiddleTest() {
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
    public void simple() {
        int[] testA = {1, 2, 3};
        int[] testB = {4, 5, 6};
        GetMiddle GetMiddle = new GetMiddle();
        int[] expect = {2, 5};
        int[] result = GetMiddle.GetMiddle(testA, testB);
        Assert.assertArrayEquals(expect, result);
    }

    @Test
    public void negative() {
        int[] testA = {-1, -2, -3};
        int[] testB = {-4, -5, -6};
        GetMiddle testObj = new GetMiddle();
        int[] expect = {-2, -5};
        int[] result = testObj.GetMiddle(testA, testB);
        Assert.assertArrayEquals(expect, result);
    }

}
