/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c27EveryNth;
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
public class c27EveryNthTest {
    
    c27EveryNth testObj = new c27EveryNth();
    
    public c27EveryNthTest() {
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
     String test = "abcabcabc";
     int n = 3;
     String expect = "aaa";
     String result = testObj.everyNth(test, n);
     Assert.assertEquals(expect, result);
     }
     
          @Test
     public void everyLetter() {
     String test = "derp";
     int n = 1;
     String expect = "derp";
     String result = testObj.everyNth(test, n);
     Assert.assertEquals(expect, result);
     }
     
          @Test
     public void everyOther() {
     String test = "xoxoxo";
     int n = 2;
     String expect = "xxx";
     String result = testObj.everyNth(test, n);
     Assert.assertEquals(expect, result);
     }
     
          @Test
     public void numbers() {
     String test = "0123456789";
     int n = 3;
     String expect = "0369";
     String result = testObj.everyNth(test, n);
     Assert.assertEquals(expect, result);
     }
     
          @Test
     public void derp() {
     String test = "abcabcabc";
     int n = 2;
     String expect = "acbac";
     String result = testObj.everyNth(test, n);
     Assert.assertEquals(expect, result);
     }

}
