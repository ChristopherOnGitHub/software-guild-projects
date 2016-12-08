/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLoops;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class L8Count9Test {

    L8Count9 testObj = new L8Count9();

    public L8Count9Test() {
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
    public void hello() {
        int[] x = {9, 9, 9};
        int result = testObj.count9(x);
        Assert.assertEquals(3, result);
    }

    @Test
    public void negatives() {
        int[] x = {9, 9, -9, -1};
        int result = testObj.count9(x);
        Assert.assertEquals(2, result);
    }

    @Test
    public void noNines() {
        int[] x = {1, 2, 3};
        int result = testObj.count9(x);
        Assert.assertEquals(0, result);
    }

    @Test
    public void ninetyNines() {
        int[] x = {99, 99, 99};
        int result = testObj.count9(x);
        Assert.assertEquals(0, result);
    }

    @Test
    public void empty() {
        int[] x = {};
        int result = testObj.count9(x);
        Assert.assertEquals(0, result);
    }

    @Test
    public void justOne() {
        int[] x = {9};
        int result = testObj.count9(x);
        Assert.assertEquals(1, result);
    }
}
