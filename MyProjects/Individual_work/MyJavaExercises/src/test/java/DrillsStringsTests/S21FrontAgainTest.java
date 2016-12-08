/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S21FrontAgain;
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
public class S21FrontAgainTest {
    
    S21FrontAgain testObj = new S21FrontAgain();
    
    public S21FrontAgainTest() {
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
     String test = "edited";
     boolean result = testObj.frontAgain(test);
     Assert.assertTrue(result);
     }
     
     @Test
     public void doesntMatch() {
     String test = "editor";
     boolean result = testObj.frontAgain(test);
     Assert.assertFalse(result);
     }
     
     @Test
     public void threeLetters() {
     String test = "zzz";
     boolean result = testObj.frontAgain(test);
     Assert.assertTrue(result);
     }
     
     @Test
     public void palindrome() {
     String test = "racecar";
     boolean result = testObj.frontAgain(test);
     Assert.assertFalse(result);
     }
     
     @Test
     public void caseSensitive() {
     String test = "Poop";
     boolean result = testObj.frontAgain(test);
     Assert.assertFalse(result);
     }
     
     @Test
     public void derp() {
     String test = "Glorious false assertion";
     boolean result = testObj.frontAgain(test);
     Assert.assertFalse(result);
     }
}
