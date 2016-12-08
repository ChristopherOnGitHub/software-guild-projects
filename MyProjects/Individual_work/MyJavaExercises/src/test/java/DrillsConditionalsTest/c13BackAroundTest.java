/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsConditionalsTest;

import DrillsConditionals.c13BackAround;
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
public class c13BackAroundTest {
    
    c13BackAround testObj = new c13BackAround();
    
    public c13BackAroundTest() {
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
     String str ="abc";
     String expect = "cabcc";
     String result = testObj.backAround(str);
     Assert.assertEquals(expect, result);
     }
     
          @Test
     public void twoLetters() {
     String str ="ab";
     String expect = "babb";
     String result = testObj.backAround(str);
     Assert.assertEquals(expect, result);
     }
     
          @Test
     public void oneLetter() {
     String str ="a";
     String expect = "aaa";
     String result = testObj.backAround(str);
     Assert.assertEquals(expect, result);
     }
     
          @Test
     public void empty() {
     String str ="  ";
     String expect = "    ";
     String result = testObj.backAround(str);
     Assert.assertEquals(expect, result);
     }
     
          @Test
     public void numbers() {
     String str ="12345";
     String expect = "5123455";
     String result = testObj.backAround(str);
     Assert.assertEquals(expect, result);
     }
}
