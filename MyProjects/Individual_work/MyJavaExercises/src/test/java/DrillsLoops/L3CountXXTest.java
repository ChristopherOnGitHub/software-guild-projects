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
public class L3CountXXTest {
    
    L3CountXX testObj = new L3CountXX();
    
    public L3CountXXTest() {
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
     String xx = "xx";
     int result = testObj.countXX(xx);
     Assert.assertEquals(1, result);
     }
     
          @Test
     public void simpleNone() {
     String xx = "xax";
     int result = testObj.countXX(xx);
     Assert.assertEquals(0, result);
     }
     
          @Test
     public void multiX() {
     String xx = "xxxx";
     int result = testObj.countXX(xx);
     Assert.assertEquals(3, result);
     }
     
          @Test
     public void empty() {
     String xx = "";
     int result = testObj.countXX(xx);
     Assert.assertEquals(0, result);
     }
     
          @Test
     public void ends() {
     String xx = "xxtxx";
     int result = testObj.countXX(xx);
     Assert.assertEquals(2, result);
     }
     
          @Test
     public void derp() {
     String xx = "xderpxderpxx";
     int result = testObj.countXX(xx);
     Assert.assertEquals(1, result);
     }
}
