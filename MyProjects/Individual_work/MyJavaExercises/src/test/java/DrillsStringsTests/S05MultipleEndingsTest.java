/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S05MultipleEndings;
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
public class S05MultipleEndingsTest {
    
    S05MultipleEndings testObj = new S05MultipleEndings();
    
    public S05MultipleEndingsTest() {
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
     String str = "xyz";
     String result = testObj.multipleEndings(str);
     String expect = "yzyzyz";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void twoLetters() {
     String str = "yz";
     String result = testObj.multipleEndings(str);
     String expect = "yzyzyz";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void nameIGuess() {
     String str = "Chris";
     String result = testObj.multipleEndings(str);
     String expect = "isisis";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void numbers() {
     String str = "123";
     String result = testObj.multipleEndings(str);
     String expect = "232323";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void sentence() {
     String str = "Man I don't know, just making up a sentence I guess.";
     String result = testObj.multipleEndings(str);
     String expect = "s.s.s.";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void spaces() {
     String str = "  ";
     String result = testObj.multipleEndings(str);
     String expect = "      ";
     Assert.assertEquals(expect, result);
     }
}
