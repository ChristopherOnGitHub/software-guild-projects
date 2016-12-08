/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S10RotateRight2;
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
public class S10RotateRight2Test {
    
    S10RotateRight2 testObj = new S10RotateRight2();
    
    public S10RotateRight2Test() {
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
     String x = "Hello";
     String expect = "loHel";
     String result = testObj.rotateReft2(x);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void numbers() {
     String x = "12345";
     String expect = "45123";
     String result = testObj.rotateReft2(x);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void ipsum() {
     String x = "ipsum";
     String expect = "umips";
     String result = testObj.rotateReft2(x);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void spacey() {
     String x = "I dont know";
     String expect = "owI dont kn";
     String result = testObj.rotateReft2(x);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void sushi() {
     String x = "sushi";
     String expect = "hisus";
     String result = testObj.rotateReft2(x);
     Assert.assertEquals(expect, result);
     }
     
}
