/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S13EndsWithLy;
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
public class S13EndsWithLyTest {
    
    S13EndsWithLy testObj = new S13EndsWithLy();
    
    public S13EndsWithLyTest() {
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
     String str = "testily";
     boolean result = testObj.endsWithLy(str);
     Assert.assertTrue(result);
     }
         
     @Test
     public void simpleFalse() {
     String str = "derp";
     boolean result = testObj.endsWithLy(str);
     Assert.assertFalse(result);
     }
         
     @Test
     public void capital() {
     String str = "UppercaseLY";
     boolean result = testObj.endsWithLy(str);
     Assert.assertTrue(result);
     }
         
     @Test
     public void lyAtBegin() {
     String str = "Lying";
     boolean result = testObj.endsWithLy(str);
     Assert.assertFalse(result);
     }
         
     @Test
     public void spreadTheLY() {
     String str = "lucky";
     boolean result = testObj.endsWithLy(str);
     Assert.assertFalse(result);
     }
         
     @Test
     public void numbers() {
     String str = "1234";
     boolean result = testObj.endsWithLy(str);
     Assert.assertFalse(result);
     }
}
