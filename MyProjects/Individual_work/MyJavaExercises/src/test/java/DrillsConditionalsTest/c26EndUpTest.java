/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c26EndUp;
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
public class c26EndUpTest {
    
    c26EndUp testObj = new c26EndUp();
    
    public c26EndUpTest() {
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
     String test = "holy cow";
     String result = testObj.endUp(test);
     Assert.assertEquals("holy COW", result);
     }
         
     @Test
     public void oneLetter() {
     String test = "x";
     String result = testObj.endUp(test);
     Assert.assertEquals("X", result);
     }
         
     @Test
     public void threeLetters() {
     String test = "wow";
     String result = testObj.endUp(test);
     Assert.assertEquals("WOW", result);
     }
         
     @Test
     public void someCaps() {
     String test = "Bob";
     String result = testObj.endUp(test);
     Assert.assertEquals("BOB", result);
     }
         
     @Test
     public void Kate() {
     String test = "Kate";
     String result = testObj.endUp(test);
     Assert.assertEquals("KATE", result);
     }
         
     @Test
     public void numbers() {
     String test = "1234";
     String result = testObj.endUp(test);
     Assert.assertEquals("1234", result);
     }
}
