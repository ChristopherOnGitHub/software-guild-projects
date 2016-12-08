/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c17Between10and20;
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
public class c17Between10and20Test {
    
    c17Between10and20 testObj = new c17Between10and20();
    
    public c17Between10and20Test() {
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
     int a = 15;
     int b = 13;
     boolean result = testObj.between10and20(a, b);
     Assert.assertTrue(result);
     }
         
     @Test
     public void simpleFalse() {
     int a = 1;
     int b = 21;
     boolean result = testObj.between10and20(a, b);
     Assert.assertFalse(result);
     }
         
     @Test
     public void inclusiveRangeTest() {
     int a = 10;
     int b = 20;
     boolean result = testObj.between10and20(a, b);
     Assert.assertTrue(result);
     }
         
     @Test
     public void negatives() {
     int a = -15;
     int b = -15;
     boolean result = testObj.between10and20(a, b);
     Assert.assertFalse(result);
     }
         
     @Test
     public void sameNumber() {
     int a = 15;
     int b = 15;
     boolean result = testObj.between10and20(a, b);
     Assert.assertTrue(result);
     }
         
     @Test
     public void oneTrue() {
     int a = 15;
     int b = 25;
     boolean result = testObj.between10and20(a, b);
     Assert.assertTrue(result);
     }
}
