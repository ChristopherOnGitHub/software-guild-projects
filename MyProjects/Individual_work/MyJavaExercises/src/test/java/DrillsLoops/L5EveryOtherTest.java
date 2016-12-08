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
public class L5EveryOtherTest {

    L5EveryOther testObj = new L5EveryOther();

    public L5EveryOtherTest() {
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
        String str = "aabbcc";
        String result = testObj.everyOther(str);
        String expect = "abc";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void oddLetters() {
        String str = "aabbc";
        String result = testObj.everyOther(str);
        String expect = "abc";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void spaces() {
        String str = "a b c d";
        String result = testObj.everyOther(str);
        String expect = "abcd";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void tripp() {
        String str = "tdr.iwpvp!";
        String result = testObj.everyOther(str);
        String expect = "tripp";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void derpderpderp() {
        String str = "derpderpderp";
        String result = testObj.everyOther(str);
        String expect = "drdrdr";
        Assert.assertEquals(expect, result);
    }
}
