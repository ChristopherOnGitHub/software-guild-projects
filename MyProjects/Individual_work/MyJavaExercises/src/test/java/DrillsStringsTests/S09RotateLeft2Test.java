/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S09RotateLeft2;
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
public class S09RotateLeft2Test {
    
    S09RotateLeft2 testObj = new S09RotateLeft2();
    
    public S09RotateLeft2Test() {
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
     String x = "simple test";
     String result = testObj.rotateLeft2(x);
     String expect = "mple testsi";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void numbers() {
     String x = "12me";
     String result = testObj.rotateLeft2(x);
     String expect = "me12";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void twoLetters() {
     String x = "uh";
     String result = testObj.rotateLeft2(x);
     String expect = "uh";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void spaces() {
     String x = " I dont know ";
     String result = testObj.rotateLeft2(x);
     String expect = " dont know  I";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void RunningOutOfIdeas() {
     String x = "out of ideas";
     String result = testObj.rotateLeft2(x);
     String expect = "t of ideasou";
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void moveNumbers() {
     String x = "1a2b";
     String result = testObj.rotateLeft2(x);
     String expect = "2b1a";
     Assert.assertEquals(expect, result);
     }
}
