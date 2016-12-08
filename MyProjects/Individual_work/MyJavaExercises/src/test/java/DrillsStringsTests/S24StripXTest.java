/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrillsStringsTests;

import DrillsStrings.S24StripX;
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
public class S24StripXTest {
    
    S24StripX testObj = new S24StripX();
    
    public S24StripXTest() {
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
     public void simpleRemove() {
     String test = "xRemove";
     String expect = "Remove";
     String result = testObj.stripX(test);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void endRemove() {
     String test = "Removex";
     String expect = "Remove";
     String result = testObj.stripX(test);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void capitals() {
     String test = "XRemoveX";
     String expect = "Remove";
     String result = testObj.stripX(test);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void middleX() {
     String test = "xRemxove";
     String expect = "Remxove";
     String result = testObj.stripX(test);
     Assert.assertEquals(expect, result);
     }
     
     @Test
     public void allX() {
     String test = "xXx";
     String expect = "X";
     String result = testObj.stripX(test);
     Assert.assertEquals(expect, result);
     }
     
}
