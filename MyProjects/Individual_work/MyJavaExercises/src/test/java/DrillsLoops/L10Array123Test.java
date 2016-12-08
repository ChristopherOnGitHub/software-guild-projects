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
public class L10Array123Test {
    
    L10Array123 testObj = new L10Array123();
    
    public L10Array123Test() {
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
     int[] x = {1,2,3};
     boolean result = testObj.array123(x);
     Assert.assertTrue(result);
     }
         
     @Test
     public void LastInArray() {
     int[] x = {3,2,1,1,2,3};
     boolean result = testObj.array123(x);
     Assert.assertTrue(result);
     }     
         
     @Test
     public void simpleFalse() {
     int[] x = {0,0,0,00,0,};
     boolean result = testObj.array123(x);
     Assert.assertFalse(result);
     }
         
     @Test
     public void negatives() {
     int[] x = {1,2,-3};
     boolean result = testObj.array123(x);
     Assert.assertFalse(result);
     }
         
     @Test
     public void lastOne() {
     int[] x = {5,6,2,1};
     boolean result = testObj.array123(x);
     Assert.assertFalse(result);
     }
}
