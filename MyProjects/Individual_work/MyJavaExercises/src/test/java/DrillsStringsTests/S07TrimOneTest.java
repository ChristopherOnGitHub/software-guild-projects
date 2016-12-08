/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S07TrimOne;
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
public class S07TrimOneTest {
    
    S07TrimOne testObj = new S07TrimOne();
    
    public S07TrimOneTest() {
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
     String x = "xOH YEAHx";
     String expect = "OH YEAH";
     String result = testObj.trimOne(x);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void numbers() {
     String x = "12345";
     String expect = "234";
     String result = testObj.trimOne(x);
     Assert.assertEquals(expect, result);
     }      
         
     @Test
     public void noSpaces() {
     String x = " hello ";
     String expect = "hello";
     String result = testObj.trimOne(x);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void knife() {
     String x = "knife";
     String expect = "nif";
     String result = testObj.trimOne(x);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void lllamas() {
     String x = "lllamas";
     String expect = "llama";
     String result = testObj.trimOne(x);
     Assert.assertEquals(expect, result);
     }
}
