/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLoops;

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
public class L17Pattern51Test {
    
    L17Pattern51 testObj = new L17Pattern51();
    
    public L17Pattern51Test() {
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
     int[]x = {2,7,1};
     boolean result = testObj.pattern51(x);
     Assert.assertTrue(result);
     }
         
     @Test
     public void shorty() {
     int[]x = {2};
     boolean result = testObj.pattern51(x);
     Assert.assertFalse(result);
     }
         
     @Test
     public void negatives() {
     int[]x = {0,5,-1};
     boolean result = testObj.pattern51(x);
     Assert.assertTrue(result);
     }
         
     @Test
     public void laterOnIn() {
     int[]x = {4,2,3,5,2,7,1};
     boolean result = testObj.pattern51(x);
     Assert.assertTrue(result);
     }
         
     @Test
     public void derp() {
     int[]x = {2,73,0,-3,123,1};
     boolean result = testObj.pattern51(x);
     Assert.assertFalse(result);
     }
         
     @Test
     public void zeros() {
     int[]x = {0,0,0,0,0,0,0,0,0};
     boolean result = testObj.pattern51(x);
     Assert.assertFalse(result);
     }
     
}
