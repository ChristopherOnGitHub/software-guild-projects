/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S23TweakFront;
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
public class S23TweakFrontTest {
    
    S23TweakFront testObj = new S23TweakFront();
    
    public S23TweakFrontTest() {
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
     public void simpleRemove() {
     String test = "abdominals";
     String expect = "abdominals";
     String result = testObj.tweakFront(test);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void justA() {
     String test = "alaska";
     String expect = "aaska";
     String result = testObj.tweakFront(test);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void justB() {
     String test = "oboe";
     String expect = "boe";
     String result = testObj.tweakFront(test);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void noRemoves() {
     String test = "GLORIOUS!";
     String expect = "ORIOUS!";
     String result = testObj.tweakFront(test);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void capitalA(){
     String test = "Antarctica";
     String expect = "Atarctica";
     String result = testObj.tweakFront(test);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void capitalB() {
     String test = "IBM";
     String expect = "BM";
     String result = testObj.tweakFront(test);
     Assert.assertEquals(expect, result);
     }
}
