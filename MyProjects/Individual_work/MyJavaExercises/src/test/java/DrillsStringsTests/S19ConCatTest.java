/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S19ConCat;
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
public class S19ConCatTest {
    
    S19ConCat testObj = new S19ConCat();
    
    public S19ConCatTest() {
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
     String x = "abc";
     String y = "cat";
     String expect = "abcat";
     String result = testObj.conCat(x, y);
     Assert.assertEquals(expect, result);
     }
     
     
     @Test
     public void numbers() {
     String x = "abc1";
     String y = "1cat";
     String expect = "abc1cat";
     String result = testObj.conCat(x, y);
     Assert.assertEquals(expect, result);
     }
     
     
     @Test
     public void noMatch() {
     String x = "hello";
     String y = "cat";
     String expect = "hellocat";
     String result = testObj.conCat(x, y);
     Assert.assertEquals(expect, result);
     }
     
     
     @Test
     public void oneLetter() {
     String x = "z";
     String y = "z";
     String expect = "z";
     String result = testObj.conCat(x, y);
     Assert.assertEquals(expect, result);
     }
     
     
     @Test
     public void empty() {
     String x = "abc";
     String y = "";
     String expect = "abc";
     String result = testObj.conCat(x, y);
     Assert.assertEquals(expect, result);
     }
}
