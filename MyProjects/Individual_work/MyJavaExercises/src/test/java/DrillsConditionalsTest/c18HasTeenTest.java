/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c18HasTeen;
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
public class c18HasTeenTest {
    
    c18HasTeen testObj = new c18HasTeen();
    
    public c18HasTeenTest() {
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
     int a = 15;
     int b = 21;
     int c = 89;
     boolean result = testObj.hasTeen(a, b, c);
     Assert.assertTrue(result);
     }
         
     @Test
     public void simpleFalse() {
     int a = 34;
     int b = 21;
     int c = 89;
     boolean result = testObj.hasTeen(a, b, c);
     Assert.assertFalse(result);
     }
         
     @Test
     public void allTeens() {
     int a = 15;
     int b = 17;
     int c = 16;
     boolean result = testObj.hasTeen(a, b, c);
     Assert.assertTrue(result);
     }
         
     @Test
     public void twoTrue() {
     int a = 15;
     int b = 18;
     int c = 89;
     boolean result = testObj.hasTeen(a, b, c);
     Assert.assertTrue(result);
     }
         
     @Test
     public void zeros() {
     int a = 0;
     int b = 0;
     int c = 0;
     boolean result = testObj.hasTeen(a, b, c);
     Assert.assertFalse(result);
     }
         
     @Test
     public void negatives() {
     int a = -15;
     int b = -21;
     int c = -19;
     boolean result = testObj.hasTeen(a, b, c);
     Assert.assertFalse(result);
     }
}
