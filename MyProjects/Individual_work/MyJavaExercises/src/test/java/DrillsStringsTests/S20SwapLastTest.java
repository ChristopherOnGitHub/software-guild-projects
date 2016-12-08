/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S20SwapLast;
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
public class S20SwapLastTest {
    
    S20SwapLast testObj = new S20SwapLast();
    
    public S20SwapLastTest() {
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
     String test = "tester";
     String expect = "testre";
     String result = testObj.swapLast(test);
     Assert.assertEquals(expect, result);
     }
     
     
     @Test
     public void numbers() {
     String test = "test12";
     String expect = "test21";
     String result = testObj.swapLast(test);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void period() {
     String test = "stop.";
     String expect = "sto.p";
     String result = testObj.swapLast(test);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void stillWorks() {
     String test = "yeah";
     String expect = "yeha";
     String result = testObj.swapLast(test);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void sameLetter() {
     String test = "boiii";
     String expect = "boiii";
     String result = testObj.swapLast(test);
     Assert.assertEquals(expect, result);
     }
}
