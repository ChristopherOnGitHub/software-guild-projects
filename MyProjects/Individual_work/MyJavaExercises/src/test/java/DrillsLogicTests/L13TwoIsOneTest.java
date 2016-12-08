/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L13TwoIsOne;
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
public class L13TwoIsOneTest {
    
    L13TwoIsOne testObj = new L13TwoIsOne();
    
    public L13TwoIsOneTest() {
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
     public void aAndB() {
     int a = 1;
     int b = 2;
     int c = 3;
     boolean result = testObj.twoIsOne(a, b, c);
     Assert.assertTrue(result);
     }
         
     @Test
     public void aAndC() {
     int a = 1;
     int b = 5;
     int c = 4;
     boolean result = testObj.twoIsOne(a, b, c);
     Assert.assertTrue(result);
     }
         
     @Test
     public void cAndB() {
     int a = 9;
     int b = 6;
     int c = 3;
     boolean result = testObj.twoIsOne(a, b, c);
     Assert.assertTrue(result);
     }
         
     @Test
     public void simpleFalse() {
     int a = 3;
     int b = 3;
     int c = 3;
     boolean result = testObj.twoIsOne(a, b, c);
     Assert.assertFalse(result);
     }
         
     @Test
     public void negatives() {
     int a = -1;
     int b = 2;
     int c = -3;
     boolean result = testObj.twoIsOne(a, b, c);
     Assert.assertTrue(result);
     }
         
     @Test
     public void zeros() {
     int a = 0;
     int b = 0;
     int c = 0;
     boolean result = testObj.twoIsOne(a, b, c);
     Assert.assertTrue(result);
     }
}
