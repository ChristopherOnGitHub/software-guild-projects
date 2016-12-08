/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S15TakeTwoFromPosition;
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
public class S15TakeTwoFromPositionTest {
    
    S15TakeTwoFromPosition testObj = new S15TakeTwoFromPosition();
    
    public S15TakeTwoFromPositionTest() {
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
     String x = "amazing";
     int y = 3;
     String expect = "zi";
     String result = testObj.takeTwoFromPosition(x, y);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void outOfBounds() {
     String x = "he";
     int y = 3;
     String expect = "he";
     String result = testObj.takeTwoFromPosition(x, y);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void lastLetter() {
     String x = "asdf";
     int y = 3;
     String expect = "as";
     String result = testObj.takeTwoFromPosition(x, y);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void numbers() {
     String x = "123456789";
     int y = 4;
     String expect = "56";
     String result = testObj.takeTwoFromPosition(x, y);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void derp() {
     String x = "derp";
     int y = 3;
     String expect = "de";
     String result = testObj.takeTwoFromPosition(x, y);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void spaces() {
     String x = "amazing  ";
     int y = 7;
     String expect = "  ";
     String result = testObj.takeTwoFromPosition(x, y);
     Assert.assertEquals(expect, result);
     }
}
