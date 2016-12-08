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
public class L1StringTimesTest {
    
    L1StringTimes testObj = new L1StringTimes();
    
    public L1StringTimesTest() {
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
     public void hello() {
     String str = "Hello";
     int n = 2;
     String expect = "HelloHello";
     String result = testObj.stringTimes(str, n);
     Assert.assertEquals(expect, result);
     }    
     
     @Test
     public void Derp() {
     String str = "Derp";
     int n = 5;
     String expect = "DerpDerpDerpDerpDerp";
     String result = testObj.stringTimes(str, n);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void Zero() {
     String str = "Zero";
     int n = 0;
     String expect = "";
     String result = testObj.stringTimes(str, n);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void X() {
     String str = "X";
     int n = 3;
     String expect = "XXX";
     String result = testObj.stringTimes(str, n);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void withSpaces() {
     String str = "$ ";
     int n = 3;
     String expect = "$ $ $ ";
     String result = testObj.stringTimes(str, n);
     Assert.assertEquals(expect, result);
     }
}
