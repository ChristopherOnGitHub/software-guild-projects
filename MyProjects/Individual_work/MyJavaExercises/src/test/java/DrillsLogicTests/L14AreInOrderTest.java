/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsLogicTests;

import DrillsLogic.L14AreInOrder;
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
public class L14AreInOrderTest {
    
    L14AreInOrder testObj = new L14AreInOrder();
    
    public L14AreInOrderTest() {
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
     int a = 1;
     int b = 2;
     int c = 3;
     boolean bOk = false;
     boolean result = testObj.areInOrder(a, b, c, bOk);
     Assert.assertTrue(result);
     }
         
     @Test
     public void bOkBoolean() {
     int a = 1;
     int b = 0;
     int c = 3;
     boolean bOk = true;
     boolean result = testObj.areInOrder(a, b, c, bOk);
     Assert.assertTrue(result);
     }
         
     @Test
     public void reverse() {
     int a = 9;
     int b = 7;
     int c = 3;
     boolean bOk = false;
     boolean result = testObj.areInOrder(a, b, c, bOk);
     Assert.assertFalse(result);
     }
         
     @Test
     public void reverseBOk() {
     int a = 9;
     int b = 8;
     int c = 7;
     boolean bOk = true;
     boolean result = testObj.areInOrder(a, b, c, bOk);
     Assert.assertFalse(result);
     }
         
     @Test
     public void negatives() {
     int a = -91;
     int b = -72;
     int c = -3;
     boolean bOk = false;
     boolean result = testObj.areInOrder(a, b, c, bOk);
     Assert.assertTrue(result);
     }
}
