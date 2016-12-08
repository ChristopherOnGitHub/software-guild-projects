/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c14Multiple3or5;
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
public class c14Multiple3or5Test {
    
    c14Multiple3or5 testObj = new c14Multiple3or5();
    
    public c14Multiple3or5Test() {
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
     int x = 3;
     boolean result = testObj.multiple3or5(x);
     Assert.assertTrue(result);
     }
         
     @Test
     public void simple5True() {
     int x = 5;
     boolean result = testObj.multiple3or5(x);
     Assert.assertTrue(result);
     }
         
     @Test
     public void bothTrue() {
     int x = 15;
     boolean result = testObj.multiple3or5(x);
     Assert.assertTrue(result);
     }
         
     @Test
     public void simpleFalse() {
     int x = 7;
     boolean result = testObj.multiple3or5(x);
     Assert.assertFalse(result);
     }
         
     @Test
     public void zero() {
     int x = 0;
     boolean result = testObj.multiple3or5(x);
     Assert.assertTrue(result);
     }
         
     @Test
     public void bigNumberBoth() {
     int x = 300;
     boolean result = testObj.multiple3or5(x);
     Assert.assertTrue(result);
     }
}
