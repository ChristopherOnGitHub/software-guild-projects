/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S06FirstHalf;
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
public class S06FirstHalfTest {

    S06FirstHalf testObj = new S06FirstHalf();

    public S06FirstHalfTest() {
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
        String str = "four";
        String result = testObj.firstHalf(str);
        String expect = "fo";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void oddNumber() {
        String str = "seven";
        String result = testObj.firstHalf(str);
        String expect = "seven";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void Capitals() {
        String str = "Four";
        String result = testObj.firstHalf(str);
        String expect = "Fo";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void numbers() {
        String str = "123456";
        String result = testObj.firstHalf(str);
        String expect = "123";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void soManyTests() {
        String str = "derp";
        String result = testObj.firstHalf(str);
        String expect = "de";
        Assert.assertEquals(expect, result);
    }

    @Test
    public void spaces() {
        String str = "i d k ";
        String result = testObj.firstHalf(str);
        String expect = "i d";
        Assert.assertEquals(expect, result);
    }

}
