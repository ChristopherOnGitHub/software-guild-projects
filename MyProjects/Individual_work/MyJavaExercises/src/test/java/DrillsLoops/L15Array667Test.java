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
public class L15Array667Test {
    
    L15Array667 testObj = new L15Array667();
    
    public L15Array667Test() {
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
     int[] x = {4,6,6,3};
     int expect = 1;
     int result = testObj.array667(x);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void one() {
     int[] x = {6, 6};
     int expect = 1;
     int result = testObj.array667(x);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void sixSeven() {
     int[] x = {4,6,7,3};
     int expect = 1;
     int result = testObj.array667(x);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void inARow() {
     int[] x = {4,6,6,7,3};
     int expect = 2;
     int result = testObj.array667(x);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void sixtysix() {
     int[] x = {4,6,66,3};
     int expect = 0;
     int result = testObj.array667(x);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void gaps() {
     int[] x = {4,6,4,7,6,3};
     int expect = 0;
     int result = testObj.array667(x);
     Assert.assertEquals(expect, result);
     }
}
