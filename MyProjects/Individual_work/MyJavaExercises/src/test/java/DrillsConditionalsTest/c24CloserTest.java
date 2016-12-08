/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c24Closer;
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
public class c24CloserTest {
    
    c24Closer testObj = new c24Closer();
    
    public c24CloserTest() {
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
     public void aCloser() {
     int a = 9;
     int b = 34;
     int result = testObj.closer(a, b);
     Assert.assertEquals(9, result);
     }
         
     @Test
     public void bCloser() {
     int a = 34;
     int b = 9;
     int result = testObj.closer(a, b);
     Assert.assertEquals(9, result);
     }
         
     @Test
     public void isTenCloser() {
     int a = 10;
     int b = 34;
     int result = testObj.closer(a, b);
     Assert.assertEquals(10, result);
     }
         
     @Test
     public void tie() {
     int a = 9;
     int b = 9;
     int result = testObj.closer(a, b);
     Assert.assertEquals(0, result);
     }
         
     @Test
     public void negatives() {
     int a = -9;
     int b = -34;
     int result = testObj.closer(a, b);
     Assert.assertEquals(-9, result);
     }
         
     @Test
     public void derp() {
     int a = 11;
     int b = 8;
     int result = testObj.closer(a, b);
     Assert.assertEquals(11, result);
     }
}
