/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S11TakeOne;
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
public class S11TakeOneTest {
    
    S11TakeOne testObj = new S11TakeOne();
    
    public S11TakeOneTest() {
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
     boolean front = true;
     String x = "xyz";
     String expect = "x";
     String result = testObj.takeOne(x, front);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void numbers() {
     boolean front = true;
     String x = "123";
     String expect = "1";
     String result = testObj.takeOne(x, front);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void end() {
     boolean front = false;
     String x = "xyz";
     String expect = "z";
     String result = testObj.takeOne(x, front);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void oneLetter() {
     boolean front = true;
     String x = "z";
     String expect = "z";
     String result = testObj.takeOne(x, front);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void oneLetterEnd() {
     boolean front = false;
     String x = "z";
     String expect = "z";
     String result = testObj.takeOne(x, front);
     Assert.assertEquals(expect, result);
     }
         
     @Test
     public void superLong() {
     boolean front = false;
     String x = "Bruh, I'm forreal about to write a super long sentence just to get a 'x'";
     String expect = "'";
     String result = testObj.takeOne(x, front);
     Assert.assertEquals(expect, result);
     }
}
