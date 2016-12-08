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
public class L9ArrayFront9Test {
    
    L9ArrayFront9 testObj = new L9ArrayFront9();
    
    public L9ArrayFront9Test() {
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
     int[] x = {1, 2, 9, 3, 5};
     boolean awesome = testObj.arrayFront9(x);
     Assert.assertTrue(awesome);
     }
         
     @Test
     public void simpleFalse() {
     int[] x = {1, 2, 3, 5};
     boolean awesome = testObj.arrayFront9(x);
     Assert.assertFalse(awesome);
     }
         
     @Test
     public void atFour() {
     int[] x = {1, 2, 7, 9, 3, 5};
     boolean awesome = testObj.arrayFront9(x);
     Assert.assertTrue(awesome);
     }
         
     @Test
     public void afterFour() {
     int[] x = {1, 2, 3, 5, 6, 7, 9};
     boolean awesome = testObj.arrayFront9(x);
     Assert.assertFalse(awesome);
     }
         
     @Test
     public void multipleNines() {
     int[] x = {9, 2, 9, 3, 5};
     boolean awesome = testObj.arrayFront9(x);
     Assert.assertTrue(awesome);
     }
         
     @Test
     public void babyArray() {
     int[] x = {9};
     boolean awesome = testObj.arrayFront9(x);
     Assert.assertTrue(awesome);
     }
}
