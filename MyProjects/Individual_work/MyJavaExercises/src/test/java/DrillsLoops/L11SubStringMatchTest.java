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
public class L11SubStringMatchTest {

    L11SubStringMatch testObj = new L11SubStringMatch();

    public L11SubStringMatchTest() {
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
    public void simpleTrue() {
        String a = "ab";
        String b = "ab";
        int result = testObj.subStringMatch(a, b);
        Assert.assertEquals(1, result);
    }

    @Test
    public void multiples() {
        String a = "xy";
        String b = "xy xy xy";
        int result = testObj.subStringMatch(a, b);
        Assert.assertEquals(3, result);
    }
    
    @Test
    public void biggerFirst() {
        String a = "SffFsSffsSf";
        String b = "Sf";
        int result = testObj.subStringMatch(a, b);
        Assert.assertEquals(3, result);
    }
    
    @Test
    public void spaces() {
        String a = "  ";
        String b = "Hello  this  is  impractical";
        int result = testObj.subStringMatch(a, b);
        Assert.assertEquals(3, result);
    }
    
    @Test
    public void derp() {
        String a = "derp";
        String b = "dear me, this is another derp test. How unimaginative!";
        int result = testObj.subStringMatch(a, b);
        Assert.assertEquals(5, result);
    }
    
    @Test
    public void numbers() {
        String a = "30";
        String b = "2175302856293549871230123487930-287659301289742383024902003045";
        int result = testObj.subStringMatch(a, b);
        Assert.assertEquals(6, result);
    }
}
