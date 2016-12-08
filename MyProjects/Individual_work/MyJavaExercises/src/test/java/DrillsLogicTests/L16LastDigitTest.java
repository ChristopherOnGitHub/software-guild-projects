/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L16LastDigit;
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
public class L16LastDigitTest {
    
    L16LastDigit testObj = new L16LastDigit();
    
    public L16LastDigitTest() {
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
     public void simpleLast() {
     int a = 13;
     int b = 123;
     int c = 33;
     boolean result = testObj.lastDigit(a, b, c);
     Assert.assertTrue(result);
     }
         
     @Test
     public void simpleFalse() {
     int a = 12;
     int b = 126;
     int c = 33;
     boolean result = testObj.lastDigit(a, b, c);
     Assert.assertFalse(result);
     }
         
     @Test
     public void aAndB() {
     int a = 13;
     int b = 123;
     int c = 39;
     boolean result = testObj.lastDigit(a, b, c);
     Assert.assertTrue(result);
     }
         
     @Test
     public void aAndC() {
     int a = 13;
     int b = 124;
     int c = 33;
     boolean result = testObj.lastDigit(a, b, c);
     Assert.assertTrue(result);
     }
         
     @Test
     public void bAndC() {
     int a = 1;
     int b = 123;
     int c = 33;
     boolean result = testObj.lastDigit(a, b, c);
     Assert.assertTrue(result);
     }
}
