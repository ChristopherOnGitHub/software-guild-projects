/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLoops;

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
public class L14DoNotYakTest {

    L14DoNotYak testObj = new L14DoNotYak();

    public L14DoNotYakTest() {
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
        String x = "asdfyak";
        String expect = "asdf";
        String result = testObj.doNotYak(x);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void justYak() {
        String x = "yak";
        String expect = "";
        String result = testObj.doNotYak(x);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void multiYak() {
        String x = "asdfyakyakyakyak";
        String expect = "asdf";
        String result = testObj.doNotYak(x);
        Assert.assertEquals(expect, result);
    }
}
