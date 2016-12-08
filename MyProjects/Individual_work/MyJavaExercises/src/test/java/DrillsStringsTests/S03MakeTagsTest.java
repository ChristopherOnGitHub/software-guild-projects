/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S03MakeTags;
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
public class S03MakeTagsTest {
    
    S03MakeTags testObj = new S03MakeTags();
    
    public S03MakeTagsTest() {
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
     String tag = "h1";
     String content = "Hello World!";
     String expect = "<h1>Hello World!</h1>";
     String result = testObj.makeTags(tag, content);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void moreTest() {
     String tag = "p";
     String content = "Hello World!";
     String expect = "<p>Hello World!</p>";
     String result = testObj.makeTags(tag, content);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void numbers() {
     String tag = "b";
     String content = "12345";
     String expect = "<b>12345</b>";
     String result = testObj.makeTags(tag, content);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void notEvenAThing() {
     String tag = "12";
     String content = "derp";
     String expect = "<12>derp</12>";
     String result = testObj.makeTags(tag, content);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void spaces() {
     String tag = " ";
     String content = " ";
     String expect = "< > </ >";
     String result = testObj.makeTags(tag, content);
     Assert.assertEquals(expect, result);
     }
}
