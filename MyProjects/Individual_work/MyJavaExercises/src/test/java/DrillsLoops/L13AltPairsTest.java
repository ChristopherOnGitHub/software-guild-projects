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
public class L13AltPairsTest {
    
    L13AltPairs testObj = new L13AltPairs();
    
    public L13AltPairsTest() {
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
     public void simple() {
     String x = "hi";
     String result = testObj.altPairs(x);
     String expect = "hi";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void longer() {
     String x = "longer";
     String result = testObj.altPairs(x);
     String expect = "loer";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void justOne() {
     String x = "i";
     String result = testObj.altPairs(x);
     String expect = "i";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void empty() {
     String x = "";
     String result = testObj.altPairs(x);
     String expect = "";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void waysuperlonger() {
     String x = "waysuperlonger";
     String result = testObj.altPairs(x);
     String expect = "wauplo";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void numbers() {
     String x = "0123456789";
     String result = testObj.altPairs(x);
     String expect = "014589";
     Assert.assertEquals(expect, result);
     }
     
}
