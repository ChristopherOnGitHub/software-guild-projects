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
public class L4DoubleXTest {
    
    L4DoubleX testObj = new L4DoubleX();
    
    public L4DoubleXTest() {
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
     String str = "xxx";
     boolean result = testObj.doubleX(str);
     Assert.assertTrue(result);
     }
         
     @Test
     public void defShouldBeFalse() {
     String str = "abc";
     boolean result = testObj.doubleX(str);
     Assert.assertFalse(result);
     }
         
     @Test
     public void everyOther() {
     String str = "xaxax";
     boolean result = testObj.doubleX(str);
     Assert.assertFalse(result);
     }
         
     @Test
     public void atEnd() {
     String str = "asdfadsfasdfxx";
     boolean result = testObj.doubleX(str);
     Assert.assertTrue(result);
     }
         
     @Test
     public void xanax() {
     String str = "xanax";
     boolean result = testObj.doubleX(str);
     Assert.assertFalse(result);
     }
}
