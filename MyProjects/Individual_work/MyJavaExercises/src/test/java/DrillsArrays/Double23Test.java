/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsArrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class Double23Test {
    
    public Double23Test() {
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
    //
     @Test
     public void doubleTwoTrue() {
     int[] x = {2, 2, 3, 4, 5};
     Double23 testObj = new Double23();
     boolean result = testObj.double23(x);
     Assert.assertTrue(result);
     }
     
     @Test
     public void doubleThreeTrue() {
         int[] testArray = {3, 3, 9};
         Double23 Double23 = new Double23();
         boolean result = Double23.double23(testArray);
         boolean expected = true;
         Assert.assertEquals(expected, result);
     }
     
     @Test
     public void simpleFalse() {
         int[] arrX = {0,1,2,3,4,5,6,7};
         Double23 testObj = new Double23();
         boolean result = testObj.double23(arrX);
         Assert.assertFalse(result);
     }
     
     @Test
     public void negativeFalse() {
         int[] negArray = {-2, -2, -3, -3, 0};
         Double23 tester = new Double23();
         boolean result = tester.double23(negArray);
         Assert.assertFalse(result);
     }
     
     @Test
     public void bothTrue(){
         int[] testArray = {2, 2, 3, 3};
         Double23 testObj = new Double23();
         boolean actual = testObj.double23(testArray);
         Assert.assertTrue(actual);
     }
     
     @Test
     public void testTwentyThree(){
         int[] x = {23, 23, 23, 23};
         Double23 testObj = new Double23();
         boolean actual = testObj.double23(x);
         Assert.assertFalse(actual);
     }
}
