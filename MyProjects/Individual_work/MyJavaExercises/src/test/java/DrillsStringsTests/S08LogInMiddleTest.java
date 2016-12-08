/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S08LongInMiddle;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author apprentice
 */
public class S08LogInMiddleTest {
    
    S08LongInMiddle testObj = new S08LongInMiddle();
    
    public S08LogInMiddleTest() {
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
     String a = "ya ";
     String b = "Boi ";
     String result = testObj.longInMiddle(a, b);
     String expect = "ya Boi ya ";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void numbers() {
     String a = "1";
     String b = "20";
     String result = testObj.longInMiddle(a, b);
     String expect = "1201";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void empty() {
     String a = "";
     String b = "Boi";
     String result = testObj.longInMiddle(a, b);
     String expect = "Boi";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void aLonger() {
     String a = "aw";
     String b = "l";
     String result = testObj.longInMiddle(a, b);
     String expect = "lawl";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void bEmpty() {
     String a = "sup";
     String b = "";
     String result = testObj.longInMiddle(a, b);
     String expect = "sup";
     Assert.assertEquals(expect, result);
     }
}
