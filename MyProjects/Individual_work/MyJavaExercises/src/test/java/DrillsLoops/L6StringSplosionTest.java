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
public class L6StringSplosionTest {
    
    L6StringSplosion testObj = new L6StringSplosion();
    
    public L6StringSplosionTest() {
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
     String str = "abc";
     String expect = "aababc";
     String result = testObj.stringSplosion(str);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void sameLetters() {
     String str = "aaa";
     String expect = "aaaaaa";
     String result = testObj.stringSplosion(str);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void spaces() {
     String str = "a b c ";
     String expect = "aa a ba b a b ca b c ";
     String result = testObj.stringSplosion(str);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void weirdChars() {
     String str = "@#4";
     String expect = "@@#@#4";
     String result = testObj.stringSplosion(str);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void Tripp() {
     String str = "Tripp";
     String expect = "TTrTriTripTripp";
     String result = testObj.stringSplosion(str);
     Assert.assertEquals(expect, result);
     }
     
}
