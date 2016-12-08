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
public class L12StringXTest {
    
    L12StringX testObj = new L12StringX();
    
    public L12StringXTest() {
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
     String noX = "asdfxasdf";
     String result = testObj.stringX(noX);
     String expect = "asdfasdf";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void xFront() {
     String noX = "xasdfxasdf";
     String result = testObj.stringX(noX);
     String expect = "xasdfasdf";
     Assert.assertEquals(expect, result);
     }
              
     @Test
     public void xBack() {
     String noX = "xasdfxasdfx";
     String result = testObj.stringX(noX);
     String expect = "xasdfasdfx";
     Assert.assertEquals(expect, result);
     }
              
     @Test
     public void xx() {
     String noX = "xx";
     String result = testObj.stringX(noX);
     String expect = "xx";
     Assert.assertEquals(expect, result);
     }
              
     @Test
     public void none() {
     String noX = "none";
     String result = testObj.stringX(noX);
     String expect = "none";
     Assert.assertEquals(expect, result);
     }
}
