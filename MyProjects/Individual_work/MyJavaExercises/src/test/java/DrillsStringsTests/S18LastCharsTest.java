/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S18LastChars;
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
public class S18LastCharsTest {
    
    S18LastChars testObj = new S18LastChars();
    
    public S18LastCharsTest() {
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
     String a = "abc";
     String b = "123";
     String expect = "a3";
     String result = testObj.lastChars(a, b);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void emptys() {
     String a = "";
     String b = "";
     String expect = "@@";
     String result = testObj.lastChars(a, b);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void firstEmpty() {
     String a = "";
     String b = "123";
     String expect = "@3";
     String result = testObj.lastChars(a, b);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void secondEmpty() {
     String a = "abc";
     String b = "";
     String expect = "a@";
     String result = testObj.lastChars(a, b);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void fakeOut() {
     String a = "@@";
     String b = "@@";
     String expect = "@@";
     String result = testObj.lastChars(a, b);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void longIdk() {
     String a = "abcasdfibasoiuge";
     String b = "123aiugasefioue";
     String expect = "ae";
     String result = testObj.lastChars(a, b);
     Assert.assertEquals(expect, result);
     }
}
