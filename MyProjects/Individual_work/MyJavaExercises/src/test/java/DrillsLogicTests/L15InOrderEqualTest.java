/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L15InOrderEqual;
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
public class L15InOrderEqualTest {
    
    L15InOrderEqual testObj = new L15InOrderEqual();
    
    public L15InOrderEqualTest() {
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
     int a = 4;
     int b = 35;
     int c = 78;
     boolean x = false;
     boolean result = testObj.inOrderEqual(a, b, c, x);
     Assert.assertTrue(result);
     }
         
     @Test
     public void stillTrue() {
     int a = 4;
     int b = 35;
     int c = 78;
     boolean x = true;
     boolean result = testObj.inOrderEqual(a, b, c, x);
     Assert.assertTrue(result);
     }
         
     @Test
     public void equalTrue() {
     int a = 4;
     int b = 4;
     int c = 78;
     boolean x = true;
     boolean result = testObj.inOrderEqual(a, b, c, x);
     Assert.assertTrue(result);
     }
         
     @Test
     public void allThreeEqual() {
     int a = 4;
     int b = 4;
     int c = 4;
     boolean x = true;
     boolean result = testObj.inOrderEqual(a, b, c, x);
     Assert.assertTrue(result);
     }
         
     @Test
     public void equalFalse() {
     int a = 4;
     int b = 4;
     int c = 78;
     boolean x = false;
     boolean result = testObj.inOrderEqual(a, b, c, x);
     Assert.assertFalse(result);
     }
}
