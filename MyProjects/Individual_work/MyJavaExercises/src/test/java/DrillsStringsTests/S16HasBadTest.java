/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S16HasBad;
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
public class S16HasBadTest {
    
    S16HasBad testObj = new S16HasBad();
    
    public S16HasBadTest() {
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
     String test = "badString";
     boolean result = testObj.hasBad(test);
     Assert.assertTrue(result);
     }
         
     @Test
     public void oneOut() {
     String test = "xbadString";
     boolean result = testObj.hasBad(test);
     Assert.assertTrue(result);
     }
         
     @Test
     public void doesntContain() {
     String test = "notHere";
     boolean result = testObj.hasBad(test);
     Assert.assertFalse(result);
     }
         
     @Test
     public void shorty() {
     String test = "zz";
     boolean result = testObj.hasBad(test);
     Assert.assertFalse(result);
     }
         
     @Test
     public void doubles() {
     String test = "badbad";
     boolean result = testObj.hasBad(test);
     Assert.assertTrue(result);
     }
         
     @Test
     public void fakeOut() {
     String test = "bazinga";
     boolean result = testObj.hasBad(test);
     Assert.assertFalse(result);
     }
}
