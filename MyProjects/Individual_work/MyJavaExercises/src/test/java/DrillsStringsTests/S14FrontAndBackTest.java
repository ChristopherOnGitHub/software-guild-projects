/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S14FrontAndBack;
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
public class S14FrontAndBackTest {
    
    S14FrontAndBack testObj = new S14FrontAndBack();
    
    public S14FrontAndBackTest() {
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
     String test = "Hello";
     int x = 2;
     String expect = "Helo";
     String result = testObj.frontAndBack(test, x);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void twoLetter() {
     String test = "Hi";
     int x = 2;
     String expect = "HiHi";
     String result = testObj.frontAndBack(test, x);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void zero() {
     String test = "Hello";
     int x = 0;
     String expect = "";
     String result = testObj.frontAndBack(test, x);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void idk() {
     String test = "idk";
     int x = 3;
     String expect = "idkidk";
     String result = testObj.frontAndBack(test, x);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void asdf() {
     String test = "asdf";
     int x = 1;
     String expect = "af";
     String result = testObj.frontAndBack(test, x);
     Assert.assertEquals(expect, result);
     }
     
}
