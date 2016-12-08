/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c15StartHi;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class c15StartHiTest {
    
    c15StartHi testObj = new c15StartHi();
    
    public c15StartHiTest() {
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
     String testStr = "hi chris";
     boolean result = testObj.startHi(testStr);
     Assert.assertTrue(result);
     }
     
          @Test
     public void noSpace() {
     String testStr = "hichris";
     boolean result = testObj.startHi(testStr);
     Assert.assertFalse(result);
     }
     
          @Test
     public void capitalsAreBad() {
     String testStr = "Hi chris";
     boolean result = testObj.startHi(testStr);
     Assert.assertFalse(result);
     }
     
          @Test
     public void inTheMiddle() {
     String testStr = "1234 hi chris";
     boolean result = testObj.startHi(testStr);
     Assert.assertFalse(result);
     }
     
          @Test
     public void derp() {
     String testStr = "derp";
     boolean result = testObj.startHi(testStr);
     Assert.assertFalse(result);
     }
}
