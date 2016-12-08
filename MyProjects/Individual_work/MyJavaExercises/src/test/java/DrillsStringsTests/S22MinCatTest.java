/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S22MinCat;
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
public class S22MinCatTest {
    
    S22MinCat testObj = new S22MinCat();
    
    public S22MinCatTest() {
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
     public void simple() {
     String a = "xxxx";
     String b = "zz";
     String expect = "xxzz";
     String result = testObj.minCat(a, b);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void bLonger() {
     String a = "xx";
     String b = "zzzz";
     String expect = "xxzz";
     String result = testObj.minCat(a, b);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void empty() {
     String a = "";
     String b = "ABC";
     String expect = "";
     String result = testObj.minCat(a, b);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void sameLength() {
     String a = "xxxx";
     String b = "zzzz";
     String expect = "xxxxzzzz";
     String result = testObj.minCat(a, b);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void numbers() {
     String a = "12345";
     String b = "123";
     String expect = "345123";
     String result = testObj.minCat(a, b);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void justOne() {
     String a = "x";
     String b = "";
     String expect = "";
     String result = testObj.minCat(a, b);
     Assert.assertEquals(expect, result);
     }
}
