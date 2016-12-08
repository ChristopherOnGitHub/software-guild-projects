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
public class L16NoTriplesTest {
    
    L16NoTriples testObj = new L16NoTriples();
    
    public L16NoTriplesTest() {
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
     int[] x = {1,2,3,4,5};
     boolean result = testObj.noTriples(x);
     Assert.assertTrue(result);
     }
         
     @Test
     public void frontTriple() {
     int[] x = {1,1,1,4,5};
     boolean result = testObj.noTriples(x);
     Assert.assertFalse(result);
     }
         
     @Test
     public void backTriple() {
     int[] x = {1,2,3,4,5,5,5};
     boolean result = testObj.noTriples(x);
     Assert.assertFalse(result);
     }
         
     @Test
     public void midTriple() {
     int[] x = {1,2,3,3,3,4,5};
     boolean result = testObj.noTriples(x);
     Assert.assertFalse(result);
     }
         
     @Test
     public void twoTriples() {
     int[] x = {1,2,3,4,4,4,5,5,5};
     boolean result = testObj.noTriples(x);
     Assert.assertFalse(result);
     }
         
     @Test
     public void one() {
     int[] x = {1};
     boolean result = testObj.noTriples(x);
     Assert.assertTrue(result);
     }
}
