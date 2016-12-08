/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L11Mod35;
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
public class L11Mod35Test {
    
    L11Mod35 testObj = new L11Mod35();
    
    public L11Mod35Test() {
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
     public void div3() {
     int n = 9;
     boolean result = testObj.mod35(n);
     Assert.assertTrue(result);
     }
         
     @Test
     public void div5() {
     int n = 10;
     boolean result = testObj.mod35(n);
     Assert.assertTrue(result);
     }
         
     @Test
     public void bothDiv() {
     int n = 15;
     boolean result = testObj.mod35(n);
     Assert.assertFalse(result);
     }
         
     @Test
     public void simpleFalse() {
     int n = 13;
     boolean result = testObj.mod35(n);
     Assert.assertFalse(result);
     }
         
     @Test
     public void zero() {
     int n = 0;
     boolean result = testObj.mod35(n);
     Assert.assertFalse(result);
     }
         
     @Test
     public void negative() {
     int n = -9;
     boolean result = testObj.mod35(n);
     Assert.assertTrue(result);
     }
}
