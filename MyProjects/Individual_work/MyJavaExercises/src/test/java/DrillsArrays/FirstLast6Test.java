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
public class FirstLast6Test {

    public FirstLast6Test() {
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
    public void firstSix() {
        int[] x = {6, 1, 1, 1};
        FirstLast6 FirstLast6 = new FirstLast6();
        boolean result = FirstLast6.FirstLast6(x);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void lastSix() {
        int[] x = {1, 2, 3, 4, 5, 6};
        FirstLast6 testObj = new FirstLast6();
        boolean result = testObj.FirstLast6(x);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void noSix() {
        int[] x = {3, 4, 3, 8, 7};
        FirstLast6 asdf = new FirstLast6();
        boolean result = asdf.FirstLast6(x);
        boolean expected = false;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void negativeSix() {
        int[] x = {4, 3, 7, -6};
        FirstLast6 testObj = new FirstLast6();
        boolean actual = testObj.FirstLast6(x);
        boolean expects = false;
        Assert.assertEquals(expects, actual);
    }
}
