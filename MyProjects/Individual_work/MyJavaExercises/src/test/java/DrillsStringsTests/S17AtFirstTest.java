/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S17AtFirst;
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
public class S17AtFirstTest {
    
    S17AtFirst testObj = new S17AtFirst();
    
    public S17AtFirstTest() {
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
     String x = "test";
     String result = testObj.atFirst(x);
     String expect = "te";
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void empty() {
     String x = "";
     String result = testObj.atFirst(x);
     String expect = "@@";
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void oneLetter() {
     String x = "x";
     String result = testObj.atFirst(x);
     String expect = "x@";
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void justTwo() {
     String x = "hi";
     String result = testObj.atFirst(x);
     String expect = "hi";
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void idkman() {
     String x = "idkman";
     String result = testObj.atFirst(x);
     String expect = "id";
     Assert.assertEquals(expect, result);
     }
}
