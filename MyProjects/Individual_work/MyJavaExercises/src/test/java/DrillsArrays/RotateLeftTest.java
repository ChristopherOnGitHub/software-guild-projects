/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsArrays;

import static DrillsArrays.RotateLeft.Rotater;
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
public class RotateLeftTest {
    
    public RotateLeftTest() {
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
     public void happyPath() {
     int[] x = {1, 2, 3};
     RotateLeft Rotater = new RotateLeft();
     int[] result = Rotater.Rotater(x);
     int[] expected = {2, 3, 1};
     Assert.assertArrayEquals(result, expected);     
     }
     
     @Test
     public void negatives(){
         int[] x = {-1, -2, -3};
         RotateLeft testObj = new RotateLeft();
         int[] result = testObj.Rotater(x);
         int[] expected = {-2, -3, -1};
         Assert.assertArrayEquals(expected, result);
     }
     
     @Test
     public void zeroes(){
         int[] x = {0, 0, 0, 0};
         RotateLeft testObj = new RotateLeft();
         int[] result = testObj.Rotater(x);
         int[] expected = {0, 0, 0, 0};
         Assert.assertArrayEquals(result, expected);
     }
}
